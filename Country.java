import java.util.Scanner;

class CountryDetails{

    String name;
    String capital;
    float gdp;
    int since;

    Scanner sc = new Scanner(System.in);


    void setDetails(){
        System.out.print("\nEnter Country name: ");
        name = sc.nextLine();

        System.out.print("Enter Capital: ");
        capital = sc.nextLine();

        System.out.print("Enter GDP: ");
        gdp = sc.nextFloat();

        System.out.print("Enter Year of Establishment: ");
        since = sc.nextInt();
    }

    void
     display(){
        System.out.println("\nCountry: "+ name);
        System.out.println("Capital: "+ capital);
        System.out.println("GDP: "+ gdp + " Trillion Dollars");
        System.out.println("Since: "+ since);

    }
}

class Country{
    public static void main(String args[]){

        CountryDetails c1 = new CountryDetails();
        c1.setDetails();
        // c1.setDetails("India", "New Delhi", 1947, 4.15);

        CountryDetails c2 = new CountryDetails();
        c2.setDetails();
        // c2.setDetails("China", "Beijing", 1949, 20.85);
        
        c1.display();
        c2.display();


    }
}