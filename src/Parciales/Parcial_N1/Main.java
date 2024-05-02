package Parciales.Parcial_N1;

import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {

        // Creación de los Atletas
        Athlete athlete1 = new Athlete("Usain Bolt",33415693,39,1.80,78.8);
        Athlete athlete2 = new Athlete("Serena Williams",35151776,38,1.78,75.3);
        Athlete athlete3 = new Athlete("Michael Phelps",39621494,29,1.75,70.2);

        // Creación de los Equipos Nacionales
        NationalTeam team1 = new NationalTeam("Blanco y Celeste","Argentina");
        NationalTeam team2 = new NationalTeam("Amarillo","Colombia");
        NationalTeam team3 = new NationalTeam("Verde,Amarillo y Negro","Jamaica");
        // Creación de las Pruebas
        Test test1 = new Test(3341,"Salto con Pértiga",athlete1);
        Test test2 = new Test(4252,"'Carreras con vallas'",athlete2);
        Test test3 = new Test(5123,"Lanzamiento de martillo",athlete3);
        // Creación de las Instalaciones
        Installation installation1 = new Installation("Nacional","Buenos Aires","Estadio Más Monumental","Deportivo");
        Installation installation2 = new Installation("Nacional","Santa Fé","Gigante de Arroyito","Deportivo");
        // Creación de las Sedes
        Headquarters headquarters1 = new Headquarters(1,"12/12/2024","15:35",installation1);
        Headquarters headquarters2 = new Headquarters(2,"15/10/2024","16:45",installation2);


        // Asignación de los Atletas en los Equipos
        //Equipo 1
        team1.addAthlete(athlete1);
        team1.addAthlete(athlete2);
        //Equipo 2
        team2.addAthlete(athlete2);
        team2.addAthlete(athlete3);
        //Equipo 3
        team3.addAthlete(athlete3);
        team3.addAthlete(athlete2);

        // Asignación de los Atletas a las Pruebas
        //Prueba 1
        test1.addCompetitor(athlete2);
        test1.addCompetitor(athlete3);
        test1.addCompetitor(athlete1);
        //Prueba 2
        test2.addCompetitor(athlete1);
        test2.addCompetitor(athlete3);
        test2.addCompetitor(athlete2);
        //Prueba 3
        test3.addCompetitor(athlete1);
        test3.addCompetitor(athlete2);
        test3.addCompetitor(athlete3);

        // Asignación de las Pruebas a las Sedes
        headquarters1.addTest(test1);
        headquarters1.addTest(test2);
        headquarters2.addTest(test3);


        // Mostrar datos desde un objeto de Instalación: Nombre del tercer atleta de la segunda prueba
        System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");

        Installation installation = headquarters1.getWhere().get(0);
        System.out.println("Nombre del tercer atleta de la segunda prueba " +
                            "\n _ Nombre: " + headquarters1.getItDoes().get(1).getParticipates().get(2).getName()+
                            "\n _ Instalación: " + installation.getName());

        System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");

        // Mostrar datos desde un objeto Instalación: Código de la 2da prueba.
        System.out.println("Código de la segunda prueba" +
                            "\n _ Código: " + headquarters1.getItDoes().get(1).getCode()+
                            "\n _ Instalación: " + installation.getName());

        System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");

        // Mostrar datos desde un objeto EquipoNacional: Altura de todos los atletas.
        List<NationalTeam> teams = new ArrayList<>();
        teams.add(team1);
        teams.add(team2);
        teams.add(team3);
        for (NationalTeam team:teams) {
            System.out.println("_ Equipo: "+ team.getCountry() + " _ Color: " + team.getColor());
            System.out.println();
            for (int i = 0; i < 2; i++) {
                System.out.println("_ Nombre del Atleta: " + team.getBelongs().get(i).getName());
                System.out.println("_ Altura: " + team.getBelongs().get(i).getHeight());
                System.out.println();
            }
        }

        System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");

        // Mostrar: Desde un objeto EquipoNacional: Peso extra de cada atleta.
        System.out.println("_ Peso extra de cada atleta:");
        for (NationalTeam team:teams) {
            System.out.println();
            for (int i = 0; i < 2; i++) {
                System.out.println("_ Nombre del Atleta: " + team.getBelongs().get(i).getName());
                if (team.getBelongs().get(i).thereIsExtraWeight(team.getBelongs().get(i).calculateBMI())){
                    System.out.println("¡¡Tiene peso extra!!");
                }else {
                    System.out.println("_ No tiene peso extra.");
                }
            }
        }
        System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
    }
}