public class Cambio {
    public static void main(String[] args) {

        int cantidadPagar = 400;
        int cantidadEntregada = 677;

        System.out.println("Debes pagar: " + cantidadPagar + "€");
        System.out.println("Has pagado: " + cantidadEntregada + "€");
        System.out.println("-------------------------");

        int cantidadDevolver = cantidadEntregada - cantidadPagar;
        System.out.println("Total a devolver: " + cantidadDevolver + "€\n");
        int[] denominacionesDisponibles = {100, 50, 20, 10, 5, 2, 1};

        for (int denominacion : denominacionesDisponibles) {

            int unidadesADevolver = cantidadDevolver / denominacion;
            
            if (unidadesADevolver > 0) {
                cantidadDevolver = cantidadDevolver % denominacion; 
                String tipoUnidad = (denominacion >= 5) ? "billete(s)" : "moneda(s)";
                System.out.println(unidadesADevolver + " " + tipoUnidad + " de " + denominacion + "€");
            }
        }
    }
}