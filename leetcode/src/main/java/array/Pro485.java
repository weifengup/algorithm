package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pro485 {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int ans=0;
        int constant=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                constant++;
            }else {
                ans = Math.max(ans, constant);
                constant = 0;
            }
        }
        ans=Math.max(constant,ans);
        return ans;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] temp=br.readLine().split(" ");
        int[] digits=new int[temp.length];
        for(int i=0;i<digits.length;i++)
            digits[i]=Integer.parseInt(temp[i]);
        System.out.println(findMaxConsecutiveOnes(digits));
    }
}
