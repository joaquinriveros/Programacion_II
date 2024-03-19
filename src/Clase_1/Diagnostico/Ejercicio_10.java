import java.util.Scanner;

public class Ejercicio_10 {
    /* 10. Crea un programa en Java que solicite al usuario ingresar las notas
    de un conjunto de estudiantes y luego calcule el promedio de esas notas. El
    programa debe preguntar al usuario cuántas notas desea ingresar, luego leer
    las notas y finalmente calcular y mostrar el promedio. */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario el número de notas a ingresar
        System.out.println("Ingrese el número de notas que desea ingresar:");
        int numberOfGrades = scanner.nextInt();

        // Leer las notas ingresadas por el usuario
        double sumOfGrades = 0;
        for (int i = 1; i <= numberOfGrades; i++) {
            System.out.println("Ingrese la nota " + i + ":");
            double grade = scanner.nextDouble();
            sumOfGrades += grade;
        }

        // Calcular el promedio de las notas
        double averageGrade = sumOfGrades / numberOfGrades;

        // Mostrar el promedio de las notas
        System.out.println("El promedio de las notas ingresadas es: " + averageGrade);

        scanner.close();
    }
}
