package PRG1;
import java.util.Scanner;

public class Ludoteca {
  public static void main(String[] args) {
    final int MINUTOS_TOTALES = 120;
    final int NIÑOS_MINIMO = 5;
    int aisha = 0;
    int lydia = 0;
    int turnoNinño = 0;
    boolean jugando = false;
    String elMensaje = "";

    for (int i = 0; i < MINUTOS_TOTALES; i++) {
      System.out.println("Ludoteca PRG1, minuto " + i);
      if (llegaNiño()) {
        lydia++;
        System.out.println("> llega un niño! Lydia tiene en la cola ["+ lydia +"] niños");

      }
      if (!jugando){
        aisha = aisha + lydia;
        lydia = 0;
      }

      if (aisha >= NIÑOS_MINIMO && !jugando){
        jugando = true;
        turnoNinño = 1;
        elMensaje = "El examen estara dificil. Pasalo!";
      }

      if (jugando){
        elMensaje = mensajeAlterado(elMensaje);
        turnoNinño++;
        System.out.println("El niño ["+ turnoNinño +"] pasa este mensaje " + elMensaje);
        jugando = turnoNinño <= aisha;

        
      }

      System.out.println("Lydia ["+ lydia +"]/ Aisha["+ aisha +"]");
      new Scanner(Systesm.in).nextLine();
    }
  }

  static String mensajeAlterado(String mensaje){
    return mensaje + "x";
  }

  static boolean llegaNiño() {
    final double PROBABILIDAD_LLEGADA = 0.3;
    return Math.random() < PROBABILIDAD_LLEGADA;
  }

}
