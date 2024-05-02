package Parciales.Parcial_N1;

import java.util.ArrayList;
import java.util.List;

public class Headquarters {

    //Attributes - Atributos
    private int phase;
    private String date;
    private String hour;
    private List <Test> itDoes;
    private List <Installation> where;

    //Builder - Constructor
    public Headquarters(int phase, String date, String hour, Installation firstInstallation) {
        this.phase = phase;
        this.date = date;
        this.hour = hour;
        this.itDoes = new ArrayList<>();
        this.where = new ArrayList<>();
        this.where.add(firstInstallation);
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

    public List<Test> getItDoes() {
        return itDoes;
    }
    public void setItDoes(List<Test> itDoes) {
        this.itDoes = itDoes;
    }

    public List<Installation> getWhere() {
        return where;
    }
    public void setWhere(List<Installation> where) {
        this.where = where;
    }

    //Methods - Métodos
    public void addTest(Test test){
        this.itDoes.add(test);
    }
    public void addInstallation(Installation installation){
        this.where.add(installation);
    }

}
