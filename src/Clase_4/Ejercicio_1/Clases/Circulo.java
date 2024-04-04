package Clase_4.Ejercicio_1.Clases;

import Clase_4.Ejercicio_1.Interfaces.Figura;

public class Circulo implements Figura {
    private float radio;
    //Constructor
    public Circulo(float radio) {
        this.radio = radio;
    }
    //Getter y Setter
    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }
    //Metodos

    @Override
    public float area() {
        return (float) (3.14*radio*radio);
    }
}
