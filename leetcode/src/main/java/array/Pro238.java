package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pro238 {
    public static int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] ans=new int[n];
        int[] front=new int[n];
        int[] back=new int[n];
        front[0]=1;
        back[n-1]=1;
        for(int i=1;i<n;i++)
            front[i]=front[i-1]*nums[i-1];
        for(int i=n-2;i>=0;i--)
            back[i]=back[i+1]*nums[i+1];
        for(int i=0;i<n;i++)
            ans[i]=front[i]*back[i];
        return ans;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String [] temp=br.readLine().split(" ");
        int[] nums=new int[temp.length];
        for(int i=0;i<nums.length;i++)
            nums[i]=Integer.parseInt(temp[i]);
        int[] ans=productExceptSelf(nums);
        for(int a:ans)
            System.out.println(a);
    }
}
