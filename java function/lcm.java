import java.util.*;
public class lcm {
    public static int findlcm(int a , int b){
        int max = Math.max(a,b);
        int lcm=max;
        while(true){
            if( lcm%a==0 && lcm%b==0){
                return lcm;
            }
            lcm+=max;
        }
    }
    public static void main(String[] args) {
        Scanner v2 = new Scanner(System.in);
        int a = v2.nextInt();
        int b = v2.nextInt(); 
        int lcm=findlcm(a,b);
        System.out.println(lcm);
    }
}
