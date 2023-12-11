public class Aspiradora {
    private static int filas = 25;
    private static int columnas = 10;
    private static String[][] matriz = new String[filas][columnas];
    private static int posicionX;
    private static int posicionY;

    public static void main(String[] args) {
        inicializarMapa();
        mapa();

    }

    private static void inicializarMapa() {
        for (int fila = 0; fila < filas; fila++) {
            for (int columna = 0; columna < columnas; columna++) {
                matriz[0][columna] = "-";
                matriz[fila][0] = "|";
                if (suciedad()) {
                    if (nivelSuciedad() == 1) {
                        matriz[fila][columna] = "...";
                    } else if (nivelSuciedad() == 2) {
                        matriz[fila][columna] = "ooo";
                    } else if (nivelSuciedad() == 3) {
                        matriz[fila][columna] = "OOO";
                    } else if (nivelSuciedad() == 4) {
                        matriz[fila][columna] = "***";
                    } else {
                        matriz[fila][columna] = " . ";
                    }
                } else {
                    matriz[fila][columna] = " . ";
                }

                matriz[fila][9] = "|";
                matriz[24][columna] = "-";
                matriz[0][0] = "+";
                matriz[0][9] = "+";
                matriz[24][0] = "+";
                matriz[24][9] = "+";
            }
        }
        matriz[posAspiradoraY()][posAspiradoraX()] = "(0)";
    }

    private static void mapa() {
        

        for (int fila = 0; fila < filas; fila++) {
            for (int columna = 0; columna < columnas; columna++) {
                System.out.print(matriz[fila][columna] + "\t");
            }
            System.out.println();
        }
    }

    private static boolean suciedad() {
        return Math.random() * 100 < 25;
    }

    private static int nivelSuciedad() {
        return (int) Math.round(Math.random() * 3 + 1);
    }

    private static int posAspiradoraX() {
        int x;
        do {
            x = (int) (Math.random() * 10);
        } while (x == 0 || x == 10 - 1);
        return x;
    }

    private static int posAspiradoraY() {
        int y;
        do {
            y = (int) (Math.random() * 25);
        } while (y == 0 || y == 25 - 1);
        return y;
    }

}
