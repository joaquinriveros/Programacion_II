import java.util.Scanner;

public class Ejercicio_9 {
    public static void main(String[] args) {
        /* 9. Crea un programa en Java que permita al usuario sumar dos matrices
        de tamaño NxM. El programa debe solicitar al usuario que ingrese las dimensiones
        de las matrices y luego ingresar los elementos de cada matriz. Después de eso,
        debe calcular la suma de las dos matrices (resultando una tercera matriz con la
        suma de los elementos de igual posición de las matrices operandos) e imprimir el
        resultado. */
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario las dimensiones de las matrices
        System.out.println("Ingrese el número de filas (N) de las matrices:");
        int rows = scanner.nextInt();

        System.out.println("Ingrese el número de columnas (M) de las matrices:");
        int columns = scanner.nextInt();

        // Crear las matrices y pedir al usuario que ingrese los elementos
        int[][] matrix1 = enterMatrix(rows, columns, scanner);
        int[][] matrix2 = enterMatrix(rows, columns, scanner);

        // Calcular la suma de las matrices
        int[][] sumMatrix = addMatrices(matrix1, matrix2);

        // Imprimir la matriz resultante
        System.out.println("La suma de las matrices es:");
        printMatrix(sumMatrix);

        scanner.close();
    }

    // Método para ingresar una matriz desde la entrada estándar
    public static int[][] enterMatrix(int rows, int columns, Scanner scanner) {
        System.out.println("Ingrese los elementos de la matriz:");

        int[][] matrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.println("Ingrese el elemento en la posición [" + i + "][" + j + "]:");
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }

    // Método para sumar dos matrices
    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int columns = matrix1[0].length;
        int[][] sumMatrix = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return sumMatrix;
    }

    // Método para imprimir una matriz
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
