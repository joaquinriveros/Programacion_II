package Trabajos_Practicos.Trabajo_Practico_N2.Clases.Ejercicio_1;

public class Cat extends Animal {

	//Attributes
	private String race;
	private boolean sterilized;

	//Constructor
	public Cat(){}
	public Cat( String name,int age, String animalType, double price, String race, boolean sterilized) {
		super(name,age, animalType, price);
		this.race = race;
		this.sterilized = sterilized;
	}

	//Getter and Setter
	public String getRace() {
		return race;
	}
	public void setRace(String race) {
		this.race = race;
	}

	public boolean isSterilized() {
		return sterilized;
	}
	public void setSterilized(boolean sterilized) {
		this.sterilized = sterilized;
	}

	//Methods
	@Override
	public String toString() {
		if (sterilized){
			return (super.toString() +
					"Raza: " + race + "\n" +
					"Esterilizado: SI" );
		}else {
			return (super.toString() +
					"Raza: " + race + "\n" +
					"Esterilizado: NO" );
		}
	}
}