package Ejercicios_Clase_3.Ejercicios_Clase_3__21_3.Ejercicios_en_clase.Ejercicio_2;

public class Perro extends Canino{
    //Constructor
    public Perro(String foto, String comida, String localizacion, String tamanio) {
        super(foto, comida, localizacion, tamanio);
    }
    //Metodos
    @Override
    public void Comer() {
        System.out.println("El Perro está comiendo");
    }
    @Override
    public void HacerRuido() {
        System.out.println("Ruido de perro");
    }
    public void Vacunar(){
        System.out.println("El perro se está vacunando");
    }
    public void SacarPaseo(){
        System.out.println("El perro se sacó a pasear");
    }
}
