package Trabajos_Practicos.Trabajo_Practico_N3.Clases.Ejercicio_1;

public abstract class Person {

	//Atributos
	private String name;
	private int dni;

	//Constructor
	public Person(String name, int dni) {
		this.name = name;
		this.dni = dni;
	}

	//Getter y Setter
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}