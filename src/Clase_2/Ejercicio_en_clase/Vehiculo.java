package Clase_2.Ejercicio_en_clase;

public abstract class Vehiculo {
    private String duenio;
    private int puertas;
    private int ruedas;
    public Vehiculo(){}
    public Vehiculo(String duenio, int puertas, int ruedas) {
        this.duenio = duenio;
        this.puertas = puertas;
        this.ruedas = ruedas;
    }

    public String getDuenio() {
        return duenio;
    }

    public void setDuenio(String duenio) {
        this.duenio = duenio;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public int getRuedas() {
        return ruedas;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }


    protected abstract void caracteristicas();
}
