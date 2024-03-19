package Clase_1.Herencia.Ejercicio_1;

public class Motocicleta extends Bicicleta {
    double velocidad;
    int cilindrada;

    public Motocicleta(String color, int ruedas, String tipo_bici, int velocidad, int cilindrada) {
        super(color, ruedas, tipo_bici);
        this.velocidad = velocidad;
        this.cilindrada = cilindrada;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
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
        return super.ObtenerAtributos() + "Velocidad :" + velocidad + "\n Cilindrada: " + cilindrada + "\n";
    }
}
