package Ejercicios_Clase_3.Ejercicios_Clase_3__21_3.Ejercicios_en_clase.Ejercicio_1;

public class PartTimeEmployee extends Employee{
    private double hourlyRate;
    private int hoursWorked;
    //Constructor
    public PartTimeEmployee(int id, String name, double salary, double hourlyRate, int hoursWorked) {
        super(id, name, salary);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }
    //Getter y Setter

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    //Metodos
    @Override
    public double CalculateSalary() {
        return super.CalculateSalary();
    }
    public void PartTimeEmployee(int id, String name, double salary, double hourlyRate, int hoursWorked){}

}
