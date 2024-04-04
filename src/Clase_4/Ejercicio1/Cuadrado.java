package Clase_4.Ejercicio1;

public class Cuadrado implements Figura{
    private float lado;

    public Cuadrado(float lado) {
        this.lado = lado;
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }


    @Override
    public float area() {
        return lado*lado;
    }
}
