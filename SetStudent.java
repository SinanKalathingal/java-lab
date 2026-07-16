class Student{
	int rollNo;
	String name;
	double mark;

	void setStudent(int r, String n, double m){
		rollNo = r;
		name = n;
		mark = m;
	}
	
	void display(){
		System.out.println("Roll Number: "+ rollNo);
		System.out.println("Name: "+ name);
        	System.out.println("Mark: "+ mark);
	}
}

class SetStudent{
	public static void main (String args[]){
		Student s1 = new Student();
		
		s1.setStudent(101, "Swalih", 93);
		s1.display();
	}
}