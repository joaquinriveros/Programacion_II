package Clase_5.Clases.Asociacion_Unidireccional;

public class Main {
    public static void main(String[] args) {
        // Ejemplo de uso
        Universidad universidad = new Universidad("Mi Universidad");
        Estudiantes estudiante = new Estudiantes("Juan");

        System.out.println("Id del estudiante: " + estudiante.getId());
        System.out.println("Nombre del estudiante: " + estudiante.getNombre());
        System.out.println("Nombre de la universidad: " + estudiante.getUniversidad().getNombre());
        universidad.VerUniversidad();
    }
}

