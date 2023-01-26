import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        int estacion = 0;

        Scanner leer = new Scanner(System.in);

        System.out.println("Escriba un número para la estación 1 verano, 2 otoño, 3 invierno, primavera : ");
        estacion = leer.nextInt();

        switch (estacion){
            case 1 :
                System.out.println("Verano");
                break;
            case 2 :
                System.out.println("Otoño");
                break;
            case 3 :
                System.out.println("Invierno");
                break;
            case 4 :
                System.out.println("primavera");
                break;
            default:
                System.out.println("Ese número no es valido o no hace referencia a una estación");
                break;
        }
    }
}
