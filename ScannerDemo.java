import java.util.Scanner;
public class ScannerDemo {
    public static void main(String ar[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter you age: ");
        int age = sc.nextInt();

        System.out.print("Enter your Mobile number: ");
        long mobileNo = sc.nextLong();

        System.out.println("\n\nName: "+ name);
        System.out.println("Age: "+ age);
        System.out.println("Mobile Number: "+ mobileNo);

        sc.close();
    }
}
