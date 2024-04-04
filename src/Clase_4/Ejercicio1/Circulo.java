package Clase_4.Ejercicio1;

public class Circulo implements Figura{
    private float radio;

    public Circulo(float radio) {
        this.radio = radio;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }


    @Override
    public float area() {
        return (float) (3.14*radio*radio);
    }
}
