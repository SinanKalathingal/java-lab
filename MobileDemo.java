class Mobile {
    void features() {
        System.out.println("Mobile has basic features.");
    }
}

class Samsung extends Mobile {
    @Override
    void features() {
        System.out.println("Samsung: AMOLED display, good camera, and Android OS.");
    }
}

class Apple extends Mobile {
    @Override
    void features() {
        System.out.println("Apple: Retina display, excellent camera, and iOS.");
    }
}

class OnePlus extends Mobile {
    @Override
    void features() {
        System.out.println("OnePlus: Fast performance, high refresh rate, and Android OS.");
    }
}

public class MobileDemo {
    public static void main(String[] args) {
        Mobile m;

        m = new Samsung();
        m.features();

        m = new Apple();
        m.features();

        m = new OnePlus();
        m.features();
    }
}