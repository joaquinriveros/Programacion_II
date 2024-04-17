package Clase_6.Ejercicio_Arrays.Ejercicio3;
/*
3-Almacenar en un arreglo de 10 posiciones los 10 números primos comprendidos
entre 100 y 300. Luego mostrarlos en pantalla.
*/
import java.util.ArrayList;

public class Ejercicicio3 {
    public static void main(String[] args) {
        ArrayList<Integer> lista3 = new ArrayList<>();
        int contadorPrimos = 0;
        for (int i = 100; i <= 300; i++) {
            if (esPrimo(i)) {
                lista3.add(i);
                contadorPrimos++;
            }
            if (contadorPrimos == 10) {
                break;
            }
        }
        System.out.println("_ Los 10 números primos entre 100 y 300 son:");
        for (int numero : lista3) {
            System.out.print(numero + " ");
        }
        System.out.println();
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
