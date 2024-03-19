package Clase_1.Herencia.Ejercicio_2;

public class Animal {
    private String nombre;
    private int edad;
    private String genero;

    // Constructor
    public Animal(String nombre, int edad, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }

    public void hacerSonido(){
        System.out.println("El animal hace un sonido genérico.");
    }

    public String Informacion(){
        return ("Nombre: " + nombre + "\nEdad: " + edad + "\nGenero: " + genero);
    }

}
