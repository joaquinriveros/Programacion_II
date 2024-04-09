package Trabajos_Practicos.Trabajo_Practico_2.Clases.Ejercicio_1;

public class Dog extends Animal {

	//Attributes
	private String race;
	private boolean vacunated;

	//Constructor
	public Dog(){}
	public Dog(String name,int age, String animalType,double price, String race, boolean vacunated) {
		super(name,age,animalType,price);
		this.race = race;
		this.vacunated = vacunated;
	}

	//Getter and Setter
	public String getRace() {
		return race;
	}
	public void setRace(String race) {
		this.race = race;
	}

	public boolean isVacunated() {
		return vacunated;
	}
	public void setVacunated(boolean vacunated) {
		this.vacunated = vacunated;
	}

	//Methods
	@Override
	public String toString() {
		if (vacunated){
			return (super.toString() +
					"Raza: " + race + "\n" +
					"Vacunado: SI" );
		}else {
			return (super.toString() +
					"Raza: " + race + "\n" +
					"Vacunado: NO" );
		}
	}
}