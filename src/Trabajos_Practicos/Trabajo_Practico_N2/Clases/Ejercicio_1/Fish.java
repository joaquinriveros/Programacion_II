package Trabajos_Practicos.Trabajo_Practico_2.Clases.Ejercicio_1;

public class Fish extends Animal {

	//Attributes
	private String species;
	private double weight;

	//Constructor
	public Fish(){}
	public Fish( String name,int age, String animalType,double price, String species, double weight) {
		super(name,age, animalType, price);
		this.species = species;
		this.weight = weight;
	}

	//Getter and Setter
	public String getSpecies() {
		return species;
	}
	public void setSpecies(String species) {
		this.species = species;
	}

	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}

	//Methods
	@Override
	public String toString() {
		return (super.toString() +
				"Especie: " + species +
				"Peso: " + weight);
	}
}