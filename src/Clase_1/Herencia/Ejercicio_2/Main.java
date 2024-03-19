package Clase_1.Herencia.Ejercicio_2;

public class Main {
    public static void main(String[] args) {
        // Crear instancias de cada tipo de animal
        Perro miPerro = new Perro("Fido", 5, "Macho","Labrador");
        Gato miGato = new Gato("Whiskers", 3, "Macho","Siamés");
        Pajaro miPajaro = new Pajaro("Tweetie", 2, "Hembra","Canario de las Indias");

        // Llamar a los métodos hacer_sonido() e informacion() de cada animal
        miPerro.hacerSonido();
        System.out.println(miPerro.Informacion());
        System.out.println();

        miGato.hacerSonido();
        System.out.println(miGato.Informacion());
        System.out.println();

        miPajaro.hacerSonido();
        System.out.println(miPajaro.Informacion());
    }
}
