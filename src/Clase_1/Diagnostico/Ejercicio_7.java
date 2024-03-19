import java.util.Scanner;

public class Ejercicio_7 {
    public static void main(String[] args) {
        /* 7.	Crea una aplicación llamada CalculadoraPolacaInversaApp, nos pedirá
        2 operandos (int) y un signo aritmético (String), según este último se realizara
        la operación correspondiente. Al final mostrara el resultado en un cuadro de
        dialogo.
        Los signos aritméticos disponibles son:
        a.	+: suma los dos operandos.
        b.	-: resta los operandos.
        c.	*: multiplica los operandos.
        d.	/: divide los operandos, este debe dar un resultado con decimales (double)
        e.	^:  1º operando como base y 2º como exponente.
        f.	%:  módulo, resto de la división entre operando1 y operando2.
        */
        Scanner scanner = new Scanner(System.in);

        // Solicitar los operandos y el signo aritmético al usuario
        System.out.println("Ingrese el primer operando (int):");
        int operand1 = scanner.nextInt();

        System.out.println("Ingrese el segundo operando (int):");
        int operand2 = scanner.nextInt();

        System.out.println("Ingrese el signo aritmético (+, -, *, /, ^, %):");
        String operator = scanner.next();

        // Realizar la operación correspondiente según el signo aritmético
        double result = 0;
        switch (operator) {
            case "+":
                result = operand1 + operand2;
                break;
            case "-":
                result = operand1 - operand2;
                break;
            case "*":
                result = operand1 * operand2;
                break;
            case "/":
                if (operand2 != 0) {
                    result = (double) operand1 / operand2; // División con resultado double
                } else {
                    System.out.println("Error: No se puede dividir por cero.");
                    return;
                }
                break;
            case "^":
                result = Math.pow(operand1, operand2); // Exponenciación
                break;
            case "%":
                result = operand1 % operand2; // Módulo
                break;
            default:
                System.out.println("Error: Signo aritmético no válido.");
                return;
        }

        // Paso 3: Mostrar el resultado
        System.out.println("El resultado es: " + result);

        scanner.close();
    }
}
