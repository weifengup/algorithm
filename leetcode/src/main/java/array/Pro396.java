package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 对于这种有公式的，可以利用数学方法推出递推公式，然后利用dp来做！
 * dp[0]=0*num[0]+1*num[1]+2*num[2]
 * dp[1]=0*num[1]+1*num[2]+2*num[0]=dp[0]-sum+len*(num[0])
 */
public class Pro396 {
    public static int maxRotateFunction(int[] nums) {
        int ans=0;
        int sum=0;
        int dp=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            dp+=i*nums[i];
        }
        ans=dp;
        for(int i=1;i<n;i++){
            dp=dp-sum+n*nums[i-1];
            ans=Math.max(dp,ans);
        }
        return ans;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] tt=br.readLine().split(" ");
        int[] nums=new int[tt.length];
        for(int i=0;i<nums.length;i++){
            nums[i]=Integer.parseInt(tt[i]);
        }
        System.out.println(maxRotateFunction(nums));
    }
}
