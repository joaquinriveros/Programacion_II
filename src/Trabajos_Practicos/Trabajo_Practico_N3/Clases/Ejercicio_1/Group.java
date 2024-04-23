package Trabajos_Practicos.Trabajo_Practico_N3.Clases.Ejercicio_1;

import java.util.ArrayList;
import java.util.List;

public class Group {

	//Atributos
	private String course;
	private char letter;
	private List <Student> belongs;
	private Asignature receives;

	//Constructor
	public Group(String course, char letter, List<Student> belongs) {
		this.course = course;
		this.letter = letter;
		this.belongs = new ArrayList<>(belongs);
	}

	//Getter y Setter
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}

	public char getLetter() {
		return letter;
	}
	public void setLetter(char letter) {
		this.letter = letter;
	}

	public List<Student> getBelongs() {
		return belongs;
	}
	public void setBelongs(List<Student> belongs) {
		this.belongs = belongs;
	}

	public Asignature getReceives() {
		return receives;
	}
	public void setReceives(Asignature receives) {
		this.receives = receives;
	}
}