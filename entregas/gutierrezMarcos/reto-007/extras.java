public class SimuladorCondicionesRuta {

    public static void main(String[] args) {

        int estadoClima; 
        double reduccionMetros;

        int probabilidadLluvia = (int) (Math.random() * 100); 

        boolean hayIncidenteCoche;
        int probabilidadIncidente = (int) (Math.random() * 100);

        if (probabilidadIncidente <= 35) {
            reduccionMetros = (int) (Math.random() * 20) / 10.0;
            hayIncidenteCoche = true;
        } else {
            reduccionMetros = 0;
            hayIncidenteCoche = false;
        }

        if (probabilidadLluvia <= 5) {
            estadoClima = 2;
            reduccionMetros = (int) (Math.random() * 50) / 10.0;

        } else if (probabilidadLluvia <= 10) {
            estadoClima = 1;
            reduccionMetros = (int) (Math.random() * 20) / 10.0;
            
        } else {
            estadoClima = 0;
        }
    }
}