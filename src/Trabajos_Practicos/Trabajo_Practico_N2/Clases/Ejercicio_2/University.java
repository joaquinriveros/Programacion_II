package Trabajos_Practicos.Trabajo_Practico_N2.Clases.Ejercicio_2;
public class University extends Book {

	//Atributos
	private double price;
	private String subject;

	//Constructor
	public University(){}
	public University(String title, String author, int publication_year, boolean lended, double price, String subject) {
		super(title, author, publication_year, lended);
		this.price = price;
		this.subject = subject;
	}

	//Getter y Setter
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
}