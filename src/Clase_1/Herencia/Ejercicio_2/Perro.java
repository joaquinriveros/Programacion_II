package Clase_1.Herencia.Ejercicio_2;

public class Perro extends Animal{
    String raza;
    public Perro(String nombre, int edad, String genero,String raza) {
        super(nombre, edad, genero);
        this.raza = raza;
    }

    @Override
    public void hacerSonido() {
        System.out.println("El perro ladra");;
    }

    @Override
    public String Informacion() {
        return super.Informacion() + "Raza: " + raza;
    }
}
