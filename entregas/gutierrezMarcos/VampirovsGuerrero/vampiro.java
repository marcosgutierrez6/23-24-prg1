import java.util.Scanner;

class vampiro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int eleccion = 0;
        int vidaVampiro = 60;
        int vidaGuerrero = 150;
        int ataqueVampiro = 4;
        int ataqueGuerrero = 2;
        int energiaGuerrero = 150;
        int energiaVampiro = 60;
        int armaVampiro = 0;
        int probabilidadAtaqueGuerrero = 0;
        int probabilidadAtaqueVampiro = 0;
        boolean guerreroVivo = true;
        boolean vampiroVivo = true;

        while (vampiroVivo && guerreroVivo) {
            if (vidaVampiro <= 0) {
                System.out.println("El vampiro ha muerto");
                vampiroVivo = false;
                break;
            }
            if (vidaGuerrero <= 0) {
                System.out.println("El Guerrero ha muerto");
                guerreroVivo = false;
                break;
            }

            armaVampiro = (int) (Math.random() * 3);
            eleccion = scanner.nextInt();

            if (eleccion == 1) {
                probabilidadAtaqueGuerrero = (int) (Math.random() * 100);
                if (probabilidadAtaqueGuerrero <= 50) {
                    System.out.println("El ataque contra el vampiro ha sido efectivo");
                    ataqueGuerrero = 7;
                    vidaVampiro = vidaVampiro - ataqueGuerrero;
                    System.out.println("El vampiro tiene " + vidaVampiro + "/60");
                }
            } else if (eleccion == 2) {
                probabilidadAtaqueGuerrero = (int) (Math.random() * 100);
                if (probabilidadAtaqueGuerrero <= 25) {
                    System.out.println("El ataque contra el vampiro ha sido efectivo");
                    ataqueGuerrero = 15;
                    vidaVampiro = vidaVampiro - ataqueGuerrero;
                    System.out.println("El vampiro tiene " + vidaVampiro + "/60");
                }
            } else if (eleccion == 3) {
                if (probabilidadAtaqueGuerrero <= 12) {
                    System.out.println("El ataque contra el vampiro ha sido efectivo");
                    ataqueGuerrero = 30;
                    vidaVampiro = vidaVampiro - ataqueGuerrero;
                    System.out.println("El vampiro tiene " + vidaVampiro + "/60");
                }
            }

            if (armaVampiro == 1) {
                probabilidadAtaqueVampiro = (int) (Math.random() * 100);
                if (probabilidadAtaqueVampiro <= 90) {
                    System.out.println("El vampiro te ha atacado");
                    ataqueVampiro = 5;
                    vidaGuerrero = vidaGuerrero - ataqueVampiro;
                    System.out.println("El vampiro tiene " + vidaGuerrero + "/150");
                }

            } else if (armaVampiro == 2) {
                probabilidadAtaqueVampiro = (int) (Math.random() * 100);
                if (probabilidadAtaqueVampiro <= 60) {
                    System.out.println("El vampiro te ha atacado");
                    ataqueVampiro = 10;
                    vidaGuerrero = vidaGuerrero - ataqueVampiro;
                    System.out.println("El vampiro tiene " + vidaGuerrero + "/150");
                }

            } else if (armaVampiro == 3) {
                probabilidadAtaqueVampiro = (int) (Math.random() * 100);
                if (probabilidadAtaqueVampiro <= 40) {
                    System.out.println("El vampiro te ha atacado");
                    ataqueVampiro = 20;
                    vidaGuerrero = vidaGuerrero - ataqueVampiro;
                    System.out.println("El vampiro tiene " + vidaGuerrero + "/150");
                }

            }

        }

    }
}
