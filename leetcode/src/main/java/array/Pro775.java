package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 逆向思维，不一定非得把该得到的全部求出来！
 */
public class Pro775 {
    public static boolean isIdealPermutation(int[] nums) {
        int n=nums.length;
        int minRight=nums[n-1];
        for(int i=n-3;i>=0;i--){
            if(nums[i]>minRight){
                return false;
            }
            minRight=Math.min(minRight,nums[i+1]);
        }

        return true;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] tt = br.readLine().split(" ");
        int[] nums=new int[tt.length];
        for(int i=0;i<nums.length;i++)
            nums[i]=Integer.parseInt(tt[i]);
        System.out.println(isIdealPermutation(nums));

    }
}
