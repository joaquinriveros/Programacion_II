package Ejercicios_Clase_3.Ejercicios_Clase_3__21_3.Ejercicios_en_clase.Ejercicio_2;

public class Main {
    public static void main(String[] args) {
        Leon leon = new Leon("leon.png","carne","Sabana Africana","Gran tamaño");
        leon.Comer();
        System.out.println();
        leon.HacerRuido();
        System.out.println();
        leon.Dormir();
        System.out.println();
        leon.Rugir();

        System.out.println();
        System.out.println();

        Tigre tigre = new Tigre("tigre.png","carne","Selva","Gran tamaño");
        tigre.Comer();
        System.out.println();
        tigre.HacerRuido();
        System.out.println();
        tigre.Dormir();
        System.out.println();
        tigre.Rugir();

        System.out.println();
        System.out.println();

        Gato gato = new Gato("gato.png","pescado","Cosmopolita","Pequeño tamaño");
        gato.Comer();
        System.out.println();
        gato.HacerRuido();
        System.out.println();
        gato.Vacunar();
        System.out.println();
        gato.Dormir();
        System.out.println();
        gato.Rugir();

        System.out.println();
        System.out.println();

        Lobo lobo = new Lobo("lobo.png","carne","Cosmopolita","Gran tamaño");
        lobo.Comer();
        System.out.println();
        lobo.HacerRuido();
        System.out.println();
        lobo.Dormir();

        System.out.println();
        System.out.println();

        Perro perro = new Perro("perro.png","carne","Cosmopolita","Pequeño - Gran tamaño");
        perro.Comer();
        System.out.println();
        perro.HacerRuido();
        System.out.println();
        perro.Vacunar();
        System.out.println();
        perro.SacarPaseo();
        System.out.println();
        perro.Dormir();
    }
}
