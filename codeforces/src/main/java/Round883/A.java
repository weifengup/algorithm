package Round883;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * https://codeforces.com/contest/1846/problem/A
 */
public class A {
    public static int RopeCount(int[][] nums){
        int ans=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i][0]>nums[i][1]) {
                ans++;
            }
        }
        return ans;
    }
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String temp = br.readLine();
        int t=Integer.parseInt(temp);
        for(int i=0;i<t;i++){
            int n=Integer.parseInt(br.readLine());
            int[][] nums=new int[n][2];
            for (int j=0;j<n;j++){
                String[] s = br.readLine().split(" ");
                nums[j][0]=Integer.parseInt(s[0]);
                nums[j][1]=Integer.parseInt(s[1]);
            }
            System.out.println(RopeCount(nums));
        }
    }
}
