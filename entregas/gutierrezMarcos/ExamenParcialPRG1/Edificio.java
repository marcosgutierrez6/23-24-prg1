package ExamenParcialPRG1;

public class Edificio {
    public static void main(String[] args) {
        String estadisticaLuz = "ESTADISTICAS: ";
        for (int dia = 1; dia <= 7; dia++) {
            int horasLuzDia = 0;

            boolean mantenimiento = Math.random() < 0.05;
            int plantaMantenimiento = (int) (Math.random() * 7) + 1;

            boolean rayo = Math.random() < 0.2;
            int columnaImpactada = (int) (Math.random() * 6) + 1;
            for (int horas = 1; horas <= 24; horas++) {
                int horasLuz = 0;
                System.out.println("Dia " + dia);
                System.out.println("> Son las " + horas);

                for (int planta = 7; planta >= 1; planta--) {
                    for (int ventana = 1; ventana <= 6; ventana++) {
                        if (rayo && ventana == columnaImpactada) {
                            System.out.print("[X]");
                        } else if (mantenimiento && planta == plantaMantenimiento) {
                            System.out.print("[#]");
                        } else {
                            boolean estaAbierta = Math.random() > 0.7;
                            boolean luzEncendida = Math.random() > 0.6;
                            horasLuz = horasLuz + (luzEncendida ? 1 : 0);
                            String laVentana = verVentana(estaAbierta, luzEncendida);
                            System.out.print(laVentana);
                        }
                    }
                    System.out.println();
                }
                horasLuzDia = horasLuzDia + horasLuz;
                System.out.println("Horas luz: " + horasLuz);
                System.out.println(estadisticaLuz);

            }
            estadisticaLuz = estadisticaLuz + "Dia [" + dia + "] consumo [" + horasLuzDia + "] - ";
        }

    }

    private static String verVentana(boolean estaAbierta, boolean luzEncendida) {
        if (!estaAbierta) {
            return "[ ]";
        } else if (luzEncendida) {
            return "[*]";
        }

        return "[']";
    }

}
