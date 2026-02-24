import java.util.*;
public  class twosum {
    public static int[] twosum(int[] nums,int target){
        int[] ans={-1,-1};
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;i<nums.length;i++){
                if(nums[j]==target-nums[i]){
                    if(i!=j && nums[i]!=nums[j])continue;
                    ans = new int[] {i,j};
                    return ans;
                    
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int n=sc.nextInt();
            int target = sc.nextInt();
            int [] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int[] ans = twosum(arr,target);
            for(int i=0;i<ans.length;i++){
                System.out.println(ans[i]+" ");
            }
        
    
        }
}
