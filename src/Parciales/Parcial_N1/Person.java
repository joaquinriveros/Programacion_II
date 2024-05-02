package Parciales.Parcial_N1;

public abstract class Person {

    //Attributes - Atributos
    private String name;
    private int DNI;

    //Builder - Constructor
    public Person(String name, int DNI) {
        this.name = name;
        this.DNI = DNI;
    }

    //Getter and Setter
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getDNI() {
        return DNI;
    }
    public void setDNI(int dni) {
        this.DNI = dni;
    }
}