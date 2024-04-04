package Clase_4.Ejercicio_3;
import Clase_4.Ejercicio_3.Clases.*;
public class Main {
    public static void main(String[] args) {
        // Simular enfrentamiento entre personajes
        Guerrero guerrero = new Guerrero(1, 100, "Guerrero");
        Mago mago = new Mago(1, 100, "Mago");
        Picaro picaro = new Picaro(1, 100, "Pícaro");

        // Simular ataques entre personajes
        mago.atacar(guerrero);
        guerrero.atacar(picaro);
        picaro.atacar(mago);

        // Mostrar resultado de los ataques
        System.out.println("Vida del Guerrero después del ataque del Mago: " + guerrero.getVida());
        System.out.println("Vida del Pícaro después del ataque del Guerrero: " + picaro.getVida());
        System.out.println("Vida del Mago después del ataque del Pícaro: " + mago.getVida());
    }
}
