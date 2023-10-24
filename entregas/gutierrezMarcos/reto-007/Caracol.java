import java.util.Scanner;
import java.lang.Math;

class Caracol {
    private static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);

        int dia = 1;
        double profundidadCaracol = 13;
        double metrosBaja = 0;
        double metrosSube = 0;
        int profundidadPozo = 20;
        int lluviaFuerte = 0;
        int lluviaDebil = 0;
        double alturaFinal = 0;
        int coche = 0;


        System.out.println("[__]              [__]\r\n" + //
                "  []:. :. :. :. :.[] _ __ 0\r\n" + //
                "  []:. :. :. :. :.[] _ __ 1\r\n" + //
                "  []:. :. :. :. :.[] _ __ 2\r\n" + //
                "  []:. :. :. :. :.[] _ __ 3\r\n" + //
                "  []:. :. :. :. :.[] _ __ 4\r\n" + //
                "  []:. :. :. :. :.[] _ __ 5\r\n" + //
                "  []:. :. :. :. :.[] _ __ 6\r\n" + //
                "  []:. :. :. :. :.[] _ __ 7\r\n" + //
                "  []:. :. :. :. :.[] _ __ 8\r\n" + //
                "  []:. :. :. :. :.[] _ __ 9\r\n" + //
                "  []:. :. :. :. :.[] _ __ 10\r\n" + //
                "  []:. :. :. :. :.[] _ __ 11\r\n" + //
                "  []:. :. :. :. :.[] _ __ 12\r\n" + //
                "  []    _@)_/’    [] _ __ 13\r\n" + //
                "  []:. :. :. :. :.[] _ __ 14\r\n" + //
                "  []:. :. :. :. :.[] _ __ 15\r\n" + //
                "  []:. :. :. :. :.[] _ __ 16\r\n" + //
                "  []:. :. :. :. :.[] _ __ 17\r\n" + //
                "  []:. :. :. :. :.[] _ __ 18\r\n" + //
                "  []:. :. :. :. :.[] _ __ 19\r\n" + //
                "  []~~~~~~~~~~~~~~[] _ __ 20\r\n" + //
                "  [][][][][][][][][] ");
        int diaSiguiente = scanner.nextInt();

        for (int j = 1; j <= 50; j++) {
            dia = j;
            lluviaDebil = 0;
            lluviaFuerte = 0;
            coche = 0;

            int probabilidadLLuvia = (int)(Math.random() *100);
            if (probabilidadLLuvia <= 5){
                profundidadPozo = profundidadPozo - 5;
                lluviaFuerte++;

                metrosBaja = (int) (Math.random() * 20 + 1);
                metrosBaja = metrosBaja / 10;
                metrosBaja = metrosBaja + 5;
            }
            else if (probabilidadLLuvia < 10 && probabilidadLLuvia > 5){
                profundidadPozo = profundidadPozo - 2;
                lluviaDebil++;

                metrosBaja = (int) (Math.random() * 20 + 1);
                metrosBaja = metrosBaja / 10;
                metrosBaja = metrosBaja + 2;
            }
            else{
                metrosBaja = (int) (Math.random() * 20 + 1);
                metrosBaja = metrosBaja / 10;
            }

            int probabilidadCoche = (int)(Math.random() *100);
            if (probabilidadCoche < 20){
                profundidadPozo = profundidadPozo - 2;

                metrosBaja = (int) (Math.random() * 20 + 1);
                metrosBaja = metrosBaja / 10;
                metrosBaja = metrosBaja + 2;
                coche = 1;
            }





            metrosSube = (int) (Math.random() * 40) + 10;
            metrosSube = metrosSube / 10;

            alturaFinal = metrosSube - metrosBaja;

            System.out.println("Día [" + dia + "] / Sube: [" + metrosSube + "] / Baja[" + metrosBaja + "] / Altura al final del día: [" + alturaFinal + "]");

            if (lluviaFuerte == 1){
                System.out.println("Ha habido una lluvia fuerte");
            }
            else if (lluviaDebil == 1){
                System.out.println("Ha habido una lluvia debil");
            }
            if (coche == 1){
                System.out.println("Ha pasado un coche");
            }

            System.out.println("[__]              [__]");
            for (int i = 0; i <= 20; i++) {
                if (dia == 1) {
                    if (i == 13) {
                        System.out.println("[]    _@)_/’    [] _ __ " + i);
                        i++;
                    }
                    if (i == 20) {
                        System.out.println("[]~~~~~~~~~~~~~~[] _ __ " + i);
                        break;
                    }
                }
                System.out.println("[]:. :. :. :. :.[] _ __ " + i);

            }
            System.out.println("[][][][][][][][][] ");
            diaSiguiente = scanner.nextInt();
        }

    }

}
