package Trabajos_Practicos.Trabajo_Practico_N1.Ejercicio_10;

public class LibroTexto extends Libro {

    //Atributos
    private String curso;

    //Constructor
    public LibroTexto(String titulo, String autor, double precio, String curso) {
        super(titulo, autor, precio);
        this.curso = curso;
    }

    //Getter y Setter
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }

    //Metodo
    @Override
    public void Informacion() {
        super.Informacion();
        System.out.println("Curso: " + this.getCurso());
    }
}