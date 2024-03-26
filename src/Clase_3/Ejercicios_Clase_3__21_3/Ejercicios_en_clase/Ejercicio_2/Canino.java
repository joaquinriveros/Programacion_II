package Ejercicios_Clase_3.Ejercicios_Clase_3__21_3.Ejercicios_en_clase.Ejercicio_2;

public abstract class Canino extends Animal{
    //Constructor
    public Canino(String foto, String comida, String localizacion, String tamanio) {
        super(foto, comida, localizacion, tamanio);
    }
    //Metodo
    @Override
    public void Rugir(){
        System.out.println("El can está rugiendo");
    }
}
