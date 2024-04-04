package Clase_4.Ejercicio_2;

import Clase_4.Ejercicio_2.Clases.Circulo;
import Clase_4.Ejercicio_2.Clases.Cuadrado;

public class Main {
    public static void main(String[] args) {
        Cuadrado cuadrado1 = new Cuadrado(4);
        Circulo circulo1 = new Circulo(2);

        System.out.println("El area del cuadrado es = "+cuadrado1.Area());
        cuadrado1.Dibujar();
        cuadrado1.Rotar();

        System.out.println("El area del circulo es = "+circulo1.Area());
        circulo1.Dibujar();
    }
}
