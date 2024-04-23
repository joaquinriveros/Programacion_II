package Trabajos_Practicos.Trabajo_Practico_N3.Clases.Ejercicio_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        //Creacion de los objetos
        Asignature asignature1 = new Asignature("Laboratorio",2,"Martes - Jueves: 8:00 - 10:30");
        Asignature asignature2 = new Asignature("Programacion",5,"Martes - Jueves: 10:30 - 12:00");

        List <Asignature> asignatureList = new ArrayList<>();
        asignatureList.add(asignature1);
        asignatureList.add(asignature2);

        Student student1 = new Student("Jose",43417393);
        Student student2 = new Student("Franco",44854630);
        Student student3 = new Student("Maximiliano",45630776);
        Student student4 = new Student("Valentin",45630776);
        Student student5 = new Student("Maximo",45630776);
        Student student6 = new Student("Joaquin",45630776);

        List <Student> studentList1 = new ArrayList<>();
        studentList1.add(student1);
        studentList1.add(student2);
        List <Student> studentList2 = new ArrayList<>();
        studentList2.add(student3);
        studentList2.add(student4);
        List <Student> studentList3 = new ArrayList<>();
        studentList3.add(student5);
        studentList3.add(student6);

        Group group1 = new Group("Programacion", 'C',studentList1);
        Group group2 = new Group("Laboratorio", 'A',studentList2);
        Group group3 = new Group("Laboratorio", 'B',studentList3);

        Teacher teacher = new Teacher("Gustavo",21630294,"Villa Nueva",asignatureList);

        //Ingresamos los grupos que pertenecen a cada asignatura en dichos horarios
        asignature1.setGroup(group1);
        asignature2.setGroup(group2);

        System.out.println("Tercera Asignatura del profesor: " + teacher.getName());
        System.out.println(teacher.getImparts().get(2).getClassroom());

        int counter = 0;
        System.out.println("Asignaturas del profesor: "+teacher.getName());
        for (Asignature asignature: teacher.getImparts()) {
            counter ++;
            if (counter < teacher.getImparts().size()){
                System.out.print(asignature.getName() + ", ");
            }else {
                System.out.print(asignature.getName() + ".");
            }
        }

        //Validamos si la asignatura 2 corresponde al los alumnos del grupo 2
        counter = 0;
        if (asignature2.getGroup().equals(group2)) {
            System.out.println("Alumnos en la asignatura " + asignature2.getName());
            for (Student student : group2.getBelongs()){
                counter ++;
                if (counter < teacher.getImparts().size()){
                    System.out.print(student.getName() + ", ");
                }else {
                    System.out.print(student.getName() + ".");
                }
            }
        }

        //Verificamos si el estudiante 5 pertenece al grupo 3
        if (group3.getBelongs().contains(student5)) {
            System.out.println("Estudiante: " + student5.getName() + "Pertenece al Grupo: " + group3.getLetter());
        }

        String  asignature;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una asignatura: ");
        asignature = scanner.nextLine().toLowerCase();
        switch (asignature){
            case ("laboratorio"):
                System.out.println("Profesor de la asignatura: " + asignature1.getTeacher());
                break;
            case ("programacion"):
                System.out.println("Profesor de la asignatura: " + asignature2.getTeacher());
                break;
            default:
                System.out.println("No existe dicha asignatura");
        }

        //Alumnos en la 2da asignatura desde el profesor:
        counter = 0;
        for (Student student : teacher.getImparts().get(1).getGroup().getBelongs()) {
            counter ++;
            if (counter < teacher.getImparts().get(1).getGroup().getBelongs().size()){
                System.out.print(student.getName() + ", ");
            }else {
                System.out.print(student.getName() + ".");
            }
        }

    }
}
