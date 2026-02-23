import java.util.*;
public class arrayinput {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        //size
        int n= sc.nextInt();
        int arr[]=new int[n];
        //input array
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        //array output
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}