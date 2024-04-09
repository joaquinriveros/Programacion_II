package Trabajos_Practicos.Trabajo_Practico_N1.Ejercicio_10;

public class Novela extends Libro {

    //Atributos
    private Tipo tipo;

    //Constructor
    public Novela(String titulo, String autor, double precio, Tipo tipo) {
        super(titulo, autor, precio);
        this.tipo = tipo;
    }

    //Getter y Setter
    public Tipo getTipo() {
        return tipo;
    }
    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    //Metodo
    @Override
    public void Informacion() {
        super.Informacion();
        System.out.println("Tipo de novela: " + this.getTipo());
    }
}