package Trabajos_Practicos.Trabajo_Practico_N2.Clases.Ejercicio_2;
public class Book implements toLend{

	//Atributos
	private String title;
	private String author;
	private int publication_year;
	private boolean lended;

	//Constructor
	public Book(){}
	public Book(String title, String author, int publication_year, boolean lended) {
		this.title = title;
		this.author = author;
		this.publication_year = publication_year;
		this.lended = lended;
	}

	//Getter y Setter
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPublication_year() {
		return publication_year;
	}
	public void setPublication_year(int publication_year) {
		this.publication_year = publication_year;
	}

	public boolean isLended() {
		return lended;
	}
	public void setLended(boolean lended) {
		this.lended = lended;
	}

	//Metodos
	@Override
	public void toLend() {}
	@Override
	public void toReturn() {}
}