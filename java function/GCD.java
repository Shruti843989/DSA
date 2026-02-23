import java.util.*;
public class GCD {
    static int gcd(int a, int b) {
        // while (b != 0) {//when one number become 0 the other number is the gcd ,12%18=12,18%12=6
        //     int temp = b;
        //     b = a % b;
        //     a = temp;   
        // }
        // return a;//gcd

        // if(b==0)return a;
        // return gcd(b, a % b);

        // Everything divides 0
        if (a == 0)
            return b;
        if (b == 0)
            return a;

        // Base case
        if (a == b)
            return a;

        // a is greater
        if (a > b) {
            if (a % b == 0)
                return b;
            return gcd(a - b, b);
        }

        // b is greater
        if (b % a == 0)
            return a;
        return gcd(a, b - a);
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        int result = gcd(num1, num2);
        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + result);
    }
}