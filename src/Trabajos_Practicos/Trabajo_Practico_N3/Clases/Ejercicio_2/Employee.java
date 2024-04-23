package Trabajos_Practicos.Trabajo_Practico_N3.Clases.Ejercicio_2;

public class Employee {

	//Atributos
	private String name;
	private Employee supervisor;

	//Constructor
	public Employee(String name) {
		this.name = name;
	}

	//Getter y Setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	//Metodos
	public void assignSupervisor(Employee supervisor){
		this.supervisor = supervisor;
	}

	public String  getSupervisorName(){
        if (this.supervisor == null) {
            return "Sin supervisor";
        } else {
            return supervisor.name;
        }
    }
}