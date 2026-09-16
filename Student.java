public class Student{
    String name;
    int rollNo;
    int age;

    void info(){
        System.out.println("\nName: "+ name);
        System.out.println("Roll Number: "+ rollNo);
        System.out.println("Age: "+ age);
    }
    
    public static void main( String args[]){
        Student st = new Student();
        Student st1 = new Student();

        st.name = "Ram";
        st.rollNo = 23;
        st.age = 20;

        st1.name = "Seetha";
        st1.rollNo = 24;
        st1.age = 19;

        st.info();
        st1.info();
    }   
}