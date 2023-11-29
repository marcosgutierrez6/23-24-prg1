import java.util.Scanner;

public class ExamenParcialPRG1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int consumoDia1 = 0;
        int consumoDia2 = 0;
        int consumoDia3 = 0;
        int consumoDia4 = 0;
        int consumoDia5 = 0;
        int consumoDia6 = 0;
        int consumoDia7 = 0;
        int mediaConsumoSemanal = 0;
        int plantaEnMantenimiento = 0;
        int mantenimientoDiario = 0;
        int rayoDiario = 0;
        int columnaImpactada = 0;
        if(rayo()){
            columnaImpactada = (int) (Math.random() * 6) + 1;
        }

        for (int i = 1; i < 8; i++) {
            rayoDiario = 0;
            mantenimientoDiario = 0;
            for (int j = 1; j <= 24; j++) {
                System.out.println("               __/\\__\r\n" + //
                        "  |    |    |  |####|  |    |    |  \r\n" + //
                        "====================================");
                for (int k = 7; k >= 1; k--) {
                    if (rayoDiario < 1) {
                        if (columnaImpactada > 0) {
                            if (columnaImpactada == 1) {
                                System.out.println(":[X]::" + estadoVentana() + "::" + estadoVentana()+ ":[    ]:"+ estadoVentana() + "::" + estadoVentana() + "::" + estadoVentana()+ ": - P" + k);
                            } else if (columnaImpactada == 2) {
                                System.out.println(":" + estadoVentana() + "::[X]::" + estadoVentana()+ ":[    ]:"+ estadoVentana() + "::" + estadoVentana() + "::" + estadoVentana()+ ": - P" + k);
                            } else if (columnaImpactada == 3) {
                                System.out.println(":" + estadoVentana() + "::" + estadoVentana() + "::[X]:[    ]:"+ estadoVentana() + "::" + estadoVentana() + "::" + estadoVentana()+ ": - P" + k);
                            } else if (columnaImpactada == 4) {
                                System.out.println(":" + estadoVentana() + "::" + estadoVentana() + "::" + estadoVentana() + ":[    ]:[X]::" + estadoVentana() + "::" + estadoVentana()+ ": - P" + k);
                            } else if (columnaImpactada == 5) {
                                System.out.println(":" + estadoVentana() + "::" + estadoVentana() + "::" + estadoVentana()+ ":[    ]:" + estadoVentana() + "::[X]::" + estadoVentana()+ ": - P" + k);
                            } else if (columnaImpactada == 6) {
                                System.out.println(":" + estadoVentana() + "::" + estadoVentana() + "::" + estadoVentana()+ ":[    ]:" + estadoVentana() + "::" +estadoVentana() + "::[X]: - P" + k);
                            }
                        } else {
                            System.out.println(":" + estadoVentana() + "::" + estadoVentana() + "::" + estadoVentana() + ":[    ]:"+ estadoVentana() + "::" + estadoVentana() + "::" + estadoVentana()+ ": - P"+ k);
                        }
                    } else if (mantenimientoDiario < 1) {
                        if (mantenimiento()) {
                            mantenimientoDiario++;
                            plantaEnMantenimiento = (int) (Math.random() * 7) + 1;
                            if (plantaEnMantenimiento == k) {
                                System.out.println(":[#]::[#]::[#]:[    ]:[#]::[#]::[#]: - P" + k);
                                k--;
                            }
                        } else {
                            System.out.println(":" + estadoVentana() + "::" + estadoVentana() + "::" + estadoVentana() + ":[    ]:"+ estadoVentana() + "::" + estadoVentana() + "::" + estadoVentana()+ ": - P"+ k);
                        }
                    } else {

                        System.out.println(":" + estadoVentana() + "::" + estadoVentana() + "::" + estadoVentana() + ":[    ]:"+ estadoVentana() + "::" + estadoVentana() + "::" + estadoVentana() + ": - P"+ k);
                    }

                }
                columnaImpactada = 0;
                System.out.println("------------------------------------\r\n" + //
                        "     ==========================\r\n" + //
                        "   ==============================\r\n" + //
                        " ==================================");

                System.out.println("Dia " + i + " - " + j + ":00h Consumo hora: 22");
                if (i == 1) {
                    consumoDia1 = consumoDia1 + obtenerAcumulacionConsumo();
                    System.out.println("D" + i + ":" + " " + consumoDia1);
                    acumulacionConsumo = 0;
                } else if (i == 2) {
                    consumoDia2 = consumoDia2 + obtenerAcumulacionConsumo();
                    System.out.println("D1: " + consumoDia1 + "| D" + i + ":" + " " + consumoDia2);
                    acumulacionConsumo = 0;
                } else if (i == 3) {
                    consumoDia3 = consumoDia3 + obtenerAcumulacionConsumo();
                    System.out.println(
                            "D1: " + consumoDia1 + "| D2: " + consumoDia2 + "| D" + i + ":" + " " + consumoDia3);
                    acumulacionConsumo = 0;
                } else if (i == 4) {
                    consumoDia4 = consumoDia4 + obtenerAcumulacionConsumo();
                    System.out.println("D1: " + consumoDia1 + "| D2: " + consumoDia2 + "| D3: " + consumoDia3 + "| D"
                            + i + ":" + " " + consumoDia4);
                    acumulacionConsumo = 0;
                } else if (i == 5) {
                    consumoDia5 = consumoDia5 + obtenerAcumulacionConsumo();
                    System.out.println("D1: " + consumoDia1 + "| D2: " + consumoDia2 + "| D3: " + consumoDia3 + "| D4:"
                            + consumoDia4 + " | D" + i + ":" + " " + consumoDia5);
                    acumulacionConsumo = 0;
                } else if (i == 6) {
                    consumoDia6 = consumoDia6 + obtenerAcumulacionConsumo();
                    System.out.println("D1: " + consumoDia1 + "| D2: " + consumoDia2 + "| D3: " + consumoDia3 + "| D4:"
                            + consumoDia4 + "| D5:" + consumoDia5 + " | D" + i + ":" + " " + consumoDia6);
                    acumulacionConsumo = 0;
                } else if (i == 7) {
                    consumoDia7 = consumoDia7 + obtenerAcumulacionConsumo();
                    System.out.println("D1: " + consumoDia1 + "| D2: " + consumoDia2 + "| D3: " + consumoDia3 + "| D4:"
                            + consumoDia4 + "| D5:" + consumoDia5 + "| D6: " + consumoDia6 + " | D" + i + ":" + " "
                            + consumoDia7);
                    acumulacionConsumo = 0;
                }
                scanner.nextInt();
            }
            rayoDiario++;
        }
        
        mediaConsumoSemanal = (consumoDia1 + consumoDia2 + consumoDia3 + consumoDia4 + consumoDia5 + consumoDia6
                + consumoDia7) / 7;
        System.out.println("\nCONSUMOS: D1: " + consumoDia1 + " | D2: " + consumoDia2 + " | D3: " + consumoDia3
                + " | D4: " + consumoDia4 + " | D5: " + consumoDia5 + " | D6: " + consumoDia6 + " | D7: " + consumoDia7
                + " | \r\n" + //
                "\r\n" + //
                "Media de consumo semanal: " + mediaConsumoSemanal);

    }

    static int acumulacionConsumo = 0;

    static int obtenerAcumulacionConsumo() {
        return acumulacionConsumo;
    }

    static String estadoVentana() {
        String ventana = "";
        int consumo = 0;
        int estadoVentana = (int) (Math.random() * 100) + 1;
        if (estadoLuz()) {
            if (estadoVentana <= 70) {
                ventana = "[*]";
                if(!rayo() && !mantenimiento()){
                    consumo += 22;
                }
            } else {
                ventana = "[ ]";
                if(!rayo() && !mantenimiento()){
                    consumo += 22;
                }
            }
        } else if (estadoVentana <= 70) {
            ventana = "[º]";
        } else {
            ventana = "[ ]";
        }

        acumulacionConsumo += consumo;
        return ventana;

    }

    static boolean estadoLuz() {
        return (int) (Math.random() * 100) + 1 <= 60;
    }

    static boolean mantenimiento() {
        return (int) (Math.random() * 100) + 1 <= 5;
    }

    static boolean rayo() {
        return (int) (Math.random() * 100) + 1 <= 20;
    }

}
