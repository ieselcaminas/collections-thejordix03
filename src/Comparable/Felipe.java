import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Tarea implements Comparable<Tarea> {
    int prioridad, duracion;

    Tarea(int prioridad, int duracion) {
        this.prioridad = prioridad;
        this.duracion = duracion;
    }


    @Override
    public String toString() {
        return this.prioridad + " " + this.duracion;
    }

    @Override
    public int compareTo(Tarea otra) {
        if (this.prioridad == otra.prioridad) {
            return this.duracion - otra.duracion; // Si las prioridades son iguales, por duración ascendente
        }
        return otra.prioridad - this.prioridad; // Prioridad descendente
    }
}

public class Felipe {
    public static String ordenarTareas(List<Tarea> tareas) {
        StringBuilder sb = new StringBuilder();
        Collections.sort(tareas); // Ordenamos la lista según el criterio del compareTo
        for (Tarea t : tareas) {
            sb.append(t).append("\n"); // Cada tarea en una nueva línea
        }
        return sb.toString().trim(); // Eliminamos posibles líneas en blanco adicionales
    }

    public static void main(String[] args) {
        // Primer caso de prueba
        List<Tarea> tareas = new ArrayList<>();
        tareas.add(new Tarea(1, 6));
        tareas.add(new Tarea(2, 4));
        tareas.add(new Tarea(3, 5));
        System.out.println(ordenarTareas(tareas));
        System.out.println("---");

        // Segundo caso de prueba
        tareas.clear();
        tareas.add(new Tarea(30, 7));
        tareas.add(new Tarea(30, 2));
        System.out.println(ordenarTareas(tareas));
        System.out.println("---");
    }
}