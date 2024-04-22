package Clase_7.Clases;

import java.util.ArrayList;
import java.util.List;

public class Client {

	//Atributos
	private String name;
	private List<Product> shopCart;
	private String surname;
	private Supermarket supermarket;

	//Constructor
	public Client(String name,String surname) {
		this.name = name;
		this.surname = surname;
		this.shopCart = new ArrayList<>();
	}

	//Getter y Setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public List<Product> getShopCart() {
		return shopCart;
	}
	public void setShopCart(List<Product>shopCart) {
		this.shopCart = shopCart;
	}

	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}

	//Metodos
	public void addToCart(Product product){
		this.shopCart.add(product);
	}

	public void purchase(List<Product>shopCart){
		this.supermarket.buy(shopCart);
	}

}