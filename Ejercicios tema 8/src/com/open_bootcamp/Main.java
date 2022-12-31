//Crear clase Persona.
//Crear variables las privadas edad, nombre y telefono de la clase Persona.
//Crear gets y sets de cada propiedad.
//Crear un objeto persona en el main.
//Utilizar los gets y los sets para darle valores a las propiedades edad, nombre y telefono,
//por ultimo mostrarlas por consola.

package com.open_bootcamp;
public class Main {
    public static void main(String[] args) {
        Persona nombre  = new Persona();
        nombre.setNombre("Eliezer");
        nombre.setEdad(24);
        nombre.setTelefono(1126838112);
        System.out.println("Nombre: " + nombre.getNombre());
        System.out.println("Edad: " + nombre.getEdad());
        System.out.println("Telefono : " + nombre.getTelefono());
    }
}
class Persona {
    private String nombre;
    private int edad;
    private int telefono;
    public void setEdad(int Edad) { this.edad = Edad; }
    public int getEdad() {
        return this.edad;
    }
    public void setTelefono(int Telefono) { this.telefono = Telefono; }
    public int getTelefono() {
        return this.telefono;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return this.nombre;
    }
}
