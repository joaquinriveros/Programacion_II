package Clase_4.Ejercicio_3.Clases;

import Clase_4.Ejercicio_3.Interfaces.Personaje;
public class Mago extends PersonajeBase {
    //Constructor
    public Mago(int nivel, int vida, String nombre) {
        super(nivel, vida, nombre);
    }

    // Método para atacar
    public int atacar(Personaje objetivo) {
        // El mago inflige diferentes daños según el tipo de personaje objetivo
        int damage;
        if (objetivo instanceof Picaro) {
            damage = 10;
        } else if (objetivo instanceof Guerrero) {
            damage = 15;
        } else {
            damage = atacar(); // Valor de daño predeterminado para otros tipos de personajes
        }

        // Actualizar la vida del objetivo
        objetivo.recibirDanio(defender(damage)); //Defensa automatica después del ataque
        return 0;
    }

    // Método para atacar (copia del método original para mantener compatibilidad)
    @Override
    public int atacar() {
        return 5;
    }

    // Método para defender
    @Override
    public int defender(int danio) {
        int defensaMagica = 8; // Defensa mágica del mago
        return danio - defensaMagica; // Ajustar daño basado en la defensa mágica
    }
}
