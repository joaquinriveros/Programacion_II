package Trabajos_Practicos.Trabajo_Practico_N4.Clases.Ejercicio_1;


import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int guessNumber = random.nextInt(100) + 1; //Generamos un número entre el 1 y el 100 aleatorio
        int tries = 0;

        System.out.println("Jugemos a las adivinanzas: Adivina el numero.");
        System.out.println("---------------------------------------------");
        while (true) {
            try {
                System.out.print("Ingrese un número del 1 al 100: ");
                int number = scanner.nextInt();
                scanner.nextLine();//Limpiamos el scanner
                if (number < 1 || number > 100) {
                    throw new IllegalArgumentException(("Número fuera del rango requerido"));
                } else {
                    if (whoIsTheNumber(number, guessNumber)) {
                        System.out.println("Has Ganado!. Numero de intentos: " + tries);
                        break;
                    } else {
                        tries++;
                    }
                }
            }catch (InputMismatchException ime){
                System.out.println("El valor ingresado debe ser numerico");
                tries++;
            }catch (IllegalArgumentException iae){
                iae.getMessage();
            }catch(Exception e){
                System.out.println("Ocurrio un error: " + e.getMessage());
                tries++;
            }
            System.out.println("//Ingrese si para salir. Pulse cualquier otra opcion para continuar.//");
            String giveUp = scanner.nextLine();
            if (giveUp.equalsIgnoreCase("si")){
                break;
            }
            System.out.println("----------------------------------");
        }
    }
    private static boolean whoIsTheNumber(int number, int guessNumber){
        if (number == guessNumber){
            return true;
        } else if (number < guessNumber) {
            System.out.println("El numero es mas grande");
        } else if (number > guessNumber) {
            System.out.println("El numero es mas pequeño");
        }
        return false;
    }
}
