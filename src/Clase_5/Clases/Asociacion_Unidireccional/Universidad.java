package Clase_5.Clases.Asociacion_Unidireccional;
public class Universidad  {

	//Atributos
	private String nombre;
	private static int contador = 0;
	private int id;

	//Constructor
	public Universidad(String nombre) {
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

	public int getId() {
		return id;
	}

	//Metodos
	public void CambiarUniversidad(String nuevaUniversidad){
		setNombre(nuevaUniversidad);
	}

	public void CrearUniversidad(String nombre){
		new Universidad(nombre);
	}

	public String VerUniversidad(){
		return ("Id Universidad: "+ getId() +
				"\r\nUniversidad: " + this.nombre);
	}

}