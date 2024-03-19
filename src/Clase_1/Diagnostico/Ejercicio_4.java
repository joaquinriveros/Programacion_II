import java.util.Scanner;

public class Ejercicio_4 {
    public static void main(String[] args) {
        /* 4. Pide un número por teclado e indica si es un número primo o no. */
        Scanner num = new Scanner(System.in);
        System.out.println("Ingresa un número para saber si es primo o no:");
        int number = num.nextInt();
        if (esPrimo(number)) {
            System.out.println(number + " es primo");
        } else {
            System.out.println(number + " no es primo");
        }
    }
    public static boolean esPrimo(int number) {
        if (number <= 1) {
            return false; // Los números menores o iguales a 1 no son primos
        }
        // Iterar desde 2 hasta la raíz cuadrada del número
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // Si el número es divisible por i, no es primo
            }
        }
        return true; // Si no se encontró ningún divisor, el número es primo/
    }
}
