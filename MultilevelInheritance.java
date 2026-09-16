
class Grandparent {
    Grandparent() {
        System.out.println("Constructor of grandparent");
    }
}

class Parent extends Grandparent {
    Parent() {
        System.out.println("Constructor of parent");
    }
}

class Child extends Parent {
    Child() {
        System.out.println("Constructor of child");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        Child obj = new Child();
    }
}