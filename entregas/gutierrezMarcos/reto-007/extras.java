import java.util.Scanner;

class Extras {
    private static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);

        int clima;
        double metrosBaja;
        int probabilidadLLuvia = (int) (Math.random() * 100);

        int coche;
        int probabilidadCoche = (int) (Math.random() * 100);

        if (probabilidadCoche <= 35) {
            metrosBaja = (int) (Math.random() * 20);
            metrosBaja = metrosBaja / 10;
            coche = 1;

        }
        else{
            metrosBaja = 0;
            coche = 0;
        }


        if (probabilidadLLuvia <= 5) {
            clima = 2;
            metrosBaja = (int) (Math.random() * 50);
            metrosBaja = metrosBaja / 10;

        } else if (probabilidadLLuvia <= 10 && probabilidadLLuvia > 5) {
            clima = 1;
            metrosBaja = (int) (Math.random() * 20);
            metrosBaja = metrosBaja / 10;
        } else {
            clima = 0;
        }


    }
}
