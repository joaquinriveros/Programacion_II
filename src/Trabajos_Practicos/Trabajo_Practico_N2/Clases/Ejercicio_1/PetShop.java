package Trabajos_Practicos.Trabajo_Practico_N2.Clases.Ejercicio_1;

import java.util.ArrayList;
import java.util.List;

public class PetShop {

	//Attributes
	private List<Animal> animals;

	//Constructor
	public PetShop(List<Animal> animals) {
		this.animals = new ArrayList<>(animals);
	}

	//Getter and Setter
	public List<Animal> getAnimals() {
		return animals;
	}
	public void sellAnimals(List<Animal> animals) {
		this.animals = animals;
	}

	//Methods
	public void addAnimal(Animal animal){
		animals.add(animal);
		System.out.println("'" +animal.getName()+ "' se ha añadido con éxito");
	}

	public void feedAnimal(String name) {
		int index = -1; // Inicializamos el índice con un valor que indica que no se encontró el animal
		for (int i = 0; i < animals.size(); i++) {
			if (animals.get(i).getName().equals(name)) {
				index = i; // Guardamos el índice del animal encontrado
				break; // Salimos del bucle una vez que encontramos el animal
			}
		}
		if (index != -1) {
			System.out.println("El " + animals.get(index).getAnimalType() + " '" + animals.get(index).getName() + "' está comiendo.");
		} else {
			System.out.println("No se encontró ningún animal con el nombre: " + name);
		}
	}

	public void listAnimals(){
		System.out.println("Lista de Animales:");
		for (Animal animal: animals) {
			System.out.println("--------------------------------------");
			System.out.println("Nombre: " + animal.getName());
			System.out.println("Edad: " + animal.getAge());
			System.out.println("Nombre: " + animal.getAnimalType());
			System.out.println("Precio: $" + animal.getPrice());
		}
	}

	public void sellAnimal(String name) {
		int index = -1;
		for (int i = 0; i < animals.size(); i++) {
			if (animals.get(i).getName().equals(name)) {
				index = i;
				break;
			}
		}
		if (index != -1) {
			Animal soldAnimal = animals.remove(index); // Vendemos el animal eliminándolo de la lista
			System.out.println("Se ha vendido el animal: " + soldAnimal.getName());
		} else {
			System.out.println("No se encontró ningún animal con el nombre: " + name);
		}
	}
}
