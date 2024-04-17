package Clase_6.Ejercicio1;

public class Player {
    private String name;
    private String position;
    private int numberTshirt;

    public Player(String name, String position, int numberTshirt) {
        this.name = name;
        this.position = position;
        this.numberTshirt = numberTshirt;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getNumberTshirt() {
        return numberTshirt;
    }

    public void setNumberTshirt(int numberTshirt) {
        this.numberTshirt = numberTshirt;
    }
}
