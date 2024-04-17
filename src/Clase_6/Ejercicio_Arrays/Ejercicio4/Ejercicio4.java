package Clase_6.Ejercicio_Arrays.Ejercicio4;
/*
4-Leer 10 números enteros, almacenarlos en un arreglo y determinar en qué posiciones
se encuentran los números terminados en 4.
*/
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        int[] arreglo4 = new int[10];
        System.out.println("_ Ingrese 10 enteros:");
        for (int i = 0; i < 10; i++) {
            arreglo4[i] = lector.nextInt();
        }
        System.out.println("_ Los números terminados en 4 están en las posiciones:");
        for (int i = 0; i < 10; i++) {
            if (arreglo4[i] % 10 == 4) {
                System.out.print(i + " ");
            }
        }

    }
}
