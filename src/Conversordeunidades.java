import java.util.Scanner;
public class Conversordeunidades {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Conversor de cantidad de Euros a US Dolares");
        System.out.println("Introduce cantidad en Euros:");
        double Euros=scanner.nextDouble();
        Double dolares = 1.09 * Euros ;
        System.out.println(dolares);
    }
}
