package Clase_4.Ejercicio_1.Clases;

import Clase_4.Ejercicio_1.Interfaces.Figura;

public class Cuadrado implements Figura {
    private int lados;
    //Constructor
    public Cuadrado(int lados) {
        this.lados = lados;
    }
    //Getter y Setter
    public int getLados() {
        return lados;
    }

    public void setLados(int lados) {
        this.lados = lados;
    }

    //Metodos

    @Override
    public float area() {
        return lados*lados;
    }
}
