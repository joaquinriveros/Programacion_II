package Clase_4.Ejercicio_3.Clases;

import Clase_4.Ejercicio_3.Interfaces.Personaje;

public abstract class PersonajeBase implements Personaje {
    private int nivel;
    private int vida;
    private String nombre;

    //Constructor
    public PersonajeBase(int nivel, int vida, String nombre) {
        this.nivel = nivel;
        this.vida = vida;
        this.nombre = nombre;
    }

    //Getter y Setter
    public int getNivel() {
        return nivel;
    }
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getVida() {
        return vida;
    }
    public void setVida(int vida) {
        this.vida = vida;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //Metodos
    @Override
    public void recibirDanio(int danio) {
        vida -= danio;
        if (vida < 0) {
            vida = 0;
        }
    }
    @Override
    public int defender(int danio) {
        return 0;
    }
}
