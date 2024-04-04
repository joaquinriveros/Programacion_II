package Clase_4.Ejercicio_2.Clases;

import Clase_4.Ejercicio_2.Interfaces.Dibujable;
import Clase_4.Ejercicio_2.Interfaces.Figura;

public class Circulo implements Dibujable, Figura {
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
    public float Area() {
        return (float) ((3.14*radio*radio));
    }

    @Override
    public void Dibujar() {
        System.out.println("Se ha dibujado en el Circulo");
    }

}
