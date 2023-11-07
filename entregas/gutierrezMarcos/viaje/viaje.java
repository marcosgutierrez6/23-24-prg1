class viaje {
    public static void main(String[] args) {
        double velocidadDiaria = 0;
        double horasDiarias = 0;
        double velocidadDiariaMadre = 0;
        int clima = 0;
        double kilometrosTotales = 0;
        int probabilidadMono = 0;
        int dia = 0;
        double kilometrosMadre = 350;
        boolean encuentro = false;
        double kilometrosMadreMarco = 350;

        System.out.println("DIARIO DEL VIAJE DE MARCO");
        System.out.println("=========================");

        while (encuentro == false) {
            dia++;
            velocidadDiaria = (Math.random() * 5) + 10;
            clima = (int) (Math.random() * 100);
            System.out.println("DIA "+ dia);
            if (clima <= 10) {
                velocidadDiaria = velocidadDiaria * 0.25;
                System.out.println("Ha llovido un poco");
            } else if (clima > 10 && clima <= 30) {
                velocidadDiaria = velocidadDiaria * 0.25;
                System.out.println("¡Ha llovido muchísimo!");
            }else{
                System.out.println("Ha hecho un buen día");
            }
            horasDiarias = (Math.random() * 8) + 2;
            probabilidadMono = (int) (Math.random() * 100);
            if (probabilidadMono <= 15) {
                horasDiarias = horasDiarias - 2;
                System.out.println("Se ha escapado el mono");
            } else if (probabilidadMono > 15 && probabilidadMono <= 25) {
                velocidadDiaria = velocidadDiaria * 0.9;
                System.out.println("Se ha cansado el mono");
            }
            kilometrosTotales = velocidadDiaria * horasDiarias;
            kilometrosMadre = kilometrosMadre - 80;
            
            horasDiarias = Math.floor(horasDiarias);
            velocidadDiaria = Math.floor(velocidadDiaria);
            kilometrosTotales = Math.floor(kilometrosTotales);

            System.out.println("Avance "+ horasDiarias +" horas a "+ velocidadDiaria +" Km/h recorriendo "+ kilometrosTotales +" Km");
            System.out.println("Mama pudo avanzar 80 Km");
            kilometrosMadreMarco = kilometrosMadre - kilometrosTotales;
            if (kilometrosMadreMarco < 0){
                kilometrosMadreMarco = 0;
            }
            System.out.println("Al final del día "+ kilometrosTotales +" la distancia entre Marco y su Madre es de "+ kilometrosMadreMarco);
            

            if (kilometrosTotales >= kilometrosMadre) {
                System.out.println("************************************************************\r\n" + //
                        "Al final del día " + dia + " Marco encuentra a su madre!!!\r\n" + //
                        "************************************************************");
                encuentro = true;
            }else{
                System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
            }
        }
    }
}
