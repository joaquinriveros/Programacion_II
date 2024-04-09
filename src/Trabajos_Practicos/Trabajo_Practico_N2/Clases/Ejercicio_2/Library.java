package Trabajos_Practicos.Trabajo_Practico_2.Clases.Ejercicio_2;

import java.util.ArrayList;
import java.util.List;

public class Library {

	//Atributos
	private List<Book> books;

	//Constructor
	public Library(){}
	public Library(List<Book> books) {
		this.books = new ArrayList<>(books);
	}

	//Getter y Setter
	public List<Book> getBooks() {
		return books;
	}
	public void setBooks(List<Book> books) {
		this.books = books;
	}

	//Metodos
	public void addBook(Book book){
		this.books.add(book);
		System.out.println("'" +book.getTitle()+ "' se ha añadido con éxito");
	}

	public void listBooks(){
		System.out.println("Lista de Libros:");
		for (Book book: books) {
			System.out.println("--------------------------------------");
			System.out.println("Titulo: " + book.getTitle());
			System.out.println("Autor: " + book.getTitle());
			System.out.println("Año de publicación: " + book.getPublication_year());
			if (book.isLended()){
				System.out.println("El libro se encuentra prestado");
			}else {
				System.out.println("El libro se encuentra disponible");
			}
		}
	}

	public void toLend(String name){
		for (Book book:books) {
			if (book.getTitle().equals(name) && !book.isLended()){
				System.out.println("'"+ name +"' ha sido prestado.");
				book.setLended(true);
				break;
			}
			System.out.println("El libro no se encuentra disponible.");
		}
	}

	public void toReturn(String name){
		for (Book book:books) {
			if (book.getTitle().equals(name) && book.isLended()){
				System.out.println("'"+ name +"' ha sido devuelto.");
				book.setLended(false);
				break;
			}
			System.out.println("No es posible devolver el libro '" + name + "'.");
		}
	}

}