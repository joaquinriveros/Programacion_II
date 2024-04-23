package Trabajos_Practicos.Trabajo_Practico_N3.Clases.Ejercicio_1;


public class Asignature {

	//Atributos
	private String name;
	private int classroom;
	private String hour;
	private Group group;
	private Teacher teacher;

	//Constructor
	public Asignature(String name, int classroom, String hour) {
		this.name = name;
		this.classroom = classroom;
		this.hour = hour;
	}

	//Getter y Setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getClassroom() {
		return classroom;
	}
	public void setClassroom(int classroom) {
		this.classroom = classroom;
	}

	public String getHour() {
		return hour;
	}
	public void setHour(String hour) {
		this.hour = hour;
	}

	public Group getGroup() {
		return group;
	}
	public void setGroup(Group group) {
		this.group = group;
	}

	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
}