public class Aspiradora2 {
    private static int filas = 25;
    private static int columnas = 10;
    private static int[][] matriz = new int[filas][columnas];
    private static int posicionX;
    private static int posicionY;

    public static void main(String[] args) {
        inicializarMapa();
        moverAspiradora();
    }

    private static void inicializarMapa() {
        for (int fila = 0; fila < filas; fila++) {
            for (int columna = 0; columna < columnas; columna++) {
                matriz[fila][columna] = 0;
            }
        }
    }

    private static void mapa() {
        for (int fila = 0; fila < filas; fila++) {
            for (int columna = 0; columna < columnas; columna++) {
                if (fila == 0 || columna == 0 || fila == filas - 1 || columna == columnas - 1) {
                    System.out.print("+\t");
                } else if (matriz[fila][columna] == 0) {
                    if (suciedad()) {
                        if (nivelSuciedad() == 1) {
                            System.out.print("...\t");
                        } else if (nivelSuciedad() == 2) {
                            System.out.print("ooo\t");
                        } else if (nivelSuciedad() == 3) {
                            System.out.print("OOO\t");
                        } else if (nivelSuciedad() == 4) {
                            System.out.print("***\t");
                        } else {
                            System.out.print(".\t");
                        }
                    } else {
                        System.out.print(".\t");
                    }
                } else if (matriz[fila][columna] == 1) {
                    System.out.print("(0)\t");
                } else {
                    System.out.print(matriz[fila][columna] + "\t");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void moverArriba() {
        if (posicionY > 1) {
            matriz[posicionY][posicionX] = 0;
            matriz[--posicionY][posicionX] = 1;
        }
    }

    private static void moverAbajo() {
        if (posicionY < filas - 2) {
            matriz[posicionY][posicionX] = 0;
            matriz[++posicionY][posicionX] = 1;
        }
    }

    private static void moverIzquierda() {
        if (posicionX > 1) {
            matriz[posicionY][posicionX] = 0;
            matriz[posicionY][--posicionX] = 1;
        }
    }

    private static void moverDerecha() {
        if (posicionX < columnas - 2) {
            matriz[posicionY][posicionX] = 0;
            matriz[posicionY][++posicionX] = 1;
        }
    }

    private static void moverArribaIzquierda() {
        if (posicionY > 1 && posicionX > 1) {
            matriz[posicionY][posicionX] = 0;
            matriz[--posicionY][--posicionX] = 1;
        }
    }

    private static void moverArribaDerecha() {
        if (posicionY > 1 && posicionX < columnas - 2) {
            matriz[posicionY][posicionX] = 0;
            matriz[--posicionY][++posicionX] = 1;
        }
    }

    private static void moverAbajoIzquierda() {
        if (posicionY < filas - 2 && posicionX > 1) {
            matriz[posicionY][posicionX] = 0;
            matriz[++posicionY][--posicionX] = 1;
        }
    }

    private static void moverAbajoDerecha() {
        if (posicionY < filas - 2 && posicionX < columnas - 2) {
            matriz[posicionY][posicionX] = 0;
            matriz[++posicionY][++posicionX] = 1;
        }
    }

    private static void moverAspiradora() {
        posicionX = posAspiradoraX();
        posicionY = posAspiradoraY();
        matriz[posicionY][posicionX] = 1;

        for (int i = 0; i < 10; i++) {
            int direccion = (int) (Math.random() * 8) + 1;
            switch (direccion) {
                case 1:
                    moverArriba();
                    break;
                case 2:
                    moverAbajo();
                    break;
                case 3:
                    moverIzquierda();
                    break;
                case 4:
                    moverDerecha();
                    break;
                case 5:
                    moverArribaIzquierda();
                    break;
                case 6:
                    moverArribaDerecha();
                    break;
                case 7:
                    moverAbajoIzquierda();
                    break;
                case 8:
                    moverAbajoDerecha();
                    break;
            }
            mapa();
            try {
                Thread.sleep(500); // Espera 500 milisegundos entre movimientos
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
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
            x = (int) (Math.random() * (columnas - 2)) + 1;
        } while (x == 0 || x == columnas - 1);
        return x;
    }

    private static int posAspiradoraY() {
        int y;
        do {
            y = (int) (Math.random() * (filas - 2)) + 1;
        } while (y == 0 || y == filas - 1);
        return y;
    }
}
