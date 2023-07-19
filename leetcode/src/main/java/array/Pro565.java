package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * A中不包含重复元素，也就是说所有点的入度和出度都是1
 */
public class Pro565 {
    public static int arrayNesting(int[] nums) {
        int ans=0;
        boolean[] visited=new boolean[nums.length];
        for(int i=0;i<nums.length;i++){
            int count=0;
            while(!visited[i]){
                visited[i]=true;
                i=nums[i];
                count++;
            }
            ans=Math.max(ans,count);
        }
        return ans;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] temp=br.readLine().split(" ");
        int[] digits=new int[temp.length];
        for(int i=0;i<digits.length;i++)
            digits[i]=Integer.parseInt(temp[i]);
        System.out.println(arrayNesting(digits));
    }
}
