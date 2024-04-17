package Clase_6.Ejercicio1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Team implements Iterable<Player> {
    private List<Player> players;
    public Team() {
        players=new ArrayList<>();
    }

    //Metodos
    public void addPlayer(Player player) {
        players.add(player);
    }

    /*
    Sino se personaliza lo dejo así, no hace falta crear la clase interna.
    @Override
    public Iterator<Player> iterator() {
        return players.iterator();
    }*/

    @Override
    public Iterator<Player> iterator() {
        return new TeamIterator();
        // return players.Iterator();
    }
    //Clase interna
    private class TeamIterator implements Iterator<Player> {
        private int index=0;

        @Override
        public boolean hasNext(){
            return index <players.size();
        }
        @Override
        public Player next(){
            return players.get(index++);
        }
    }
}
