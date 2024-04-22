package Clase_7.Clases;

public class Product {

	//Atributos
	private String name;
	private float price;
	private int stock;

	//Constructor
	public Product(String name, float price, int stock) {
		this.name = name;
		if (price > 0){this.price = price;}
		if (stock > 0){this.stock = stock;}
	}

	//Getter y Setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		if (price > 0) {this.price = price;}
	}

	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		if (stock > 0) {this.stock = stock;}
	}

	//Metodos
	public void information(){
		System.out.println("------------------------------------ ");
		System.out.println("Nombre: " + this.getName());
		System.out.println("Precio: " + this.getPrice());
		System.out.println("Stock: " + this.getStock());
	}

}