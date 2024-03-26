package Ejercicios_Clase_3.Ejercicios_Clase_3__21_3.Ejercicios_en_clase.Ejercicio_1;

public class FullTimeEmployee extends Employee{
    private double yearlyBonus;
    //Constructor
    public FullTimeEmployee(int id, String name, double salary, double yearlyBonus) {
        super(id, name, salary);
        this.yearlyBonus = yearlyBonus;
    }
    //Getter y Setter

    public double getYearlyBonus() {
        return yearlyBonus;
    }

    public void setYearlyBonus(double yearlyBonus) {
        this.yearlyBonus = yearlyBonus;
    }
    //Metodos
    @Override
    public double CalculateSalary() {
        return super.CalculateSalary();
    }
    public void FullTimeEmployee(int id,String name,double salary,double yearlyBonus){

    }
}
