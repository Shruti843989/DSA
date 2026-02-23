import java.util.*;

public class PowerFunction {
    // Function to calculate x^n
    static int power(int x, int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= x;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base number x: ");
        int x = sc.nextInt();

        System.out.print("Enter exponent n: ");
        int n = sc.nextInt();

        int result = power(x, n);
        System.out.println(x + " raised to the power " + n + " is: " + result);
    }
}