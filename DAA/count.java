package DAA;
import java.util.*;
public class count {

   public static void countingSort(int[] arr, int n) {
       int max = arr[0];
	   for(int i =0;i<n;i++){
		   if(arr[i]>max){
			   max = arr[i];
		   }
	   }
	   int[] count = new int[max+1];
	   for(int i =0;i<n;i++){
		   count[arr[i]]++;
	   }
	   for(int i =1 ;i<=max;i++){
		   count[i]+=count[i-1];
	   }
	   int[] op = new int[n];
	   for(int i =n-1;i>=0;i++){
		   op[--count[arr[i]]]=arr[i];
	   }
	   for(int i =0;i<n;i++){
		   arr[i]=op[i];
	   }
   }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
    
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        countingSort(arr, n);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
            if (i < n - 1) System.out.print(" ");
        }
	}
}
 