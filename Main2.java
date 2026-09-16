
class grandparent {
    grandparent() {
        System.out.println("Constructor of grandparent");
    }
}


class parent extends grandparent {
    parent() {
        System.out.println("Constructor of parent");
    }
}

class child extends parent {
    child() {
        System.out.println("Constructor of child");
    }
}

public class Main2 {
    public static void main(String[] args) {
        child obj = new child();     }
}