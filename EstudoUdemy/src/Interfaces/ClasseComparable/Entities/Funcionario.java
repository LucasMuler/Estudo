package Interfaces.ClasseComparable.Entities;

public class Funcionario implements Comparable<Funcionario>{

    private String name;
    private double salary;

    public Funcionario(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public int compareTo(Funcionario o) {
        return name.compareTo(o.getName());
    }
}

