package Clase_3.Ejercicios;

public class Main {
    public static void main(String[] args) {
        Operario operario = new Operario("Juan Santana","25.332.588");
        System.out.println(operario.toString());
        System.out.println();
        operario.Datos();

        System.out.println();
        System.out.println();


        Directivo directivo = new Directivo("Pedro Sanchez","Licenciado en Recursos Humanos");
        System.out.println(directivo.toString());
        System.out.println();
        directivo.Informacion();

        System.out.println();
        System.out.println();

        Oficial oficial = new Oficial("Ignacio Perez","34.657.443","1665");
        System.out.println(oficial.toString());
        System.out.println();
        oficial.Datos();

        System.out.println();
        System.out.println();

        Tecnico tecnico = new Tecnico("Lucas Rios","33.231.119","Lavalle 228");
        System.out.println(tecnico.toString());
        System.out.println();
        tecnico.Datos();
    }
}
