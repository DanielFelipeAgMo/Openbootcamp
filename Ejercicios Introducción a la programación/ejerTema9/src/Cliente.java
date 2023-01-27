import java.util.Scanner;

public class Cliente extends Persona{

    /*Atributos*/
    private String credito;

    public Cliente(String nombre, String edad, String telefono, String credito) {
        super(nombre, edad, telefono);
        this.credito = credito;
    }



    public Cliente(String credito) {
        this.credito = credito;
    }

    public String getCredito() {
        return credito;
    }

    public void setCredito(String credito) {
        this.credito = credito;
    }

    public void mostrarCliente(){
        System.out.println("\nNombre: "+getNombre()+"\nTelefono: "+getTelefono()+"\nEdad: "+getEdad() + "\nCrédito: "+ getCredito());
    }

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        String nombre, edad, telefono,credito;
        System.out.println("Ingrese el nombre: ");
        nombre = entrada.nextLine();
        System.out.println("Ingrese la edad: ");
        edad = entrada.nextLine();
        System.out.println("Ingrese el telefono: ");
        telefono = entrada.nextLine();
        System.out.println("Ingrese el crédito: ");
        credito = entrada.nextLine();
        Cliente e;
        e = new Cliente(nombre,edad,telefono,credito);
        e.mostrarCliente();


    }
}
