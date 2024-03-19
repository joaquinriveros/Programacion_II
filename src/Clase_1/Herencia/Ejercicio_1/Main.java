package Clase_1.Herencia.Ejercicio_1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        // Creaion de instancias
        Coche coche = new Coche("Verde", 4, 200, 1200);
        Bicicleta bicicleta = new Bicicleta("Azul", 2, "Urbana");
        Camioneta camioneta = new Camioneta("Rojo",4,180, 1800, 1500);
        Motocicleta motocicleta = new Motocicleta("Negro", 2, "Urbana", 150, 1500);

        // Lista con los Vehiculos
        ArrayList<Vehiculo> listaVehiculos = new ArrayList<>();

        // Añadiendo los objetos a la lista
        listaVehiculos.add(coche);
        listaVehiculos.add(bicicleta);
        listaVehiculos.add(camioneta);
        listaVehiculos.add(motocicleta);

        Catalogar(listaVehiculos);

        // Probando la función Catalogar con diferentes valores de ruedas
        Catalogar(listaVehiculos, 0);
        Catalogar(listaVehiculos, 2);
        Catalogar(listaVehiculos, 4);
    }

    static void Catalogar(ArrayList<Vehiculo> vehiculos) {
        System.out.println("Vehiculos: \n");
        for (Vehiculo v : vehiculos) {
            System.out.println("Clase: " + v.getClass().getSimpleName());
            System.out.println("Atributos: \n" + v.ObtenerAtributos());
            System.out.println(); // Salto de línea
        }
    }

    static void Catalogar(ArrayList<Vehiculo> vehiculos, int ruedas) {
        // Filtrar los vehículos por el número de ruedas especificado
        ArrayList<Vehiculo> vehiculosFiltrados = new ArrayList<>();
        for (Vehiculo v : vehiculos) {
            if (v.getRuedas() == ruedas) {
                vehiculosFiltrados.add(v);
            }
        }

        // Mostrar un mensaje solo si se proporciona el argumento ruedas
        if (ruedas > 0) {
            System.out.println("Se han encontrado " + vehiculosFiltrados.size() + " vehículos con " + ruedas + " ruedas:");
        }

        // Mostrar los vehículos filtrados
        for (Vehiculo v : vehiculosFiltrados) {
            System.out.println("Clase: " + v.getClass().getSimpleName());
            System.out.println("Atributos: \n" + v.ObtenerAtributos());
            System.out.println(); // Salto de línea
        }
    }
}