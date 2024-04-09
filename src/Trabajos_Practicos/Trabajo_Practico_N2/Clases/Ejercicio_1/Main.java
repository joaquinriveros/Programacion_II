package Trabajos_Practicos.Trabajo_Practico_2.Clases.Ejercicio_1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear instancias de animales
        Bird bird1 = new Bird("Piolín", 2, "Ave", 50.0, "Canario", true);
        Cat cat1 = new Cat("Garfield", 5, "Felino", 100.0, "Persa", false);
        Dog dog1 = new Dog("Rex", 3, "Canino", 200.0, "Labrador", true);
        Fish fish1 = new Fish("Nemo", 1, "Pez", 20.0, "Pez payaso", 0.1);

        // Crear una lista de animales
        List<Animal> animalList = new ArrayList<>();
        animalList.add(bird1);
        animalList.add(cat1);
        animalList.add(dog1);
        animalList.add(fish1);

        // Crear una tienda de mascotas
        PetShop petShop = new PetShop(animalList);

        // Mostrar lista de animales
        petShop.listAnimals();

        // Alimentar a un animal
        petShop.feedAnimal("Piolín");

        // Vender un animal
        petShop.sellAnimal("Garfield");

        // Mostrar lista actualizada de animales
        petShop.listAnimals();

        // Añadir un nuevo animal
        Dog dog2 = new Dog("Buddy", 4, "Canino", 150.0, "Golden Retriever", false);
        petShop.addAnimal(dog2);

        // Mostrar lista actualizada de animales
        petShop.listAnimals();
    }
}
