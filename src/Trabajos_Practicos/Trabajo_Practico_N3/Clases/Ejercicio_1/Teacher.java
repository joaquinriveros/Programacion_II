package Trabajos_Practicos.Trabajo_Practico_N3.Clases.Ejercicio_1;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends Person {

	//Atributos
	private String department;
	private List <Asignature> imparts;

	//Constructor
	public Teacher(String name, int dni, String department, List<Asignature> imparts) {
		super(name, dni);
		this.department = department;
		this.imparts = imparts;
	}

	//Getter y Setter
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}

	public List<Asignature> getImparts() {
		return imparts;
	}
	public void setImparts(List<Asignature> imparts) {
		this.imparts = imparts;
	}

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