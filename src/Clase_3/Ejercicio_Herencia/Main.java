package Ejercicios_Clase_3.Ejercicio_Herencia;

public class Main {
    public static void main(String[] args) {
        // Crear una cuenta de ahorros con saldo inicial de $15000 y tasa anual del 5%
        CuentaDeAhorros cuentaAhorros = new CuentaDeAhorros(15000, 5);

        // Consignar $2000 a la cuenta de ahorros
        cuentaAhorros.Consignar(2000);

        // Retirar $500 de la cuenta de ahorros
        cuentaAhorros.Retirar(500);

        // Generar el extracto mensual de la cuenta de ahorros
        cuentaAhorros.ExtractoMensual();

        // Imprimir los detalles de la cuenta de ahorros
        cuentaAhorros.Imprimir();
    }
}
