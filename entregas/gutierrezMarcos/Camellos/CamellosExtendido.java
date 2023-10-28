import java.util.Scanner;

class CamellosExtendido {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int agujero1 = 60;
        int agujero2 = 40;
        int agujero3 = 30;
        int agujero4 = 10;
        int probabilidad = 0;
        int casilla = 0;
        int avance = 0;
        boolean jugando = true;
        int turno = 0;
        String casillasAvanzadas = " ";
        boolean acierto = false;
        int fallos = 0;

        while (jugando) {
            turno++;
            if (fallos == 3){
                casilla = 0;
                casillasAvanzadas = " ";
            }

            System.out.println(
                    "---+-----------+---------+---------+---------+---------+-----------+-----------+-----------+-----------+-----------+-----------+");
            System.out.println(
                    "---| 0...................1...................2...................3...................4...................5...................6 |");
            System.out.println(
                    "---| 0 1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9 0 |");
            System.out.println(
                    "---+-----------+---------+---------+---------+---------+-----------+-----------+-----------+-----------+-----------+-----------+");
            if (acierto == true) {
                for (int i = 0; i < avance; i++) {
                    casillasAvanzadas = casillasAvanzadas + "  ";
                }
            }
            System.out.println("[J]|" + casillasAvanzadas + ";--;'");

            System.out.println(
                    "---+-----------+---------+---------+---------+---------+-----------+-----------+-----------+-----------+-----------+-----------+");

            if (turno == 1) {
                System.out.println("Turno " + turno);
            } else {
                System.out.println(
                        "Turno " + turno + " - Avanza " + avance + " casillas - Está en la casilla " + casilla);
            }

            System.out.println("Elija un agujero: ");

            int elección = scanner.nextInt();
            probabilidad = (int) (Math.random() * 100);
            if (probabilidad>70 && probabilidad<80){
                turno = turno + 1;
            }
            if (elección == 1) {
                if (probabilidad <= 60) {
                    casilla = casilla + 1;
                    avance = 1;
                    acierto = true;
                    fallos = 0;
                } else {
                    acierto = false;
                    avance = 0;
                    fallos++;
                }

            } else if (elección == 2) {
                if (probabilidad <= 40) {
                    casilla = casilla + 2;
                    avance = 2;
                    acierto = true;
                    fallos = 0;
                } else {
                    acierto = false;
                    avance = 0;
                    fallos++;
                }

            } else if (elección == 3) {
                if (probabilidad <= 30) {
                    casilla = casilla + 4;
                    avance = 4;
                    acierto = true;
                    fallos = 0;
                } else {
                    acierto = false;
                    avance = 0;
                    fallos++;
                }

            } else if (elección == 4) {
                if (probabilidad <= 10) {
                    casilla = casilla + 6;
                    avance = 6;
                    acierto = true;
                    fallos = 0;
                } else {
                    acierto = false;
                    avance = 0;
                    fallos++;
                }
            }
            if (casilla > 60 || turno == 50) {
                jugando = false;
                break;
            }
        }
    }
}
