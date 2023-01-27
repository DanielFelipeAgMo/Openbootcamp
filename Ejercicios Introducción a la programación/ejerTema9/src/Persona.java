public class Persona {
    /*Atributos*/
    private String nombre, edad, telefono;

    /*Método constructor*/
    public Persona(String nombre, String edad, String telefono) {
        this.nombre = nombre;
        this.edad = edad;
        this.telefono = telefono;
    }
    /*constructor vacío*/
    public Persona() {
    }

    /*Setters y getters*/
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
