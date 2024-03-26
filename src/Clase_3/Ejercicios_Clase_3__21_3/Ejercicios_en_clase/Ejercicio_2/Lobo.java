package Ejercicios_Clase_3.Ejercicios_Clase_3__21_3.Ejercicios_en_clase.Ejercicio_2;

public class Lobo extends Canino{
    //Constructor
    public Lobo (String foto, String comida, String localizacion, String tamanio) {
        super(foto, comida, localizacion, tamanio);
    }
    //Metodos
    @Override
    public void Comer() {
        System.out.println("El lobo está comiendo");
    }
    @Override
    public void HacerRuido() {
        System.out.println("Ruido de lobo");
    }
}
