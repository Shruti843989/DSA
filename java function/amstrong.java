import java.util.*;
public class amstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        while(n>0){
            int lastdigit=n%10;
            sum+=lastdigit*lastdigit*lastdigit;
            n/=10;
        }
        System.out.println(sum);
    }
    
}
