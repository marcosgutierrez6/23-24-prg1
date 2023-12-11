public class Aspiradora {
    private static int filas = 25;
    private static int columnas = 10;
    private static String[][] matriz = new String[filas][columnas];
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
        moverAspiradora();
        
    }

    private static void moverAspiradora() {
        int posicionInicialX = posAspiradoraXInicial();
        int posicionInicialY = posAspiradoraYInicial();
        matriz[posicionInicialY][posicionInicialX] = "(0)";

        int direccion = (int) (Math.random() * 8) + 1;

        if (direccion == 1) {
            arriba(posicionInicialY, posicionInicialX);
        } else if (direccion == 2) {
            abajo(posicionInicialY, posicionInicialX);
        } else if (direccion == 3) {
            derecha(posicionInicialY, posicionInicialX);
        } else if (direccion == 4) {
            izquierda(posicionInicialY, posicionInicialX);
        } else if (direccion == 5) {
            arribaDerecha(posicionInicialY, posicionInicialX);
        } else if (direccion == 6) {
            arribaIzquierda(posicionInicialY, posicionInicialX);
        } else if (direccion == 7) {
            abajoDerecha(posicionInicialY, posicionInicialX);
        } else if (direccion == 8) {
            abajoIzquierda(posicionInicialY, posicionInicialX);
        }
    }

    private static void arriba(int y, int x) {
        y -= 1;
        matriz[y][x] = "(0)";
    }

    private static void abajo(int y, int x) {
        y += 1;
        matriz[y][x] = "(0)";
    }

    private static void derecha(int y, int x) {
        x += 1;
        matriz[y][x] = "(0)";
    }

    private static void izquierda(int y, int x) {
        x -= 1;
        matriz[y][x] = "(0)";
    }

    private static void arribaDerecha(int y, int x) {
        y -= 1;
        x += 1;
        matriz[y][x] = "(0)";
    }

    private static void abajoDerecha(int y, int x) {
        y += 1;
        x += 1;
        matriz[y][x] = "(0)";
    }

    private static void abajoIzquierda(int y, int x) {
        y += 1;
        x -= 1;
        matriz[y][x] = "(0)";
    }

    private static void arribaIzquierda(int y, int x) {
        y -= 1;
        x -= 1;
        matriz[y][x] = "(0)";
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

    private static int posAspiradoraXInicial() {
        int x;
        do {
            x = (int) (Math.random() * 10);
        } while (x == 0 || x == 10 - 1);
        return x;
    }

    private static int posAspiradoraYInicial() {
        int y;
        do {
            y = (int) (Math.random() * 25);
        } while (y == 0 || y == 25 - 1);
        return y;
    }

}
