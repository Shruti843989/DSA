import java.util.*;
public class stringinput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        String name[]=new String[n];
        //string input
        for(int i=0;i<n;i++){
            name[i]=sc.next();
        }
        //print
        for(int i=0;i<n;i++){
            System.out.println(name[i]);
        }
    }
    
}
