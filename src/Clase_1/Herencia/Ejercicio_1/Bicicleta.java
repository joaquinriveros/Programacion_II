package Clase_1.Herencia.Ejercicio_1;

public class Bicicleta extends Vehiculo {
    String tipo_bici;

    public Bicicleta(String color, int ruedas, String tipo_bici) {
        super(color, ruedas);
        this.tipo_bici = tipo_bici;
    }

    public String getTipo_bici() {
        return tipo_bici;
    }

    public void setTipo_bici(String tipo_bici) {
        this.tipo_bici = tipo_bici;
    }

    @Override
    public String ObtenerAtributos() {
        return super.ObtenerAtributos() + "Tipo: " + tipo_bici + "\n";
    }
}
