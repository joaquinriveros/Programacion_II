package Clase_3.Ejercicios;

public class Directivo extends Empleado{
    //Parametros
    private String titulo;

    // Constructor
    public Directivo(String nombre,String titulo){
        super(nombre);
        this.titulo = titulo;
    }
    //Getter
    public String getTitulo() {
        return titulo;
    }
    //Setter
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    //Metodos
    @Override
    public String toString() {
        return "Directivo: " + this.getNombre();
    }
    public void Informacion(){
        System.out.println("Nombre: " + this.getNombre() + "\n" +
                "Titulo: " + titulo + "\n" +
                "Empresa: McDonalds S.A");
    }
}