class Student{
	int rollNo;
	String name;
	double mark;

	Student(int r, String n, double m){
		rollNo = r;
		name = n;
		mark = m;
	}
	
	void display(){
		System.out.println("Roll Number: "+ rollNo);
		Sy+stem.out.println("Name: "+ name);
        	System.out.println("Mark: "+ mark);
	}
}

class ConstructorDemo{
	public static void main (String args[]){
		Student s1 = new Student(101, "Swalih", 93);
		
		s1.display();
	}
}