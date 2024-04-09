package Trabajos_Practicos.Trabajo_Practico_N1.Ejercicio_10;

public class Libro {

    //Atributos
    private String titulo;
    private String autor;
    private double precio;

    //Constructor
    public Libro(String titulo, String autor, double precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
    }

    //Getter y Setter
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    //Metodo
    public void Informacion() {
        System.out.println("Título: " + this.getTitulo());
        System.out.println("Autor(es): " + this.getAutor());
        System.out.println("Precio: $" + this.getPrecio());
    }
}
