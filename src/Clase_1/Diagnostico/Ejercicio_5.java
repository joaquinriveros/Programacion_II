import java.util.Scanner;

public class Ejercicio_5 {
    public static void main(String[] args) {
        /* 5. Crea un programa que pida al usuario un número mínimo y un máximo y
        muestre por pantalla todos los números primos incluidos en ese rango. Validar
        que mínimo sea menor que máximo.*/
        Scanner scanner = new Scanner(System.in);

        // Importar la clase Scanner para leer la entrada del usuario

        // Solicitar al usuario el número mínimo y el número máximo
        System.out.println("Ingrese el número mínimo:");
        int min = scanner.nextInt();

        System.out.println("Ingrese el número máximo:");
        int max = scanner.nextInt();

        // Validar que el número mínimo sea menor que el número máximo
        if (min >= max) {
            System.out.println("Error: El número mínimo debe ser menor que el número máximo.");
            return; // Salir del programa si la validación falla
        }

        System.out.println("Números primos entre " + min + " y " + max + ":");

        // Iterar sobre cada número en el rango y verificar si es primo
        for (int i = min; i <= max; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }

        scanner.close();
    }

    // Método para verificar si un número es primo
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false; // Los números menores o iguales a 1 no son primos
        }
        // Iterar desde 2 hasta la raíz cuadrada del número
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // Si el número es divisible por i, no es primo
            }
        }
        return true; // Si no se encontró ningún divisor, el número es primo
    }
}
