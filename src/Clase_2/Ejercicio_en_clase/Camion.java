package Clase_2.Ejercicio_en_clase;

public class Camion extends Vehiculo{
    private float carga;

    public Camion(){}

    public Camion(String duenio, int puertas, int ruedas, float carga) {
        super(duenio, puertas, ruedas);
        this.carga = carga;
    }

    public float getCarga() {
        return carga;
    }

    public void setCarga(float carga) {
        this.carga = carga;
    }

    @Override
    protected void caracteristicas() {
        System.out.println("Dueño: " + this.getDuenio());
        System.out.println("Puertas: " + this.getPuertas());
        System.out.println("Ruedas: " + this.getRuedas());
        System.out.println("Carga: " + this.getCarga());
    }

    public void caracteristicas(float carga){
        if (carga >= 2000){
            System.out.println("El camion esta sobrecargado");
        }
        else {
            System.out.println("El camion tiene su capacidad permitida");
        }
    }

}
