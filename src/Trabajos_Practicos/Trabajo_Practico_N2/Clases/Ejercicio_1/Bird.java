package Trabajos_Practicos.Trabajo_Practico_N2.Clases.Ejercicio_1;

public class Bird extends Animal {

	//Attributes
	private String species;
	private boolean talk;

	//Constructor
	public Bird(){}
	public Bird( String name,int age, String animalType, double price, String species, boolean talk) {
		super(name,age, animalType, price);
		this.species = species;
		this.talk = talk;
	}

	//Getter and Setter
	public String getSpecies() {
		return species;
	}
	public void setSpecies(String species) {
		this.species = species;
	}

	public boolean isTalk() {
		return talk;
	}
	public void setTalk(boolean talk) {
		this.talk = talk;
	}

	//Methods
	@Override
	public String toString() {
		if (talk){
			return (super.toString() +
					"Especie: " + species +"\n" +
					"Habla: SI" );
		}else {
			return (super.toString() +
					"Especie: " + species +"\n" +
					"Habla: NO" );
		}
	}
}