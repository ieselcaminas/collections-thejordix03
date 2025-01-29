package Comparable;

public class Member implements Comparable<Human> {
    private String name;
    private int salary; // Cambiado a salario

    // Constructor
    public Member(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }

    public int getSalary() {
        return this.salary;
    }

    @Override
    public String toString() {
        return this.getName() + " (" + this.getSalary() + ")";
    }

    // Implementación de compareTo para ordenar por salario de mayor a menor
    @Override
    public int compareTo(Human other) {
        return Integer.compare(other.getSalary(), this.salary); // Invertido para mayor a menor
    }
}
