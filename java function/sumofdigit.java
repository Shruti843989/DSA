import java.util.*;
public class sumofdigit {
    public static int sum(int n){
        int sum=0;
        while(n>0){
            int lastdigit=n%10;
            sum+=lastdigit;
            n/=10;
        }
        return sum;

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int sum=sum(n);
        System.out.println(sum);
    }
}
