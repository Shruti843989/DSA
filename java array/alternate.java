import java.util.*;
public class alternate {
    public static int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int []p=new int[n/2];
        int []ne=new int[n/2];
        for(int i =0;i<n;i++){
            if(nums[i]>0){
                p[i]=nums[i];
            }
            else{
                ne[i]=nums[i];
            }           
        }
        for(int i=0;i<n/2;i++){
            nums[2*i]=p[i];
            nums[2*i+1]=ne[i];
        }
    return nums;}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int [] newarr=new int [n];
        newarr=rearrangeArray(nums);
    }
}

