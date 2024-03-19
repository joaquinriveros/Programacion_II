package Clase_3.Ejercicios;

public class Operario extends Empleado{
    //Parametros
    private String dni;

    //Costructor
    public Operario(String nombre, String dni) {
        super(nombre);
        this.dni = dni;
    }

    //Getter
    public String getDni() {
        return dni;
    }

    //Setter
    public void setDni(String dni) {
        this.dni = dni;
    }

    //Metodos
    @Override
    public String toString() {
        return "Operario: " + this.getNombre();
    }

    public void Datos(){
        System.out.println("Nombre: " + this.getNombre() + "\n" +
                "Dni: " + dni);
    }
}
