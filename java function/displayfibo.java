// import java.util.*;
// public class displayfibo {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int t1 = 0;
//         int t2 = 1;
//         int nextterm=t1+t2;
//         System.out.println("Enter the number of terms: ");
//         int n=sc.nextInt();
//         System.out.println("Fibonacci Series: "+t1+" "+ t2+" ");
//         for(int i = 3; i <= n; ++i){
// System.out.print(nextterm+" ");
//     t1 = t2;
//     t2 = nextterm;
//     nextterm = t1 + t2;
//         }
       
        
//     }
// }

 
import java.util.*;
public class displayfibo {
    public static int fibo(int n){
        if(n==0 ||n==1){
            return 1;
        }return fibo(n-1)+fibo(n-2);
        // int a=0;
        // int b=1;
        // for(int i =0;i<n;i++){
        //     System.out.println(a+" ");
        //     int c=a+b;
        //     a=b;
        //     b=c;
        } 
    

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a = fibo(n);
        System.out.println(a);
    }
}
