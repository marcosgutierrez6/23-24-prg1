public class escala {
    static final String[] NOTAS = { "Do", "Do#", "Re", "Re#", "Mi", "Fa", "Fa#", "Sol", "Sol#", "La", "La#", "Si" };

    public static void main(String[] args) {
        String[] escalaMayor;

        escalaMayor = escalaMayor("Do");
        mostrarNotas(escalaMayor);
    }


    private static String[] escalaMayor(String nota){
        String[] patrones = {"T", "T", "S", "T", "T", "T", "S"};
        String[] escala = new String[8];
        int indiceNota = obtenerIndice(nota);

        for (int i = 0;i < escala.length; i++){
            escala[i] = obtenerNota((indiceNota) % 12);
            if (i < 7){
                if (patrones[i].equals("T")){
                    indiceNota += 2;
                }else{
                    indiceNota++;
                }
            }
        }
        return escala;
    }


    private static int obtenerIndice(String nota) {
        int i;
        for (i = 0; i < NOTAS.length; i++) {
            if (NOTAS[i].equalsIgnoreCase(nota)) {
                break;
            }
        }
        return i;
    }

    private static void mostrarNotas(String[] notasPorImprimir) {
        for (int unaNota = 0; unaNota < notasPorImprimir.length; unaNota++) {
            System.out.println(notasPorImprimir[unaNota]);
        }
    }

    private static String obtenerNota(int indice) {
        return NOTAS[indice];
    }
}
