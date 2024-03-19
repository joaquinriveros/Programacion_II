package Clase_1.Herencia.Ejercicio_1;

public class Coche extends Vehiculo {
    int velocidad;
    int cilindrada;

    public Coche(String color, int ruedas, int velocidad, int cilindrada) {
        super(color, ruedas);
        this.velocidad = velocidad;
        this.cilindrada = cilindrada;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public String ObtenerAtributos(){
        return super.ObtenerAtributos() + "Velocidad: " + velocidad + "\n Cilindrada: " + cilindrada + "\n";
    }
}
