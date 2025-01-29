package Comparable;

public class Human implements Comparable<Human> {
    private String name;
    private int height;
    private int salary;

    public Human(String name, int height) {
        this.name = name;
        this.height = height;
    }

    public String getName() {
        return this.name;
    }

    public int getHeight() {
        return this.height;
    }

    @Override
    public String toString() {
        return this.getName() + " (" + this.getHeight() + ")";
    }

    @Override
    public int compareTo(Human other) {
        if (this.height == getHeight()) {
            return 0;
        } else if (this.height > getHeight()) {
            return 1;
        } else {
            return -1;
        }
    }

    public int getSalary() {
        int salary = 0;
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
