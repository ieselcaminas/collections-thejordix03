package Flujos;

import Flujos.Person;
import java.util.*;
import java.util.stream.*;

public class Ejercicio3 {
    public static void main(String[] args) {
        // Crear una lista de personas de ejemplo
        List<Person> people = Arrays.asList(
                new Person("Alice", "Smith", 1985),
                new Person("Bob", "Johnson", 1990),
                new Person("Alice", "Brown", 1987),
                new Person("Charlie", "Smith", 1995),
                new Person("Bob", "White", 1993)
        );
        // Obtener los nombres únicos y ordenarlos alfabéticamente
        List<String> nombresunicos = people.stream()
                .map(Person::getFirstName)       // Extraer los nombres
                .distinct()                      // Filtrar nombres únicos
                .sorted()                        // Ordenarlos alfabéticamente
                .collect(Collectors.toList());   // Recopilar como lista

        System.out.println("Nombres únicos en orden alfabético:");
        nombresunicos.forEach(nombre -> System.out.println(nombre));
    }
}
