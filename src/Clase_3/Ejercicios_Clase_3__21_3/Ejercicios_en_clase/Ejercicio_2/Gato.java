package Ejercicios_Clase_3.Ejercicios_Clase_3__21_3.Ejercicios_en_clase.Ejercicio_2;

public class Gato extends Felino{
    //Constructor
    public Gato(String foto, String comida, String localizacion, String tamanio) {
        super(foto, comida, localizacion, tamanio);
    }
    //Metodos

    @Override
    public void Rugir() {
        System.out.println("El gato esta rugiendo");
    }

    @Override
    public void Comer() {
        System.out.println("El gato está comiendo");
    }

    @Override
    public void HacerRuido() {
        System.out.println("Ruido de gato");
    }
    public void Vacunar(){
        System.out.println("El gato se está vacunando");
    }
}
