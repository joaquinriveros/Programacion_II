package Trabajos_Practicos.Trabajo_Practico_N2.Clases.Ejercicio_2;
public class Main {
    public static void main(String[] args) {
        // Crear algunos libros
        Book book1 = new Book("El guardián entre el centeno", "J.D. Salinger", 1951, false);
        Child book2 = new Child("Harry Potter y la piedra filosofal", "J.K. Rowling", 1997, true, "Fantasía", 15.99);
        Novel book3 = new Novel("1984", "George Orwell", 1949, false, "Distópico", 12.50);
        University book4 = new University("Introducción a los algoritmos", "Thomas H. Cormen", 1990, true, 30.50, "Ciencias de la Computación");

        // Crear una biblioteca
        Library library = new Library();

        // Agregar libros a la biblioteca
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);

        // Listar todos los libros en la biblioteca
        library.listBooks();

        // Prestar un libro
        library.toLend("El guardián entre el centeno");

        // Devolver un libro
        library.toReturn("Harry Potter y la piedra filosofal");

        // Listar todos los libros en la biblioteca nuevamente
        library.listBooks();
    }
}
