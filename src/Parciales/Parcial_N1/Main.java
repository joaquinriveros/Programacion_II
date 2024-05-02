package Parciales.Parcial_N1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Creation of Athletes - Creación de los Atletas
        Athlete athlete1 = new Athlete("Ignacio Bolt",33415693,39,1.80,75.8);
        Athlete athlete2 = new Athlete("Mateo Williams",35151776,38,1.70,80.3);
        Athlete athlete3 = new Athlete("Michael Phelps",39621494,29,1.85,70.2);
        Athlete athlete4 = new Athlete("Agustin Vecino",44419323,20,1.66,65.2);
        Athlete athlete5 = new Athlete("Matias Fernandéz",30624520,26,1.83,80.2);
        Athlete athlete6 = new Athlete("Jeremías Gonzalez",33830564,25,1.69,65.3);

        // Creation of National Teams - Creación de los Equipos Nacionales
        NationalTeam team1 = new NationalTeam("Blanco y Celeste","Argentina");
        NationalTeam team2 = new NationalTeam("Amarillo","Colombia");
        NationalTeam team3 = new NationalTeam("Verde","Jamaica");

        // Test Creation - Creación de las Pruebas
        Test test1 = new Test(5214,"'_ Carrera con vallas'",athlete1);
        Test test2 = new Test(4229,"'_ Lanzamiento de martillo'",athlete2);
        Test test3 = new Test(6235,"'_ Salto con pértiga",athlete3);

        // Creation of the Facilities - Creación de las Instalaciones
        Installation installation1 = new Installation("Nacional","Buenos Aires","Estadio Más Monumental","Deportivo");
        Installation installation2 = new Installation("Nacional","Santa Fé","Gigante de Arroyito","Deportivo");

        // Creation of the Headquarters - Creación de las Sedes
        Headquarters place1 = new Headquarters(1,"12/12/2024","15:35",installation1);
        Headquarters place2 = new Headquarters(2,"15/10/2024","16:35",installation2);


        // Assignment of Athletes to Teams - Asignación de los Atletas en los Equipos
        //Equipo 1
        team1.addAthlete(athlete1);
        team1.addAthlete(athlete4);
        //Equipo 2
        team2.addAthlete(athlete2);
        team2.addAthlete(athlete5);
        //Equipo 3
        team3.addAthlete(athlete3);
        team3.addAthlete(athlete6);

        // Assignment of Athletes to Events - Asignación de los Atletas a las Pruebas
        //Prueba 1
        test1.addCompetitor(athlete2);
        test1.addCompetitor(athlete3);
        test1.addCompetitor(athlete5);
        test1.addCompetitor(athlete6);
        //Prueba 2
        test2.addCompetitor(athlete1);
        test2.addCompetitor(athlete3);
        test2.addCompetitor(athlete4);
        test2.addCompetitor(athlete5);
        //Prueba 3
        test3.addCompetitor(athlete1);
        test3.addCompetitor(athlete2);
        test3.addCompetitor(athlete4);
        test3.addCompetitor(athlete6);

        // Assignment of Tests to Venues - Asignación de las Pruebas a las Sedes
        place1.addTest(test1);
        place1.addTest(test2);
        place2.addTest(test3);

        System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");

        // Mostrar datos desde un objeto Instalación: Nombre del tercer atleta de la segunda prueba.
        Installation installation = Headquarters.getWhere().get(0);
        System.out.println("_ Nombre del tercer atleta de la segunda prueba" +
                            "\n_ Nombre: "+ Headquarters.getItDoes().get(1).getParticipates().get(2).getName()+
                            "\n_ Instalación: "+installation.getName());

        System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");

        // Mostrar datos desde un objeto Instalación: Código de la segunda prueba.
        System.out.println("_ Código de la segunda prueba " +
                            "\n_ Código: "+ Headquarters.getItDoes().get(1).getCode()+
                            "\n_ Instalación: "+installation.getName());

        System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");

        // Mostrar datos desde un objeto EquipoNacional: Altura de todos los atletas.
        List<NationalTeam> teams = new ArrayList<>();
        teams.add(team1);
        teams.add(team2);
        teams.add(team3);
        for (NationalTeam team:teams) {
            System.out.println("_ Equipo: " + team.getCountry() + "   Color: "+ team.getColor());
            System.out.println();
            for (int i = 0; i < 2; i++) {
                System.out.println("_ Nombre del Atleta: " + team.getBelongs().get(i).getName());
                System.out.println("_ Altura: " + team.getBelongs().get(i).getHeight());
                System.out.println();
            }
        }

        System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");

        // Mostrar datos desde un objeto EquipoNacional: Peso extra de cada atleta.
        System.out.println("_ Peso extra de cada atleta:");
        for (NationalTeam team:teams) {
            System.out.println();
            for (int i = 0; i < 2; i++) {
                System.out.println("_ Nombre del Atleta: " + team.getBelongs().get(i).getName());
                if (team.getBelongs().get(i).thereIsExtraWeight(team.getBelongs().get(i).calculateBMI())) {
                    System.out.println("¡¡Tiene peso extra!!");
                } else {
                    System.out.println("No tiene peso extra.");
                }
            }
        }

        System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
    }
}