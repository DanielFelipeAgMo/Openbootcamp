import java.util.Scanner;

public class Dowhile {

    public static void main(String[] args) {
        int numeroWhile;
        Scanner leer = new Scanner(System.in);

        System.out.println("Escriba un número: ");
        numeroWhile = leer.nextInt();

        do{
            numeroWhile += 1;
            System.out.println(numeroWhile);
        }
        while (numeroWhile < 3);


    }
}
