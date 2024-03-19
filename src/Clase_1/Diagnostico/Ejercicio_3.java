import java.util.Scanner;

public class Ejercicio_3 {
    public static void main(String[] args) {
        /* 3. Pide por teclado dos números y genera 10 números aleatorios entre esos
        números. Usa el método Math.random para generar un número entero aleatorio.*/
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner number = new Scanner(System.in);

        // Mensaje de instrucción para el usuario
        System.out.println("Ingrese a continuación dos números para generar aleatoriamente 10 números contenidos entre ambos");

        // Solicitar al usuario que ingrese los dos números
        System.out.println("Numero 1: ");
        int number1 = number.nextInt(); // Leer el primer número ingresado por el usuario
        System.out.println("Numero 2: ");
        int number2 = number.nextInt(); // Leer el segundo número ingresado por el usuario

        // Calcular el rango entre los dos números ingresados
        int minimum = Math.min(number1, number2);
        int maximum = Math.max(number1, number2);
        int range = maximum - minimum + 1;

        // Generar y mostrar los 10 números aleatorios dentro del rango especificado
        System.out.println("Generando 10 números aleatorios entre " + number1 + " y " + number2 + ":");
        for (int i = 0; i < 10; i++) {
            // Generar un número aleatorio dentro del rango
            int random_number = (int) (Math.random() * range) + minimum;
            // Mostrar el número aleatorio generado
            System.out.println("Número " + (i + 1) + ": " + random_number);
        }
    }
}

