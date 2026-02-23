import java.util.*;
public class pascaltriangle {
    public static int [][] pascal(int n){
        int[][] arr=new int [n][];
        for(int i=0;i<n;i++){
            //for taking space for column
            arr[i]=new int[i+1];
            arr[i][0]= arr[i][i]=1;
            for(int j=1;j<i;j++){
                arr[i][j]=arr[i-1][j]+arr[i-1][j-1];
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [][] ans = pascal(n);
        for(int i=0;i<ans.length;i++){
            for(int j=0;j<ans[i].length;j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
}
