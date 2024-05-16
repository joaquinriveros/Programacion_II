package Ejercicios_Clase_8.Ejercicio_tp3_en_clase.Ejercicio_5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TasksList tasksList = new TasksList();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("\nMenú:");
                System.out.println("1. Agregar nueva tarea");
                System.out.println("2. Mostrar todas las tareas");
                System.out.println("3. Eliminar una tarea");
                System.out.println("4. Salir");
                System.out.print("Elija una opción: ");

                int option = scanner.nextInt();
                scanner.nextLine();  // Limpiar el buffer de entrada

                switch (option) {
                    case 1:
                        System.out.print("Descripción de la tarea: ");
                        String description = scanner.nextLine();
                        System.out.print("Prioridad de la tarea (entero): ");
                        int priority = scanner.nextInt();
                        tasksList.addTask(new Tasks(description, priority));
                        break;
                    case 2:
                        System.out.println("Lista de tareas:");
                        for (Tasks tasks : tasksList) {
                            System.out.println(tasks);
                        }
                        break;
                    case 3:
                        System.out.print("Ingrese la descripción de la tarea a eliminar: ");
                        String removeDescription = scanner.nextLine();
                        tasksList.removeTask(removeDescription);
                        break;
                    case 4:
                        System.out.println("Saliendo del programa...");
                        return;
                    default:
                        System.out.println("Opción no válida. Intente nuevamente.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Entrada inválida. Por favor, ingrese un valor numérico para la opción.");
                scanner.nextLine(); // Limpiar el buffer de entrada
            }
        }
    }
}
