import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class bucket {
    // Bucket Sort Function
    static void bucketSort(float arr[], int n) {

        // Step 1: Create buckets
        ArrayList<Float>[] buckets = new ArrayList[n];
        for(int i = 0; i < n; i++) {
            buckets[i] = new ArrayList<Float>();
        }

        // Step 2: Insert elements into buckets
        for(int i = 0; i < n; i++) {
            int index = (int)(arr[i] * n);
            if(index >= n) index = n - 1;
            buckets[index].add(arr[i]);
        }

        // Step 3: Sort each bucket
        for(int i = 0; i < n; i++) {
            Collections.sort(buckets[i]);
        }

        // Step 4: Merge buckets
        int k = 0;
        for(int i = 0; i < n; i++) {
            for(float value : buckets[i]) {
                arr[k++] = value;
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        float arr[] = new float[n];

        // Input
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextFloat();
        }

        // Bucket Sort
        bucketSort(arr, n);

        // Output
        for(int i = 0; i < n; i++) {
            if(i == n-1)
                System.out.print(arr[i]);
            else
                System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}

