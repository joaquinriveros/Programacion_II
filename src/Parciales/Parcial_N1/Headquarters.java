package Parciales.Parcial_N1;

import java.util.ArrayList;
import java.util.List;

public class Headquarters {

    //Attributes - Atributos
    private int phase;
    private String date;
    private String hour;
    private static List <Test> itDoes;
    private static List <Installation> where;

    //Builder - Constructor
    public Headquarters(int phase, String date, String hour, Installation firstInstallation) {
        this.phase = phase;
        this.date = date;
        this.hour = hour;
        itDoes = new ArrayList<>();
        where = new ArrayList<>();
        where.add(firstInstallation);
    }

    //Getter y Setter
    public int getPhase() {
        return phase;
    }
    public void setPhase(int phase) {
        this.phase = phase;
    }

    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }

    public String getHour() {
        return hour;
    }
    public void setHour(String hour) {
        this.hour = hour;
    }

    public static List<Test> getItDoes() {
        return itDoes;
    }
    public void setItDoes(List<Test> itDoes) {
        Headquarters.itDoes = itDoes;
    }

    public static List<Installation> getWhere() {
        return where;
    }
    public void setWhere(List<Installation> where) {
        Headquarters.where = where;
    }

    //Methods - Métodos
    public void addTest(Test test){
        itDoes.add(test);
    }
    public void addInstallation(Installation installation){
        where.add(installation);
    }

}
