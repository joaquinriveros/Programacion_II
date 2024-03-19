import java.util.Scanner;

public class Ejercicio_2 {
    public static void main(String[] args) {
        /* 2. Crea un programa en Java que convierta la temperatura de grados
        Celsius a Fahrenheit y viceversa. El programa debe permitir al usuario
        elegir la dirección de la conversión y luego ingresar la temperatura a
        convertir */

        // Crear objetos Scanner para leer la entrada del usuario
        Scanner temperature = new Scanner(System.in);
        Scanner option_user = new Scanner(System.in);

        // Mensaje de bienvenida y explicación del programa
        System.out.println("Convertidor de Celsius a Fahrenheit y viceversa");

        // Solicitar al usuario ingresar la temperatura a convertir
        System.out.println("Ingrese el grado de temperatura que desea convertir (solo números): ");
        int temperature_degree = temperature.nextInt();

        // Presentar opciones de conversión al usuario
        System.out.println("Seleccione una de las siguientes opciones: ");
        System.out.println("1_ Celsius a Fahrenheit");
        System.out.println("2_ Fahrenheit a Celsius");
        int option = option_user.nextInt();

        // Realizar la conversión según la opción seleccionada por el usuario
        switch (option){
            case 1:
                Fahrenheit(temperature_degree); // Llamar al método para convertir de Celsius a Fahrenheit
                break;
            case 2:
                Celsius(temperature_degree); // Llamar al método para convertir de Fahrenheit a Celsius
                break;
            default:
                System.out.println("Opción Inválida"); // Mensaje para opciones no válidas
        }
    }

    // Método para convertir de Celsius a Fahrenheit
    public static void Fahrenheit(int a) {
        System.out.println("Celsius a Fahrenheit: " + ((a * 9/5) + 32) + "°");
    }

    // Método para convertir de Fahrenheit a Celsius
    public static void Celsius(int a) {
        System.out.println("Fahrenheit a Celsius: " + ((a-32) * 5/9) + "°");
    }
}
