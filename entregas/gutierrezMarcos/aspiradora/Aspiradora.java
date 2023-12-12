public class Aspiradora {
    public static void main(String[] args) {

        int[][] office = new int[10][25];
        for (int fila = 0; fila <= 9; fila++) {
            for (int columna = 0; columna <= 24; columna++) {
                office[fila][columna] = nivelSuciedad();
            }
        }

        int aspiradoraX = 6;
        int aspiradoraY = 10;

        for (int i = 1; i <= 20; i++) {

            if (Math.random() < 0.7)
                aspiradoraY = aspiradoraY + (Math.random() < 0.5 ? 1 : -1);
            if (Math.random() < 0.2)
                aspiradoraX = aspiradoraX + (Math.random() < 0.5 ? 1 : -1);

            if (office[aspiradoraX][aspiradoraY] > 0) {
                office[aspiradoraX][aspiradoraY]--;
            }

            renderWorld(office, aspiradoraX, aspiradoraY);
            pause(1);
            System.out.println("Tiempo = " + i);
        }

    }

    private static void renderWorld(int[][] world, int xVacuum, int yVacuum) {
        final int VACUUM_TILE = 6;
        cleanScreen();
        for (int row = 0; row < world.length; row++) {
            for (int column = 0; column < world[row].length; column++) {
                if (row == xVacuum && column == yVacuum) {
                    System.out.print(showTile(VACUUM_TILE));
                } else {
                    System.out.print(showTile(world[row][column]));
                }
            }
            System.out.println();
        }
        System.out.println("Aspiradora en [" + xVacuum + "][" + yVacuum + "] / Suciedad detectada "
                + showTile(world[xVacuum][yVacuum]));
    }

    private static String showTile(int tile) {
        String[] tiles = { " . ", "...", "ooo", "OOO", "XXX", "***", "(O)" };
        return tiles[tile];
    }

    private static int nivelSuciedad() {
        if (Math.random() < 0.2) {
            return (int) (Math.random() * 5) + 1;
        }
        return 0;
    }

    static void cleanScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    static void pause(int segundos) {
        try {
            Thread.sleep(1000 * segundos);
        } catch (InterruptedException e) {
        }
    }

}
