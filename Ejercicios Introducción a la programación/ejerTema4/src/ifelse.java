import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {


        int numeroIf;
        Scanner leer = new Scanner(System.in);

        System.out.println("Escriba un número: ");
        numeroIf = leer.nextInt();

        if (numeroIf < 0) {
            System.out.println("Es negativo");
        } else {
            System.out.println("Es positivo");
        }
    }
}
