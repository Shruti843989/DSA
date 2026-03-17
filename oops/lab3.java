import java.util.*; 
public class lab3 {
    public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // 1. Count characters
        int length = str.length();
        System.out.println("Number of characters in the string: " + length);

        // 2. Reverse the string
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        System.out.println("Reversed string: " + reversed);

        // 3. Check palindrome
        if (str.equalsIgnoreCase(reversed)) {  // ignoring case
            System.out.println("The string is a Palindrome.");
        } else {
            System.out.println("The string is NOT a Palindrome.");
        }

        sc.close();
    }
}

