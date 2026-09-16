
class Student2 {
    void display() {
        System.out.println("This is the Student class.");
    }
}


class UGStudent extends Student2 {

    @Override
    void display() {
        System.out.println("This is the UG Student class.");
    }
}
public class Main {
    public static void main(String[] args) {
        Student2 obj = new UGStudent();
        obj.display(); 
    }
}