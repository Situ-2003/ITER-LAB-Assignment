import java.util.*;

class Animal {
    String name;
    String color;
    String type;

    Animal(String name, String color, String type) {
        this.name = name;
        this.color = color;
        this.type = type;
    }

    @Override
    public int hashCode() {
        return UUID.randomUUID().hashCode();
    }
}

public class A6 {
    public static void main(String[] args) {
        Animal cat = new Animal("murti", "black", "Pet");
        Animal lion = new Animal("Singh", "Golden", "Wild");
        Animal dog = new Animal("Bunny", "yellow", "Pet");

        System.out.println("Hashcode of cat: " + cat.hashCode());
        System.out.println("Hashcode of lion: " + lion.hashCode());
        System.out.println("Hashcode of dog: " + dog.hashCode());
    }
}
