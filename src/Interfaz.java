import java.util.Scanner;
import javax.swing.JOptionPane;

public class Interfaz {
    public static void main(String[] args) {
        /*programa que enula la interfaz de un Cajero automatico*/


       int opccion=Integer.parseInt(JOptionPane.showInputDialog(null,"Elija una de las siguientes opcciones:  "  +
               "\n\nEscriba 1 para consultar su saldo \nEscriba 2 para ingresar dinero  \nEscriba 3 para retirar dinero  \nEscriba 4 para consultar sus ultimos movimientos \nUna vez elegido la opccion, pulsa enter... "
               , "CAJERO AUTOMATICO", JOptionPane.QUESTION_MESSAGE));

        JOptionPane.showMessageDialog(null,"la opccion que ha elegido es: " + opccion );

        switch (opccion) {
            case 1:
                System.out.println("Su saldo es de $5000");
                break;
            case 2:
                System.out.println("ingresa dinero");
                break;
            case 3:
                System.out.println("sacar dinero");
                break;
            case 4:
                System.out.println("sus ultimos movimientos");
                break;
            default:
                System.out.println("opcion invalida intentalo de nuevo");

        }

    }
}
