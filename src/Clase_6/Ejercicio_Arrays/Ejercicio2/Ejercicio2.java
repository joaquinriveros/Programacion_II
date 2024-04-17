package Clase_6.Ejercicio_Arrays.Ejercicio2;
/*
2-Leer 10 enteros, almacenarlos en un arreglo y determinar en qué posición del arreglo
está el mayor número primo leído.
*/
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        System.out.println("_ Ingrese 10 enteros:");
        for (int i = 0; i < 10; i++) {

            list.add(lector.nextInt());
        }
        int maxPrimo = 0;
        int posMaxPrimo = -1;
        for (int i = 0; i < list.size(); i++) {
            int num = list.get(i);
            if (esPrimo(num) && num > maxPrimo) {
                maxPrimo = num;
                posMaxPrimo = i;
            }
        }
        System.out.println("_ El mayor número primo está en la posición: " + posMaxPrimo);

    }
    public static boolean esPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
