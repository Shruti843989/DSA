import java.util.*;
public class array2d {
    public static void main(String[] args) {
        Scanner v2 = new Scanner(System.in);
        int n= v2.nextInt();
        int m= v2.nextInt();
        int arr[][]=new int[n][m];
        for(int i =0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=v2.nextInt();
        }
    }
    //print
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            System.out.print(arr[i][j]+" ");
        }System.out.println();
    }
    }
}
