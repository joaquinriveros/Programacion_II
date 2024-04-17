package Clase_6.Ejercicio1;
/*
1-Crea una clase Jugador con atributos como nombre,posición, número de camiseta,etc.
2-Crea una clase Equipo que tenga una lista de jugadores y que implemente la interfaz Iterable <Jugador>.
3-En la clase Equipo, implementa el método iterador() para devolver un iterador personalizado que recorra la
lista de jugadores.
4-En el método main, crea instancias de la clase jugador, añadelas al equipo y luego itera sobre los
jugadores del equipo utilizando un bucle for -each.
*/
public class Main {
    public static void main(String[] args) {

        Team team = new Team();

        Player player1 = new Player("Lionel Messi", "Delantero", 10);
        Player player2 = new Player("Julian Alvarez", "Delantero", 9);
        Player player3 = new Player("Franco Armani", "Arquero",1);

        team.addPlayer(player1);
        team.addPlayer(player2);
        team.addPlayer(player3);

        System.out.println("Jugadores del equipo:");
        for (Player player : team) {
            System.out.println("Nombre: "+ player.getName() +
                    ", Posición: "+ player.getPosition() +
                    ", Número Camiseta: "+ player.getNumberTshirt());
        }

    }




}
