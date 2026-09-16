// Superclass
class Employee {
    public void work() {
        System.out.println("Employee is working.");
    }
}

// Subclass Manager
class Manager extends Employee {
    @Override
    public void work() {
        System.out.println("Manager is managing the team and planning projects.");
    }
}

// Subclass Developer
class Developer extends Employee {
    @Override
    public void work() {
        System.out.println("Developer is writing and testing code.");
    }
}

// Subclass Clerk
class Clerk extends Employee {
    @Override
    public void work() {
        System.out.println("Clerk is maintaining records and handling office tasks.");
    }
}

// Main class
public class EmployeeDemo {
    public static void main(String[] args) {
        Employee e1 = new Manager();
        Employee e2 = new Developer();
        Employee e3 = new Clerk();

        e1.work();
        e2.work();
        e3.work();
    }
}