import java.util.*;
public class checksorting {
    public static void main(String[] args) {
        Scanner v1= new Scanner(System.in);
        int size=v1.nextInt();
        int arr[]=new int[size];
        boolean isAscending = true;
        boolean isDescending = true;
        for(int i=0;i<size;i++){
            arr[i]=v1.nextInt();
        }
        for(int i=0;i<size-1;i++){
            if(arr[i]>arr[i+1]){
                isAscending=false;
            }
            if(arr[i]<arr[i+1]){
                isDescending=false;
            }
        }
        if(isAscending==true){
            System.out.println("array is sorted in ascending order");
        }
        else{
            System.out.println("array is not sorted in ascending order");
        }
        if(isDescending==true){
            System.out.println("array is sorted in descending order");
        }
        else{
            System.out.println("array is not sorted in descending order");
        }
    }
}
