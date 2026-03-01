import java.util.*;

public class radix {
    static void bruteradixsort(int arr[], int n) {
        // step1 : find maxi
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        // step2: process each digit
        for (int exp = 1; max / exp > 0; exp *= 10) {
            // Step 3: Compare digits (brute force)
            for (int i = 0; i < n - 1; i++) {
                for (int j = i + 1; j < n; j++) {
                    int d1 = (arr[i] / exp) % 10;
                    int d2 = (arr[j] / exp) % 10;
                    // swap if needed
                    if (d1 > d2) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }

                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        // Input
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Sort
        bruteradixsort(arr, n);

        // Output
        for (int i = 0; i < n; i++) {
            if (i == n - 1)
                System.out.print(arr[i]);
            else
                System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
