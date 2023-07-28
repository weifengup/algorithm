package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// value[i]+value[j]+i-j;

/**
 * 这道题，dp公式都直接告诉了
 */
public class Pro1014 {
    public static int maxScoreSightseeingPair(int[] values) {
        int ans=0,n=values.length;
        int[] dp=new int[n];
        dp[0]=values[0]+0;
        for(int i=1;i<n;i++){
            dp[i]=Math.max(dp[i-1],values[i]+i);
            if(values[i]-i+dp[i-1]>ans){
                ans=values[i]-i+dp[i-1];
            }
        }
        return ans;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] temp=br.readLine().split(" ");
        int[] digits=new int[temp.length];
        for(int i=0;i<digits.length;i++)
            digits[i]=Integer.parseInt(temp[i]);
        System.out.println(maxScoreSightseeingPair(digits));
    }
}
