package Clase_2.Ejercicio_en_clase;

public class Auto extends Vehiculo{
    private boolean descapotable;
    private boolean techo;
    public Auto(){}

    public Auto(String duenio, int puertas, int ruedas, boolean descapotable) {
        super(duenio, puertas, ruedas);
        this.descapotable = descapotable;
        this.techo = true;
    }

    public boolean isDescapotable() {
        return descapotable;
    }

    public void setDescapotable(boolean descapotable) {
        this.descapotable = descapotable;
    }

    public boolean isTecho() {
        return techo;
    }

    public void setTecho(boolean techo) {
        this.techo = techo;
    }

    @Override
    protected void caracteristicas() {
        System.out.println("Dueño: " + this.getDuenio());
        System.out.println("Puertas: " + this.getPuertas());
        System.out.println("Ruedas: "+this.getRuedas());
        if (this.isDescapotable()) {
            System.out.println("Es descapotable.");
        }else {
            System.out.println("No es descapotable.");
        }
    }
    public void bajar(){
        if (this.isDescapotable()) {
            if (!this.isTecho()) {
                System.out.println("El techo ya esta bajo.");
            } else {
                System.out.println("El techo se ha bajado.");
                this.techo = false;
            }
        }
    }
    public void subir(){
        if (this.isDescapotable()) {
            if (this.isTecho()) {
                System.out.println("El techo ya esta subido.");
            } else {
                System.out.println("El techo se ha subido.");
                this.techo = true;
            }
        }
    }
}
