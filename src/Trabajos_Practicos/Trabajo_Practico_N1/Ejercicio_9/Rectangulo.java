package Trabajos_Practicos.Trabajo_Practico_N1.Ejercicio_9;

public class Rectangulo extends FiguraGeometrica{

    //Atributos
    private double longitud;
    private double anchura;

    //Constructor
    public Rectangulo(float longitud, float anchura) {
        this.longitud = longitud;
        this.anchura = anchura;
    }

    //Getter y Setter
    public double getLongitud() {
        return longitud;
    }
    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public double getAnchura() {
        return anchura;
    }
    public void setAnchura(double anchura) {
        this.anchura = anchura;
    }

    //Metodos
    @Override
    public double calcularPerimetro() {
        return ((2 * this.longitud) + (2 * this.anchura));
    }
    @Override
    public double calcularArea() {
        return (this.longitud * this.anchura);
    }
}
