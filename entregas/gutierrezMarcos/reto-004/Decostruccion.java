import java.util.Scanner;

public class Decostruccion {
    
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        
        int primerNumero = pedirNumero("primer");
        int segundoNumero = pedirNumero("segundo");
        int tercerNumero = pedirNumero("tercer");

        int primeraCifra = primerNumero / 100;
        int segundaCifra = (segundoNumero / 10) % 10;
        int terceraCifra = tercerNumero % 10;

        int nuevoNumero = (primeraCifra * 100) + (segundaCifra * 10) + terceraCifra;

        System.out.println("El nuevo numero formado es: " + nuevoNumero);
        
        scanner.close();
    }
    private static int pedirNumero(String orden) {
        System.out.print("Ingrese el " + orden + " numero de tres cifras: ");
        return scanner.nextInt();
    }
}