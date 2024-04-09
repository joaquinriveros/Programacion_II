package Clase_5.Clases.Composicion;

public class Main {
    public static void main(String[] args) {
        // Crear una instancia de Casa
        Casa casa1 = new Casa();

        // Agregar puertas a la casa
        casa1.AgregarPuerta("Madera");
        casa1.AgregarPuerta("Metal");
        casa1.AgregarPuerta("Vidrio");

        // Mostrar los materiales de las puertas en la casa
        casa1.MostrarMaterialesPuertas();
    }
}
