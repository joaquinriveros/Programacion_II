package Clase_3.Ejercicios;

public class Tecnico extends Operario{
    //Parametros
    private String domicilio;

    //Constructor
    public Tecnico(String nombre, String dni,String domicilio) {
        super(nombre, dni);
        this.domicilio = domicilio;
    }

    //Getter
    public String getDomicilio() {
        return domicilio;
    }

    //Setter
    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    //Metodos
    @Override
    public String toString() {
        return "Tecnico: " + this.getNombre();
    }

    @Override
    public void Datos() {
        super.Datos();
        System.out.println("Domicilio: " + domicilio);
    }
}
