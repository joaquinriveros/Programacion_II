package Ejercicios_Clase_8.Ejercicio_tp3_en_clase.Ejercicio_5;

public class Tasks {
    private String description;
    private int priority;

    public Tasks(String description, int priority) {
        this.description = description;
        this.priority = priority;
    }

    public String getDescription() {
        return description;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        return "Tarea{" +
                "Descripcion= '" + description + '\'' +
                ", Prioridad= " + priority +
                '}';
    }
}
