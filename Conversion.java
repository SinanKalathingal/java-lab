public class Conversion {
    public static void main(String ar[]){
        byte b;
        int i = 257;
        double d = 323.142;

        System.out.println("\nConversion of int to byte");
        b = (byte)i;
        System.out.println("i and b =" + i + " and " + b);

        System.out.println("\nConversion of double to int");
        i = (int) d;
        System.out.println("d and i = " + d + " and " + i);

        System.out.println("\nConversion of double to byte");
        b = (byte)d;
        System.out.println("d and b = " + d + " and " + b);

    }
}
