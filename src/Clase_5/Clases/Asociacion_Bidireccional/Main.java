package Clase_5.Clases.Asociacion_Bidireccional;

public class Main {
    public static void main(String[] args) {
        // Crear libros
        Libro libro1 = new Libro("Libro 1");
        Libro libro2 = new Libro("Libro 2");

        // Crear personas
        Persona persona1 = new Persona("Persona 1");
        Persona persona2 = new Persona("Persona 2");
        Persona persona3 = new Persona("Persona 3");

        // Asignar libros a personas
        persona1.AgregarLibro(libro1);
        persona2.AgregarLibro(libro1);
        persona2.AgregarLibro(libro2);
        persona3.AgregarLibro(libro2);

        // Mostrar lista de libros de cada persona
        persona1.MostrarListaLibros();
        persona2.MostrarListaLibros();
        persona3.MostrarListaLibros();
    }
}
