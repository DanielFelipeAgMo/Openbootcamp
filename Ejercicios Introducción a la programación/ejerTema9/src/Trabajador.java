import java.util.Scanner;

public class Trabajador extends Persona{
    /*Atributos*/
    private String salario;

    public Trabajador(String nombre, String edad, String telefono, String salario) {
        super(nombre, edad, telefono);
        this.salario = salario;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public static Scanner getEntrada() {
        return entrada;
    }

    public static void setEntrada(Scanner entrada) {
        Trabajador.entrada = entrada;
    }

    public void mostrarTrabajador(){
        System.out.println("\nNombre: "+getNombre()+"\nTelefono: "+getTelefono()+"\nEdad: "+getEdad() + "\nSalario: "+ getSalario());
    }

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        String nombre, edad, telefono,salario;
        System.out.println("Ingrese el nombre: ");
        nombre = entrada.nextLine();
        System.out.println("Ingrese la edad: ");
        edad = entrada.nextLine();
        System.out.println("Ingrese el telefono: ");
        telefono = entrada.nextLine();
        System.out.println("Ingrese el salario: ");
        salario = entrada.nextLine();
        Trabajador t;
        t = new Trabajador(nombre,edad,telefono,salario);
        t.mostrarTrabajador();


    }
}
