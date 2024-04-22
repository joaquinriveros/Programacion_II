package Clase_1.Diagnostico;

import java.util.Scanner;

public class Ejercicio_1 {
    public static void main(String[] args) {
        /*1.	Crea una calculadora simple en Java que pueda realizar operaciones
        básicas como suma, resta, multiplicación y división. El programa debe solicitar
        al usuario que ingrese dos números y luego permitirle elegir la operación que
        desea realizar. Una vez completada la operación, debe mostrar el resultado al
        usuario. Cada operación debe implementarse en un método diferente. El programa
        principal debe llamar a estos métodos según la operación seleccionada por el
        usuario.*/

        // Leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Mensaje de bienvenida
        System.out.println("¡¡¡Bienvenido a tu calculadora!!!");

        // Solicitar al usuario que ingrese un primer número
        System.out.println("Ingresa el primer número:");
        int number1 = scanner.nextInt(); // Leer el primer número

        // Solicitar al usuario que ingrese un segundo número
        System.out.println("Ingresa el segundo número:");
        int number2 = scanner.nextInt(); // Leer el segundo número

        // Opciones disponibles al usuario
        System.out.println("Elige una opción: ");
        System.out.println("1_ Suma");
        System.out.println("2_ Resta");
        System.out.println("3_ Multiplicación");
        System.out.println("4_ División");

        // Leer la opción seleccionada por el usuario
        int option = scanner.nextInt();

        // Realizar la operación correspondiente según la opción seleccionada
        switch (option) {
            case 1:
                add_numbers(number1, number2); // Llamar al método sumar
                break;
            case 2:
                subtract_numbers(number1, number2); // Llamar al método restar
                break;
            case 3:
                multiplication_numbers(number1, number2); // Llamar al método multiplicar
                break;
            case 4:
                divide_numbers(number1, number2); // Llamar al método dividir
                break;
            default:
                System.out.println("Opción inválida"); // Mensaje para opciones no válidas
        }

        // Cerrar el objeto Scanner para liberar recursos
        scanner.close();
    }

    // Método para sumar dos números y mostrar el resultado
    public static void add_numbers(int a, int b) {
        System.out.println("El resultado de la suma es: " + (a + b));
    }

    // Método para restar dos números y mostrar el resultado
    public static void subtract_numbers(int a, int b) {
        System.out.println("El resultado de la resta es: " + (a - b));
    }

    // Método para multiplicar dos números y mostrar el resultado
    public static void multiplication_numbers(int a, int b) {
        System.out.println("El resultado de la multiplicación es: " + (a * b));
    }

    // Método para dividir dos números y mostrar el resultado
    public static void divide_numbers(int a, int b) {
        if (b != 0) {
            System.out.println("El resultado de la división es: " + (a / b));
        } else {
            System.out.println("No se puede dividir por cero."); // Mensaje para división por cero
        }
    }
}
