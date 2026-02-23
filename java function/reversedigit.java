import java.util.Scanner;
public class reversedigit {
     public static int sum(int n){
        int reverse=0;
        while(n>0){
            int lastdigit=n%10;
            n/=10;
            reverse=reverse*10+lastdigit;
        }
        return reverse;

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int sum=sum(n);
        System.out.println(sum);
    }
}
