package Trabajos_Practicos.Trabajo_Practico_N4.Clases.Ejercicio_3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double base = 0;
        double height = 0;

        try {
            System.out.print("Ingrese la base del triángulo: ");
            base = scanner.nextDouble();

            System.out.print("Ingrese la altura del triángulo: ");
            height = scanner.nextDouble();

            if (base <= 0 || height <= 0) {
                throw new IllegalArgumentException("La base y la altura deben ser mayores que cero.");
            }

            double area = calculateTriangleArea(base, height);
            System.out.println("El área del triángulo es: " + area);
        } catch (InputMismatchException e) {
            System.out.println("Error: Entrada inválida. Debe ingresar números.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    public static double calculateTriangleArea(double base, double height) {
        return (base * height) / 2;
    }
}
