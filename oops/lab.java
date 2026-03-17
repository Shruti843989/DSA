import java.util.*;
public class lab {
    public static int greatest(int a,int b,int c){
    if(a>b && a>c) return a;
    else if(b>a && b>c) return b;
    else return c;
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first no.");
        int a = sc.nextInt();
        System.out.println("Enter the Second no.");
        int b=sc.nextInt();
        System.out.println("Enter the third no.");
        int c=sc.nextInt();
        int result = greatest(a, b, c);
        System.out.println("the result is "+ result );
    }
}