import java.util.Scanner;

public class Ejercicio_6 {
    public static void main(String[] args) {
        /* 6.Pide al usuario que ingrese una frase y devuelve la cantidad de vocales
        y consonantes que tiene esa frase */
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese una frase
        System.out.println("Ingrese una frase:");
        String input = scanner.nextLine();

        // Inicializar contadores para las vocales y las consonantes
        int vowelsCount = 0;
        int consonantsCount = 0;

        // Iterar sobre cada caracter de la frase para contar las vocales y consonantes
        for (int i = 0; i < input.length(); i++) {
            char currentChar = Character.toLowerCase(input.charAt(i));

            // Verificar si el caracter actual es una vocal
            if (currentChar == 'a' || currentChar == 'e' || currentChar == 'i' || currentChar == 'o' || currentChar == 'u') {
                vowelsCount++;
            }
            // Verificar si el caracter actual es una consonante
            else if (currentChar >= 'a' && currentChar <= 'z') {
                consonantsCount++;
            }
        }

        // Mostrar el resultado al usuario
        System.out.println("Cantidad de vocales: " + vowelsCount);
        System.out.println("Cantidad de consonantes: " + consonantsCount);

        scanner.close();
    }
}
