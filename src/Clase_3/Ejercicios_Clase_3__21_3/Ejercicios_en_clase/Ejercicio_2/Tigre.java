package Ejercicios_Clase_3.Ejercicios_Clase_3__21_3.Ejercicios_en_clase.Ejercicio_2;

public class Tigre extends Felino{
    //Constructor
    public Tigre(String foto, String comida, String localizacion, String tamanio) {
        super(foto, comida, localizacion, tamanio);
    }
    //Metodos

    @Override
    public void Rugir() {
        System.out.println("El tigre está rugiendo");
    }

    @Override
    public void Comer() {
        System.out.println("El tigre está comiendo");
    }

    @Override
    public void HacerRuido() {
        System.out.println("Ruido de Tigre");
    }
}
