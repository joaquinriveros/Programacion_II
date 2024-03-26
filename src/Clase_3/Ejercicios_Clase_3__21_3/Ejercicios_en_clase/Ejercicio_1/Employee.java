package Ejercicios_Clase_3.Ejercicios_Clase_3__21_3.Ejercicios_en_clase.Ejercicio_1;

public abstract class Employee {
    private int id;
    private String name;
    private double salary;
    //Constructor
    public Employee(){}
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    //Getter y Setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    //Metodos
    public double CalculateSalary(){
        return salary;
    }
    public void Employee(int id, String name, double salary){}
}
