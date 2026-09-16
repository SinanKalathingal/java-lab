class Student {
    void study() {
        System.out.println("Student is studying");
    }
}

class ScienceStudent extends Student {
    @Override
    void study() {
        System.out.println("Science student is studying Physics, Chemistry and Mathematics");
    }
}

class CommerceStudent extends Student {
    @Override
    void study() {
        System.out.println("Commerce student is studying Accountancy, Business and Economics");
    }
}

class ArtsStudent extends Student {
    @Override
    void study() {
        System.out.println("Arts student is studying History, Political Science and English");
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new ScienceStudent();
        Student s2 = new CommerceStudent();
        Student s3 = new ArtsStudent();

        s1.study();
        s2.study();
        s3.study();
    }
}