import java.util.Scanner;
class Persona{
    /*variables privadas*/
    private String nombre, edad, telefono;

    Persona(String nombre, String edad, String telefono){
        setNombre(nombre);
        setEdad(edad);
        setTelefono(telefono);
    }

    /*metodos setters o modificadores*/
    public void setNombre(String n) {nombre = n;}
    public void setTelefono(String t) {telefono = t;}
    public void setEdad(String e) { edad = e; }

    /*métodos getters o accesores*/
    public String getNombre() {
        return nombre;
    }
    public String getEdad() {
        return edad;
    }
    public String getTelefono() {
        return telefono;
    }

    /*Función para mostrar persona*/
    public void mostrarPersona(){
        System.out.println("\nNombre: "+ getNombre()+ "\nEdad: "+ getEdad()+ "\nTelefono: "+getTelefono());
    }
}
public class Main {

    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        String nombre, edad, telefono;
        System.out.println("Ingrese el nombre: ");
        nombre = entrada.nextLine();
        System.out.println("Ingrese la edad: ");
        edad = entrada.nextLine();
        System.out.println("Ingrese el telefono: ");
        telefono = entrada.nextLine();
        Persona e;
        e = new Persona(nombre,edad,telefono);
        e.mostrarPersona();

    }
}