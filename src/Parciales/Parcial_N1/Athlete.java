package Parciales.Parcial_N1;

import java.lang.annotation.Repeatable;
import java.util.Random;

public class Athlete extends Person implements Contract {

    //Attributes - Atributos
    private int age;
    private double weight;
    private double height;

    //Builder - Constructor
    public Athlete(String name, int dni, int age, double weight, double height) {
        super(name, dni);
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    //Getter and Setter
    public int getAge() {return age;}
    public void setAge(int age) {this.age = age;}

    public double getWeight() {return weight;}
    public void setWeight(double weight) {this.weight = weight;}

    public double getHeight() {return height;}
    public void setHeight(double height) {this.height = height;}

    //Methods - Métodos
    @Override
    public double calculateBMI(){return weight / (height/100 * height/100);}
    @Override
    public boolean thereIsExtraWeight(double bmi){
        return bmi > 25;
    }
    @Override
    public double takePulses(){Random random = new Random();return (random.nextDouble(80 + 1) + 60);}
}
//índice de masa corporal(IMC) = body mass index(BMI)