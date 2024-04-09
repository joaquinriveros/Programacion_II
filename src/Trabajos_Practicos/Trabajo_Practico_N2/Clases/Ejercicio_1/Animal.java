package Trabajos_Practicos.Trabajo_Practico_2.Clases.Ejercicio_1;

public abstract class Animal {

	//Attributes
	private String name;
	private int age;
	private String animalType;
	private double price;

	//Constructor
	public Animal(){}
	public Animal(String name,int age, String animalType, double price) {
		this.name = name;
		this.age = age;
		this.animalType = animalType;
		this.price = price;
	}

	//Getters Y Setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public String getAnimalType() {
		return animalType;
	}
	public void setAnimalType(String animalType) {
		this.animalType = animalType;
	}

	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	//Methods
	public void feedAnimal(String name){}
	@Override
	public String toString() {
		return ("Informacion: \n" +
				"Nombre: " + name + "\n" +
				"Edad: " + age + "\n" +
				"Tipo de Animal: " + animalType + "\n" +
				"Precio: $" + price + "\n");
	}
}