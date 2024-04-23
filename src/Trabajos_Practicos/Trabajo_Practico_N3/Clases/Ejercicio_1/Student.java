package Trabajos_Practicos.Trabajo_Practico_N3.Clases.Ejercicio_1;

public class Student extends Person {

	//Constructor
	public Student(String name, int dni) {
		super(name, dni);
	}

	//Getter y Setter
	@Override
	public int getDni() {
		return super.getDni();
	}
	@Override
	public void setDni(int dni) {
		super.setDni(dni);
	}

	@Override
	public String getName() {
		return super.getName();
	}
	@Override
	public void setName(String name) {
		super.setName(name);
	}
}