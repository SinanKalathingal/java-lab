import java.util.Scanner;
class school
{
int schoolcode; 
String schoolName; 
String location;
 
school(int code,String name,String loc){
schoolcode=code; 
schoolName=name; 
location=loc;
}
school(){
schoolcode=100;
schoolName="abc school";
location="calicut";
}

void display()            
{ System.out.println("school code: "+schoolcode);
 System.out.println("school Name: "+schoolName);
 System.out.println("location: "+location);
 } public static void main(String[]args)
{ Scanner sc=new Scanner(System.in);
 school s1=new school();
 System.out.println("Enter school code:");
 s1.schoolcode=sc.nextInt(); 
sc.nextLine();
 System.out.println("Enter school name:"); 
s1.schoolName=sc.nextLine();
 System.out.println("Enter Location:");
 s1.location=sc.nextLine(); 
System.out.println("\nschool Details");
 s1.display();
 sc.close(); } }                                                                                                                                                                                                                                  