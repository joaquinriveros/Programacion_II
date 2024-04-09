package Clase_5.Clases.Asociacion_Unidireccional;

public class Estudiantes  {

	//Atributos
	private String nombre;
	public Universidad  universidad;
	private static int contador = 0;
	private int id;

	//Constructor
	public Estudiantes(String nombre) {
		this.nombre = nombre;
		contador ++;
		id = contador;
	}

	//Getter y Setter
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Universidad getUniversidad() {
		return universidad;
	}
	public void setUniversidad(Universidad universidad) {
		this.universidad = universidad;
	}

	public int getId() {
		return id;
	}

	//Metodos
	public void CrearEstudiantes (String nombre){
		new Estudiantes(nombre);
	}


}