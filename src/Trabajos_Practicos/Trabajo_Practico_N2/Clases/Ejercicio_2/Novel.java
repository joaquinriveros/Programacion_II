package Trabajos_Practicos.Trabajo_Practico_2.Clases.Ejercicio_2;
public class Novel extends Book {

	//Atributos
	private String genre;
	private double price;

	//Constructor
	public Novel(){}
	public Novel(String title, String author, int publication_year, boolean lended, String genre, double price) {
		super(title, author, publication_year, lended);
		this.genre = genre;
		this.price = price;
	}

	//Getter y Setter
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}

	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
}