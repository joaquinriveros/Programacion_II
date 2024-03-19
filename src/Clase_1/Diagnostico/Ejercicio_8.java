import java.util.Scanner;

public class Ejercicio_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxNumber = Integer.MIN_VALUE;
        int minNumber = Integer.MAX_VALUE;
        int sum = 0;
        int positiveSum = 0;
        int negativeSum = 0;
        int count = 0;

        // Pedir números al usuario hasta que se ingrese -1
        System.out.println("Ingrese números (ingrese -1 para terminar):");
        int number = scanner.nextInt();
        while (number != -1) {
            /*8.	Pedir números al usuario y cuando el usuario meta un -1 se terminará
            el programa.
            Al terminar, mostrará lo siguiente:
            a.	mayor numero introducido
            b.	menor numero introducido
            c.	suma de todos los numeros
            d.	suma de los numeros positivos
            e.	suma de los numeros negativos
            f.	media de la suma (la primera que pido)
            El número -1 no contara como número. */

            // Verificar si el número es el máximo o el mínimo hasta el momento
            maxNumber = Math.max(maxNumber, number);
            minNumber = Math.min(minNumber, number);

            // Sumar el número al total
            sum += number;

            // Determinar si el número es positivo o negativo y sumarlo en consecuencia
            if (number > 0) {
                positiveSum += number;
            } else if (number < 0) {
                negativeSum += number;
            }

            // Incrementar el contador de números
            count++;

            // Pedir el siguiente número
            number = scanner.nextInt();
        }

        // Mostrar los resultados
        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("a. Mayor número introducido: " + maxNumber);
            System.out.println("b. Menor número introducido: " + minNumber);
            System.out.println("c. Suma de todos los números: " + sum);
            System.out.println("d. Suma de los números positivos: " + positiveSum);
            System.out.println("e. Suma de los números negativos: " + negativeSum);
            System.out.println("f. Media de la suma: " + average);
        } else {
            System.out.println("No se ingresaron números.");
        }

        scanner.close();
    }
}
