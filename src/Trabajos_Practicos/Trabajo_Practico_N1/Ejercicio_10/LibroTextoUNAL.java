package Trabajos_Practicos.Trabajo_Practico_N1.Ejercicio_10;

// UNAL (Universidad Nacional de Colombia)
public class LibroTextoUNAL extends LibroTexto {

    //Atributos
    private String facultad;

    //Constructor
    public LibroTextoUNAL(String titulo, String autor, double precio, String curso, String facultad) {
        super(titulo, autor, precio, curso);
        this.facultad = facultad;
    }

    //Getter y Setter
    public String getFacultad() {
        return facultad;
    }
    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    // Metodo
    @Override
    public void Informacion() {
        super.Informacion();
        System.out.println("Facultad: " + this.getFacultad());
    }
}