public class StringOperations {
    public static void main(String[] args) {

        String str1 = "Hello";
        String str2 = "World";
        String str3 = "";
        String str4 = "Hello";

        // charAt()
        System.out.println("Character at index 1 of str1: " + str1.charAt(1));

        // substring()
        System.out.println("Substring of str1 (1 to 4): " + str1.substring(1, 4));

        // concat()
        System.out.println("Concatenated String: " + str1.concat(" ").concat(str2));

        // equals()
        System.out.println("str1 equals str2: " + str1.equals(str2));
        System.out.println("str1 equals str4: " + str1.equals(str4));

        // isEmpty()
        System.out.println("Is str3 empty? " + str3.isEmpty());
        System.out.println("Is str1 empty? " + str1.isEmpty());
    }
}