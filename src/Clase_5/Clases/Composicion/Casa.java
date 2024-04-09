package Clase_5.Clases.Composicion;

import java.util.ArrayList;
import java.util.List;

public class Casa {

	//Atributos
	private List <Puerta> puertas;
	private static int contador = 0;
	private int id;

	//Constructor
	public Casa(){
		this.puertas = new ArrayList<>();
		contador ++;
		id = contador;
	}

	//Getter y Setter
	public List<Puerta> getPuertas() {
		return puertas;
	}
	public void setPuertas(List<Puerta> puertas) {
		this.puertas = puertas;
	}

	public int getId() {
		return id;
	}

	//Metodos
	public void CrearCasa(){
		new Casa();
	}

	public void AgregarPuerta(String material) {
		Puerta puerta = new Puerta(material);
		puertas.add(puerta);
	}

	public void MostrarMaterialesPuertas(){
		System.out.println("Materiales de las puertas en la casa:");
		for (Puerta puerta : puertas) {
			System.out.println("- " + puerta.getMaterial() + ".");
		}
	}
}