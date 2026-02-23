import java.util.*;
public class thirdlarge {
   public static void main(String[] args) {
    
   
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]= new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
    //find the first maximum element
        int first = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>first){
                first=arr[i];
            }
        }
    //find the second max element 
        int Second = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>Second && arr[i]<first){
                Second=arr[i];
            }
        }
    //find the third largest element
    int third = Integer.MIN_VALUE;
    for(int i=0;i<n;i++){
        if(arr[i]>third && arr[i]<Second){
            third = arr[i];
        }
    }
    System.out.println(third);
    }
}

