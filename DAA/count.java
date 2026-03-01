package DAA;
import java.util.*;
public class count {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        // Input
        for(int i =0;i<n;i++) {
            arr[i] = sc.nextInt();
    }
    // step1: find max
    int max = arr[0];
    for(int i =1;i<n;i++){
        if(arr[i]>max) {
        max = arr[i];
    }
}
    // Count array
    int[] count = new int[max+1];
    for(int i =0;i<n;i++){
        count[arr[i]]++;
    }

     // Step 3: Running sum (prefix array)
     for(int i =1;i<=max; i++){
        count[i] = count[i]+count[i-1];
     }
     //output array
     int output[] = new int[n];
     for(int i= n-1;i >= 0 ;i--){
        output[--count[arr[i]]] = arr[i];
     }
     // copy back
     for(int i = 0;i< n;i++){
        arr[i] = output[i];
     }
     // Print
        for(int i = 0; i < n; i++) {
            if(i == n-1)
                System.out.print(arr[i]);
            else
                System.out.print(arr[i] + " ");
        }
}
}
