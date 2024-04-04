package Clase_4.Ejercicio_3.Clases;
import Clase_4.Ejercicio_3.Interfaces.Personaje;

public class Guerrero extends PersonajeBase {
    //Constructor
    public Guerrero(int nivel, int vida, String nombre) {
        super(nivel, vida, nombre);
    }

    // Método para atacar
    public int atacar(Personaje objetivo) {
        // El guerrero inflige diferentes daños según el tipo de personaje objetivo
        int damage;
        if (objetivo instanceof Picaro) {
            damage = 15;
        } else if (objetivo instanceof Mago) {
            damage = 10;
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
        return 8;
    }

    // Método para defender
    @Override
    public int defender(int danio) {
        int armadura = 8; // Valor de armadura del guerrero
        return danio - armadura; // Ajustar daño basado en la armadura
    }
}