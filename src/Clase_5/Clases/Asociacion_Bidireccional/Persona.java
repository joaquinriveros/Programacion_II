package Clase_5.Clases.Asociacion_Bidireccional;

import java.util.ArrayList;
import java.util.List;

public class Persona {

	//Atributos
	private List<Libro> libros = new ArrayList<>();
	private String nombre;
	private static int contador = 0;
	private int id;

	//Constructor
	public Persona(String nombre) {
		this.nombre = nombre;
		contador ++;
		id = contador;
	}

	//Getter y Setter
	public List<Libro> getLibros() {
		return libros;
	}

	public void setLibros(List<Libro> libros) {
		this.libros = libros;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getId() {
		return id;
	}

	//Metodos
	public void AgregarLibro(Libro libro){
		this.libros.add(libro);
	}

	public void CrearPersona(String nombre){
		new Persona(nombre);
	}

	public void MostrarListaLibros(){
		System.out.println("Libros:");
		for (Libro libro:libros) {
			System.out.println("-" + libro.getTitulo() + ".");
		}
	}
}