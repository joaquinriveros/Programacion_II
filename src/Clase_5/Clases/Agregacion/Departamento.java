package Clase_5.Clases.Agregacion;


import java.util.ArrayList;
import java.util.List;

public class Departamento {

	//Atributos
	private List<Empleado> empleados  ;
	private String nombre;

	//Constructor
	public Departamento(String nombre) {
		this.empleados = new ArrayList<>();
		this.nombre = nombre;
	}

	//Getter y Setter
	public List<Empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(List<Empleado> empleados) {
		this.empleados = empleados;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void AgregarEmpleado(Empleado empleado){
		this.empleados.add(empleado);
	}

	public void MostrarEmpleados(){
		System.out.println("Empleados en el Departamento:");
		for (Empleado empleado:empleados) {
			System.out.println("-" + empleado.getNombre() + ".");
		}
	}

}