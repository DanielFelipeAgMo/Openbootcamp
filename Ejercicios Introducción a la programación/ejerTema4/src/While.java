import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        int numeroWhile;
        Scanner leer = new Scanner(System.in);

        System.out.println("Escriba un número: ");
        numeroWhile = leer.nextInt();

        while (numeroWhile < 3){
            numeroWhile += 1;
            System.out.println(numeroWhile);
        }
    }
}
