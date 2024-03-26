package Ejercicios_Clase_3.Ejercicio_Herencia;

public class Cuenta {
    protected float saldo;
    protected int numeroConsignaciones = 0;
    protected int numeroRetiros = 0;
    protected float tasaAnual;
    protected float comisionAnual = 0;

    //Constructor
    public Cuenta(){}
    public Cuenta(float saldo, float tasaAnual) {
        this.saldo = saldo;
        this.tasaAnual = tasaAnual;
    }

    //Getter y Setter
    public float getSaldo() {
        return saldo;
    }
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float getTasaAnual() {
        return tasaAnual;
    }
    public void setTasaAnual(float tasaAnual) {
        this.tasaAnual = tasaAnual;
    }

    //Metodos
    public void Consignar(float cantidad){
        if (cantidad > 0) {
            this.saldo += cantidad;
            this.numeroConsignaciones += 1;
        }else {
            System.out.println("Ingreso incorrecto.");
        }
    }
    public void Retirar(float cantidad){
        if (this.saldo >= cantidad ) {
            this.saldo -= cantidad;
            this.numeroRetiros += 1;
        }else {
            System.out.println("Fondos insuficientes.");
        }
    }
    private void CalcularInteres(){
        float interesMensual = tasaAnual / 12;
        this.saldo *= (1 + interesMensual / 100);
    }
    public void ExtractoMensual(){
        float comisionMensual = comisionAnual / 12;
        this.saldo -= comisionMensual;
        CalcularInteres();
    }
    public void Imprimir(){
        System.out.println("Saldo: $" + saldo);
        System.out.println("Numero de Consignaciones: " + numeroConsignaciones);
        System.out.println("Numero de Retiros: " + numeroRetiros);
        System.out.println("Tasa Anual: " + tasaAnual);
        System.out.println("Comision Anual: " + comisionAnual);
    }
}
