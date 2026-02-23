import java.util.*;
public class countdigitinnumber {
    public static int digit(int n){
        int count=0;
        while(n>0){
            n/=10;
            count++;
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int digit=digit(n);
        System.out.println(digit);
    }
}
