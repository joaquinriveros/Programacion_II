package Trabajos_Practicos.Trabajo_Practico_N1.Ejercicio_8;

public abstract class Empleado {

    //Atributos
    private String nombre;
    private int edad;
    private double salario;
    private boolean capacidadTrabajo;

    //Constructor
    public Empleado(String nombre, int edad, double salario, boolean capacidadTrabajo) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
        this.capacidadTrabajo = capacidadTrabajo;
    }

    //Getter y Setter
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

    public boolean isCapacidadTrabajo() {
        return capacidadTrabajo;
    }
    public void setCapacidadTrabajo(boolean capacidadTrabajo) {
        this.capacidadTrabajo = capacidadTrabajo;
    }

    // Metodo
    public void Informacion(){
        System.out.println(
                "Nombre: " + this.getNombre() +
                "Edad: " + this.getEdad() +
                "Salario: " + this.getSalario()
        );
    }
}
