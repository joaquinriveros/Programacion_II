package Clase_7.Clases;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Crear un supermercado con algunos productos
        List<Product> products = new ArrayList<>();
        products.add(new Product("Leche", 2.5f, 10));
        products.add(new Product("Pan", 1.0f, 20));
        products.add(new Product("Manzanas", 3.0f, 15));
        Supermarket supermarket = new Supermarket(products);

        // Crear un cliente
        Client client = new Client("Juan", "Perez");

        // Mostrar el menú interactivo
        Scanner scanner = new Scanner(System.in);
        int option = 0;
        do {
            System.out.println("----- Menú Principal -----");
            System.out.println("1. Ver inventario");
            System.out.println("2. Agregar producto al carrito");
            System.out.println("3. Realizar compra");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            option = scanner.nextInt();
            scanner.nextLine();  // Limpiar el buffer de entrada

            switch (option) {
                case 1:
                    System.out.println("----- Inventario -----");
                    supermarket.showInventory();
                    break;
                case 2:
                    System.out.println("----- Agregar Producto al Carrito -----");
                    System.out.print("Ingrese el nombre del producto: ");
                    String name = scanner.nextLine();
                    if (supermarket.searchProduct(name)){
                        client.addToCart(findProduct(name,products));
                        System.out.println("Producto agregado al carrito.");
                    } else {
                        System.out.println("El producto no está disponible en el inventario.");
                    }
                    break;
                case 3:
                    System.out.println("----- Realizar Compra -----");
                    client.purchase(client.getShopCart());
                    client.getShopCart().clear(); // Vaciar el carrito después de la compra
                    break;
                case 4:
                    System.out.println("¡Gracias por su visita!");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }
        } while (option != 4);

        scanner.close();
    }

    // Método auxiliar para encontrar un producto por su nombre en una lista de productos
    private static Product findProduct(String name, List<Product> products) {
        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(name)) {
                return product;
            }
        }
        return null;
    }
}


