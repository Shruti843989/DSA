import java.util.*;

public class Shellsort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENter size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        for (int gap = n / 2; gap > 0; gap = gap / 2) {
            for (int i = 0; i < n - gap; i++) {
                for (int j = i + gap; j < n; j = j + gap) {
                    if (arr[i] > arr[j]) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        }
        for (int i = 0; i < n; i++) {
            if (i == n - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
