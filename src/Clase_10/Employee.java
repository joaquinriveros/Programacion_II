package Clase_10;

import java.time.LocalDate;

public class Employee extends Person{

    //Atributos
    private EmployeeType employeeType;

    //Constructor
    public Employee(){}

    public Employee(String name, String surname, String phoneNumber, String email, LocalDate dateOfBirth, EmployeeType employeeType) {
        super(name, surname, phoneNumber, email, dateOfBirth);
        this.employeeType = employeeType;
    }

    //Getter y Setter
    public EmployeeType getEmployeeType() {
        return employeeType;
    }
    public void setEmployeeType(EmployeeType employeeType) {
        this.employeeType = employeeType;
    }
}
