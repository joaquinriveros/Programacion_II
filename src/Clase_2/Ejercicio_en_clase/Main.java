package Clase_2.Ejercicio_en_clase;

public class Main {
    public static void main(String[] args) {
        Auto auto = new Auto("Jose Fausti",5,4,true);
        Camion camion = new Camion("Jose Fausti",2,6,1600);

        auto.caracteristicas();
        auto.subir();
        auto.bajar();

        System.out.println();

        camion.caracteristicas();
        camion.caracteristicas(1600);
    }
}
