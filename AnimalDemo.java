class Animal {

    String name;
    int age;
    String color;

    Animal(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    void displayFeatures() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Color: " + color);
    }

    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {

    Dog(String name, int age, String color) {
        super(name, age, color);
    }

    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {

    Cat(String name, int age, String color) {
        super(name, age, color);
    }

    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

class Cow extends Animal {

    Cow(String name, int age, String color) {
        super(name, age, color);
    }

    @Override
    void sound() {
        System.out.println("Cow moos");
    }
}

public class AnimalDemo {

    public static void main(String[] args) {

        Animal a;

        a = new Dog("Tommy", 5, "Brown");
        a.displayFeatures();
        a.sound();

        System.out.println();

        a = new Cat("Kitty", 3, "White");
        a.displayFeatures();
        a.sound();

        System.out.println();

        a = new Cow("Gowri", 7, "Black and White");
        a.displayFeatures();
        a.sound();
    }
}