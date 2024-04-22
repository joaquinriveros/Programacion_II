package Clase_7.Clases;

import java.util.ArrayList;
import java.util.List;

public class Supermarket {

	//Atributos
	private List<Product> inventory;
	private List<Client> clients;

	//Constructor
	public Supermarket(List <Product> inventory) {
		this.inventory = new ArrayList<>(inventory);
		this.clients = new ArrayList<>();
	}

	//Getter y Setter
	public List<Product> getInventory() {
		return inventory;
	}
	public void setInventory(List<Product> inventory) {
		this.inventory = inventory;
	}

	//Metodos
	public void update(){
		for (Product product:inventory) {
			if (product.getStock() <= 0){
				inventory.remove(product);
			}
		}
	}

	public void addProduct(Product product){
		this.inventory.add(product);
	}

	public void buy(List<Product>products){
		double total = 0;
		for (Product product: products) {
			if (product.getStock() > 0){
				System.out.println(product.getName() + ": $" + product.getPrice() + ";");
				total += product.getPrice();
			}
		}
		System.out.println("Total: $" + total);
		update();
	}

	public boolean searchProduct(String name){
		for (Product product: inventory) {
			if (product.getName().equals(name)){
				if (product.getStock() > 0) {
					System.out.println("El producto se encuentra disponible para la compra.");
					return true;
				}
			}
		}
		System.out.println("No hay stock disponible");
		return false;
	}

	public void showInventory(){
		System.out.println("Inventario: ");
		for (Product product:inventory) {
			product.information();
		}
	}

}