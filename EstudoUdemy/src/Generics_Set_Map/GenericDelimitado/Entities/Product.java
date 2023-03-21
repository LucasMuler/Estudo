package Generics_Set_Map.GenericDelimitado.Entities;

public class Product implements Comparable<Product>{

    private String name;
    private Double value;

    public Product(String name, double value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public int compareTo(Product o) {
        return value.compareTo(o.getValue());
    }

    @Override
    public String toString() {
        return name + ", " + value;
    }
}
