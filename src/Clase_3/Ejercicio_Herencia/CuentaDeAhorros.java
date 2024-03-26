package Ejercicios_Clase_3.Ejercicio_Herencia;

public class CuentaDeAhorros extends Cuenta{
    private boolean cuentaAhorrosActiva;
    float comisionMensual = 0;

    //Constructor
    public CuentaDeAhorros(float saldo, float tasaAnual) {
        super(saldo, tasaAnual);
        VerificarCuentaDeAhorros();
    }

    //Metodos
    private void VerificarCuentaDeAhorros(){
        if (super.saldo >= 10000){
            this.cuentaAhorrosActiva = true;
        }else {
            this.cuentaAhorrosActiva = false;
        }
    }

    @Override
    public void Consignar(float cantidad) {
        super.Consignar(cantidad);
        VerificarCuentaDeAhorros();
    }

    @Override
    public void Retirar(float cantidad) {
        if (cuentaAhorrosActiva){
            super.Retirar(cantidad);
        }
        else {
            System.out.println("Bloqueada: Cuenta inactiva.");
        }
        VerificarCuentaDeAhorros();
    }

    @Override
    public void ExtractoMensual() {
        if (super.numeroRetiros > 4) {
            System.out.println("Ha superado la cantidad limite de extracciones mensuales.\n " +
                    "Se le cobraran $1000 a partir de ahora por cada extraccion.");
            super.ExtractoMensual();
            this.saldo -= 1000;
            comisionMensual += 1000;
            VerificarCuentaDeAhorros();
        }
    }

    @Override
    public void Imprimir() {
        System.out.println("Saldo: $" + saldo);
        System.out.println("Comision Mensual: " + comisionMensual);
        System.out.println("Transacciones Totales: " + (numeroConsignaciones + numeroRetiros));
    }
}
