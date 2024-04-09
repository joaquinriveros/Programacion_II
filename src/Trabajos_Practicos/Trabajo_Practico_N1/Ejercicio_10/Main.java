package Trabajos_Practicos.Trabajo_Practico_N1.Ejercicio_10;

public class Main {
    public static void main(String[] args) {
        // Crear instancias de Libro
        Libro libro1 = new Libro("El principito", "Antoine de Saint-Exupéry", 10.99);
        Libro libro2 = new Libro("Harry Potter y la piedra filosofal", "J.K. Rowling", 15.50);

        // Imprimir información de los libros
        System.out.println("Libros:");
        libro1.Informacion();
        System.out.println();
        libro2.Informacion();
        System.out.println();

        // Crear instancias de LibroTexto
        LibroTexto libroTexto1 = new LibroTexto("Matemáticas 1", "Juan Pérez", 25.99, "Primer semestre");
        LibroTexto libroTexto2 = new LibroTexto("Historia Universal", "María Gómez", 30.50, "Segundo semestre");

        // Imprimir información de los libros de texto
        System.out.println("Libros de texto:");
        libroTexto1.Informacion();
        System.out.println();
        libroTexto2.Informacion();
        System.out.println();

        // Crear instancias de LibroTextoUNAL
        LibroTextoUNAL libroTextoUNAL1 = new LibroTextoUNAL("Física 2", "Carlos Ramírez", 35.75, "Tercer semestre", "Ingeniería");
        LibroTextoUNAL libroTextoUNAL2 = new LibroTextoUNAL("Química Orgánica", "Ana López", 40.20, "Cuarto semestre", "Ciencias Naturales");

        // Imprimir información de los libros de texto de la UNAL
        System.out.println("Libros de texto de la UNAL:");
        libroTextoUNAL1.Informacion();
        System.out.println();
        libroTextoUNAL2.Informacion();
        System.out.println();

        // Crear instancias de Novela
        Novela novela1 = new Novela("Cien años de soledad", "Gabriel García Márquez", 15.99, Tipo.Realista);
        Novela novela2 = new Novela("El código Da Vinci", "Dan Brown", 20.50, Tipo.Policiaca);

        // Imprimir información de las novelas
        System.out.println("Novelas:");
        novela1.Informacion();
        System.out.println();
        novela2.Informacion();
    }
}
