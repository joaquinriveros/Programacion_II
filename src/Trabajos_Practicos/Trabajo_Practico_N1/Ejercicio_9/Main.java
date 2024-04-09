package Trabajos_Practicos.Trabajo_Practico_N1.Ejercicio_9;

public class Main {
    public static void main(String[] args) {
        // Crear instancias de Circulo
        Circulo circulo1 = new Circulo(5.0);
        Circulo circulo2 = new Circulo(7.5);

        // Calcular el perímetro y área de los círculos
        double perimetroCirculo1 = circulo1.calcularPerimetro();
        double areaCirculo1 = circulo1.calcularArea();
        double perimetroCirculo2 = circulo2.calcularPerimetro();
        double areaCirculo2 = circulo2.calcularArea();

        // Imprimir resultados
        System.out.println("Círculo 1:");
        System.out.println("Perímetro: " + perimetroCirculo1);
        System.out.println("Área: " + areaCirculo1);
        System.out.println("Círculo 2:");
        System.out.println("Perímetro: " + perimetroCirculo2);
        System.out.println("Área: " + areaCirculo2);

        // Crear instancias de Rectangulo
        Rectangulo rectangulo1 = new Rectangulo(3, 4);
        Rectangulo rectangulo2 = new Rectangulo(5, 6);

        // Calcular el perímetro y área de los rectángulos
        double perimetroRectangulo1 = rectangulo1.calcularPerimetro();
        double areaRectangulo1 = rectangulo1.calcularArea();
        double perimetroRectangulo2 = rectangulo2.calcularPerimetro();
        double areaRectangulo2 = rectangulo2.calcularArea();

        // Imprimir resultados
        System.out.println("Rectángulo 1:");
        System.out.println("Perímetro: " + perimetroRectangulo1);
        System.out.println("Área: " + areaRectangulo1);
        System.out.println("Rectángulo 2:");
        System.out.println("Perímetro: " + perimetroRectangulo2);
        System.out.println("Área: " + areaRectangulo2);
    }
}
