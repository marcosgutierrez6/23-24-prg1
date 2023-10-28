class CaracolBasico {
    public static void main(String[] args) {

        int profundidadCaracol = 0;
        profundidadCaracol = (int) (Math.random() * 10) + 10;
        System.out.println(profundidadCaracol);

        boolean caracolVivo = true;
        boolean caracolFuera = false;
        int dia = 0;

        float metrosSube = 0;
        float metrosBaja = 0;
        float alturaFinal = 0;

        while (caracolVivo == true && caracolFuera == false || dia == 50) {
            if (caracolFuera == false) {
                dia++;

                System.out.println("[]~~~~~~~~~~~~~~[] _ __ 20");
                System.out.println("[][][][][][][][][] ");

                metrosBaja = (int) (Math.random() * 20);
                metrosBaja = metrosBaja / 10;

                metrosSube = (int) (Math.random() * 30) + 10;
                metrosSube = metrosSube / 10;

                alturaFinal = metrosSube - metrosBaja;

                profundidadCaracol = profundidadCaracol - (int) alturaFinal;
                System.out.println("Día [" + dia + "] / Sube: [" + metrosSube + "] / Baja: [" + metrosBaja
                        + "] / Altura al final del día: [" + alturaFinal + "]");
                System.out.println("[__]              [__]");
                for (int i = 0; i < 20; i++) {
                    if (profundidadCaracol == i) {
                        System.out.println("[]    _@)_/’    [] _ __ " + i);
                        i++;
                    }
                    System.out.println("[]:. :. :. :. :.[] _ __ " + i);

                }

                if (profundidadCaracol < 0) {
                    caracolFuera = true;
                }

                if (caracolVivo == false) {
                    break;
                }
                if (caracolFuera == true) {
                    break;
                }
                if (dia == 50) {
                    break;
                }
            }

        }
        if (caracolFuera == true) {
            System.out.println("El caracol ha salido del pozo");
        } else if (caracolVivo == false) {
            System.out.println("El caracol no ha salido del pozo");
        }
    }
}
