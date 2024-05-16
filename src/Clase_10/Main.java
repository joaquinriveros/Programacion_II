package Clase_10;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Crear un cliente
        Client client = new Client("John", "Doe", "123456789", "john@example.com", LocalDate.of(1990, 5, 15));

        // Mostrar información del cliente
        System.out.println("Cliente:");
        System.out.println("Nombre: " + client.getName());
        System.out.println("Apellido: " + client.getSurname());
        System.out.println("Teléfono: " + client.getPhoneNumber());
        System.out.println("Email: " + client.getEmail());
        System.out.println("Fecha de nacimiento: " + client.getDateOfBirth());

        // Crear un empleado
        Employee employee = new Employee("Jane", "Smith", "987654321", "jane@example.com", LocalDate.of(1985, 10, 20), EmployeeType.ADMIN);

        // Mostrar información del empleado
        System.out.println("\nEmpleado:");
        System.out.println("Nombre: " + employee.getName());
        System.out.println("Apellido: " + employee.getSurname());
        System.out.println("Teléfono: " + employee.getPhoneNumber());
        System.out.println("Email: " + employee.getEmail());
        System.out.println("Fecha de nacimiento: " + employee.getDateOfBirth());
        System.out.println("Tipo de empleado: " + employee.getEmployeeType());
    }
}

