package Trabajos_Practicos.Trabajo_Practico_N1.Ejercicio_9;

public class Circulo extends FiguraGeometrica{

    //Atributos
    private double radio;

    //Constructor
    public Circulo(double radio) {
        this.radio = radio;
    }

    //Getter y Setter
    public double getRadio() {
        return radio;
    }
    public void setRadio(double radio) {
        this.radio = radio;
    }

    //Metodos
    @Override
    public double calcularPerimetro() {
        return (this.radio * 2 * Math.PI);
    }
    @Override
    public double calcularArea() {
        return (Math.PI * Math.pow(this.radio,2));
    }
}
