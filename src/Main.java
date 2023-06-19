// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
/*
* Para practicar la encapsulación:

Crear clase Persona.

Crear variables las privadas edad, nombre y telefono de la clase Persona.

Crear gets y sets de cada propiedad.

Crear un objeto persona en el main.

Utiliza los gets y sets para darle valores a las propiedades edad, nombre y telefono, por último muéstralas por consola.
* */

public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();

        persona.setEdad(18);
        int edadPersona = persona.getEdad();

        persona.setNombre("Laura");
        String nombrePersona = persona.getNombre();

        persona.setTelefono(676915382);
        int telefonoPersona = persona.getTelefono();

        System.out.println(nombrePersona + " con el telefono " + telefonoPersona + " tiene una edad de " + edadPersona + " años");
    }
}

class Persona {
    private int edad;
    private String nombre;
    private int telefono;

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getEdad() {
        return this.edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    public int getTelefono(){
        return this.telefono;
    }
}