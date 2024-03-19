package Clase_3.Ejercicios;

public class Oficial extends Operario{
    //Parametros
    private String numeroPlaca;

    //Constructor
    public Oficial(String nombre, String dni,String numeroPlaca) {
        super(nombre, dni);
        this.numeroPlaca = numeroPlaca;
    }

    //Getter
    public String getNumeroPlaca() {
        return numeroPlaca;
    }

    //Setter
    public void setNumeroPlaca(String numeroPlaca) {
        this.numeroPlaca = numeroPlaca;
    }

    //Metodos
    @Override
    public String toString() {
        return "Oficial: " + this.getNombre();
    }

    @Override
    public void Datos() {
        super.Datos();
        System.out.println("Numero de Placa: " + numeroPlaca);
    }
}
