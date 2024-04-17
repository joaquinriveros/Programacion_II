package Clase_6.Ejercicio_Arrays.Ejercicio5;
/*
5-Leer 10 números enteros, almacenarlos en un arreglo
y determinar cuántas veces está repetido el mayor.
*/
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        List<Integer> lista5 = new ArrayList<>();
        System.out.println("_ Ingrese 10 enteros:");
        for (int i = 0; i < 10; i++) {
            lista5.add(lector.nextInt());
        }
        int max5 = lista5.get(0);
        int contMax5 = 1;
        for (int i = 1; i < lista5.size(); i++) {
            if (lista5.get(i) > max5) {
                max5 = lista5.get(i);
                contMax5 = 1;
            } else if (lista5.get(i) == max5) {
                contMax5++;
            }
        }
        System.out.println("_ El mayor número se repite " + contMax5 + " veces.");

    }
}
