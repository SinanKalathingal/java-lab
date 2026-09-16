
class Student {
    void display() {
        System.out.println("This is the Student class.");
    }
}

class UGStudent extends Student {
    @Override
    void display() {
        System.out.println("This is the UG Student class.");
    }
}
public class UG {
    public static void main(String[] args) {
        Student obj = new UGStudent();
        obj.display(); 
    }
}