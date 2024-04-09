package Trabajos_Practicos.Trabajo_Practico_N1.Ejercicio_8;

import java.util.Random;

public class Trabajador extends Empleado{

    //Atributos
    private int areaTrabajo;
    Random random = new Random();

    //Constructor
    public Trabajador(String nombre, int edad, double salario, boolean capacidadTrabajo, int cantidadProduccion) {
        super(nombre, edad, salario, capacidadTrabajo);
        this.areaTrabajo = random.nextInt(10) + 1;
    }

    //Getter y Setter
    public int getAreaTrabajo() {
        return areaTrabajo;
    }
    public void setAreaTrabajo(int areaTrabajo) {
        this.areaTrabajo = areaTrabajo;
    }

    //Método
    public void producirEnArea(){
        if (super.isCapacidadTrabajo()) {
            System.out.println("El trabajador: " + super.getNombre() + " está produciendo " +
                    "en el área: " + this.getAreaTrabajo());
        }else {
            System.out.println("El trabajador: " + super.getNombre() + " no está disponible para trabajar.");
        }
    }
}
