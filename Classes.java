class Student{
    int rollNo;
    String name;

    void display(){
        System.out.println("Roll No: "+ rollNo);
        System.out.println("Name: "+name);
    }
}

class Bank{
    int accno;
    String accName;
    void display(){
        System.out.println("Roll No: "+ accno);
        System.out.println("Name: "+accName);
    }
}

public class Classes {

    public static void main(String[] args) {
        Student st =  new Student();
        Bank bk = new Bank();

        st.rollNo = 102;
        st.name = "Anshif";
        st.display();
        
        System.out.println();

        bk.accno = 107103;
        bk.accName = "Arjun";
        bk.display();
    }
}