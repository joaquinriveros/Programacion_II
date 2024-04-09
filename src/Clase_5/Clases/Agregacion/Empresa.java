package Clase_5.Clases.Agregacion;

import java.util.ArrayList;
import java.util.List;

public class Empresa {

	//Atributos
	private List<Departamento> departamentos;

	//Constructor
	public Empresa() {
		this.departamentos = new ArrayList<>();
	}

	//Getter y Setter
	public List<Departamento> getDepartamentos() {
		return departamentos;
	}
	public void setDepartamentos(List<Departamento> departamentos) {
		this.departamentos = departamentos;
	}

	//Metodos
	public void AgregarDepartamento(Departamento departamento){
		this.departamentos.add(departamento);
	}

	public void MostrarDepartamentos(){
		System.out.println("Departamentos de la Empresa:");
		for (Departamento departamento: departamentos) {
			System.out.println(departamento.getNombre());
		}
	}

}