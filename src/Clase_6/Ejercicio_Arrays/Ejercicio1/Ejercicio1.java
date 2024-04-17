package Clase_6.Ejercicio_Arrays.Ejercicio1;
/*
1-Leer 10 enteros, almacenarlos en un arreglo y
determinar en qué posición del arreglo está el mayor número leído.
*/
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        int [] arrangement = new int[10];
        System.out.println("_ Ingrese 10 enteros: ");
        for (int i= 0; i < 10; i++) {
            arrangement[i] = lector.nextInt();
        }
        int max= arrangement[0];
        int posMax = 0;
        for (int i = 1; i < 10; i++) {
            if (arrangement[i] > max) {
                max= arrangement[i];
                posMax=i;
            }
        }
        System.out.println("_ El mayor número está en la posición: "+posMax);
    }
}
