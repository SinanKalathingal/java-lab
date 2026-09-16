class Food {
    void taste() {
        System.out.println("Food has a taste.");
    }
}

class Pizza extends Food {
    @Override
    void taste() {
        System.out.println("Pizza tastes cheesy and delicious.");
    }
}

class Burger extends Food {
    @Override
    void taste() {
        System.out.println("Burger tastes juicy and tasty.");
    }
}

class Biryani extends Food {
    @Override
    void taste() {
        System.out.println("Biryani tastes spicy and flavorful.");
    }
}

public class FoodDemo {
    public static void main(String[] args) {
        Food f;

        f = new Pizza();
        f.taste();

        f = new Burger();
        f.taste();

        f = new Biryani();
        f.taste();
    }
}