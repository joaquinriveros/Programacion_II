package Trabajos_Practicos.Trabajo_Practico_N3.Clases.Ejercicio_4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<String, Student> students = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenú:");
            System.out.println("1. Agregar nuevo alumno");
            System.out.println("2. Mostrar lista de students");
            System.out.println("3. Calcular y mostrar la media de notas");
            System.out.println("4. Mostrar el alumno con la nota más alta");
            System.out.println("5. Buscar alumno por nombre");
            System.out.println("6. Salir");
            System.out.print("Elija una opción: ");

            int option = scanner.nextInt();
            scanner.nextLine();  // Limpiar el buffer de entrada

            switch (option) {
                case 1:
                    try {
                        System.out.print("Nombre del alumno: ");
                        String name = scanner.nextLine();
                        System.out.print("Edad del alumno: ");
                        int age = scanner.nextInt();
                        System.out.print("Nota del alumno: ");
                        double grade = scanner.nextDouble();

                        Student newStudent = new Student(name, age, grade);
                        students.put(name, newStudent);
                        System.out.println("Alumno agregado con éxito.");
                    } catch (Exception e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                case 2:
                    showStudentList(students);
                    break;
                case 3:
                    calculateMeanGrades(students);
                    break;
                case 4:
                    showStudentBestGrade(students);
                    break;
                case 5:
                    searchStudentByName(students, scanner);
                    break;
                case 6:
                    System.out.println("Saliendo del programa...");
                    return;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        }
    }

    private static void showStudentList(Map<String, Student> students) {
        if (students.isEmpty()) {
            System.out.println("La lista de alumnos está vacía.");
            return;
        }

        System.out.println("\nLista de Alumnos:");
        for (Student student : students.values()) {
            System.out.println(student);
        }
    }

    private static void calculateMeanGrades(Map<String, Student> students) {
        if (students.isEmpty()) {
            System.out.println("No hay alumnos para calcular la media de las notas.");
            return;
        }

        double sumGrades = 0;
        for (Student student : students.values()) {
            sumGrades += student.getGrade();
        }

        double mean = sumGrades / students.size();
        System.out.println("La media de notas de todos los alumnos es: " + mean);
    }

    private static void showStudentBestGrade(Map<String, Student> students) {
        if (students.isEmpty()) {
            System.out.println("No hay alumnos para mostrar.");
            return;
        }

        Student studentBestGrade = null;
        for (Student student : students.values()) {
            if (studentBestGrade == null || student.getGrade() > studentBestGrade.getGrade()) {
                studentBestGrade = student;
            }
        }

        System.out.println("Alumno con la nota más alta:");
        System.out.println(studentBestGrade);
    }

    private static void searchStudentByName(Map<String, Student> students, Scanner scanner) {
        if (students.isEmpty()) {
            System.out.println("No hay alumnos para buscar.");
            return;
        }

        System.out.print("Ingrese el nombre del alumno a buscar: ");
        String searchedName = scanner.nextLine();

        Student student = students.get(searchedName);
        if (student != null) {
            System.out.println("Información del alumno encontrado:");
            System.out.println(student);
        } else {
            System.out.println("No se encontró ningún alumno con ese nombre.");
        }
    }
}
