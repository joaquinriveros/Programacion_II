package Clase_1.Herencia.Ejercicio_1;

public class Camioneta extends Coche {
    int carga;

    public Camioneta(String color, int ruedas, int velocidad, int cilindrada, int carga) {
        super(color,ruedas,velocidad, cilindrada);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    @Override
    public String ObtenerAtributos(){
        return super.ObtenerAtributos() + "Carga: " + carga + "\n";
    }
}
