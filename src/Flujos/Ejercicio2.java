import Flujos.Person;

import java.util.*;
import java.util.stream.*;

public class Ejercicio2 {
    public static void main(String[] args) {
        // Crear una lista de personas de ejemplo
        List<Person> people = Arrays.asList(
                new Person("Alice", "Anderson", 1985),
                new Person("Bob", "Brown", 1990),
                new Person("Charlie", "Adams", 1987),
                new Person("Diana", "Amith", 1995),
                new Person("Eve", "Alexander", 2000)
        );

        // Filtrar las personas cuyo apellido empieza con "A" y contarlas
        long count = people.stream()
                .filter(person -> person.getLastName() != null && person.getLastName().startsWith("A"))
                .count();

        // Imprimir el resultado
        System.out.println("Número de personas con un apellido que empieza con 'A': " + count);
    }
}
