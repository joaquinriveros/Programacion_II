package Trabajos_Practicos.Trabajo_Practico_N1.Ejercicio_8;

import java.util.Random;

public class Gerente extends Empleado{
    //Atributos
    private Actividades actividades;
    private int departamentoTrabajo;
    Random random = new Random();

    //Constructor
    public Gerente(String nombre, int edad, double salario, boolean capacidadTrabajo,Actividades actividades) {
        super(nombre, edad, salario, capacidadTrabajo);
        this.actividades = actividades;
        this.departamentoTrabajo = random.nextInt(10 ) + 1;
    }
    //Getter y Setter
    public Actividades getActividades() {
        return actividades;
    }
    public void setActividades(Actividades actividades) {
        this.actividades = actividades;
    }

    //Métodos
    public void realizarActividad(){
        if (super.isCapacidadTrabajo()) {
            System.out.println("El gerente: " + super.getNombre() + " realiza la actividad: " + this.getActividades()
            + " en el departamento: " + this.departamentoTrabajo);
        }else {
            System.out.println("El gerente: " + super.getNombre() + " no está disponible para trabajar.");
        }
    }
}
