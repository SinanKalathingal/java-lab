import java.util.scanner;
public class scannerDemo 
{
public static void main(String[] args)
{
scanner sc = new scanner(System.in);
System.out.println("enter your name");
String name=sc.nextLine();
System.out.println("enter your age");
int age = sc.nextInt();
System.out.println("enter your mobile number");
long mobileNo=sc.nextLong();
System.out.println("name:"+name);
System.out.println("age:"+age);
System.out.println("mobile number:"+mobileNo);
}
}