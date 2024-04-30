package Trabajos_Practicos.Trabajo_Practico_N4.Clases.Ejercicio_2;

import java.util.Scanner;

public class Excepciones2Resuelto {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        double n;
        int posicion = 0;
        String cadena;
        double[] valores = {9.83, 4.5, -3.06, 0.06, 2.52, -11.3, 7.60, 3.00, -30.4, 105.2};

        System.out.println("Contenido del array antes de modificar:");
        for (int i = 0; i < valores.length; i++) {
            System.out.printf("%.2f ", valores[i]);
        }

        try {
            System.out.print("\n\nIntroduce la posición del array a modificar: ");
            cadena = sc.nextLine();
            posicion = Integer.parseInt(cadena);

            if (posicion < 0 || posicion >= valores.length) {
                throw new IllegalArgumentException("La posición ingresada está fuera del rango válido.");
            }

            System.out.print("\nIntroduce el nuevo valor de la posición " + posicion + ": ");
            n = sc.nextDouble();

            valores[posicion] = n;

            System.out.println("\nPosición modificada: " + posicion);
            System.out.println("Nuevo valor: " + n);
            System.out.println("Contenido del array modificado:");
            for (int i = 0; i < valores.length; i++) {
                System.out.printf("%.2f ", valores[i]);
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: Debe ingresar un número entero para la posición.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error inesperado: " + e.getMessage());
        }
    }
}
