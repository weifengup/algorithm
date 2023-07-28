package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pro915 {
    public static int partitionDisjoint(int[] nums) {
        int ans=1;
        int n=nums.length;
        int[] minRight=new int[n];
        minRight[n-1]=nums[n-1];
        for(int i=n-2;i>=0;i--)
            minRight[i]=Math.min(minRight[i+1],nums[i]);
        int maxLeft=nums[0];
        for(int i=1;i<n;i++){
            maxLeft=Math.max(maxLeft,nums[i-1]);
            if(maxLeft<=minRight[i])
                return i;
        }
        return ans;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] temp=br.readLine().split(" ");
        int[] nums=new int[temp.length];
        for(int i=0;i<nums.length;i++)
            nums[i]=Integer.parseInt(temp[i]);
        System.out.println(partitionDisjoint(nums));
    }
}
