package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pro665 {
    public static boolean checkPossibility(int[] nums) {
        int flag=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<nums[i-1]){
                flag++;
                if(flag>1)
                    return false;
                if(i-2>=0&&nums[i]<nums[i-2]){
                    nums[i]=nums[i-1];
                }
            }
        }
        return true;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] temp=br.readLine().split(" ");
        int[] digits=new int[temp.length];
        for(int i=0;i<digits.length;i++)
            digits[i]=Integer.parseInt(temp[i]);
        System.out.println(checkPossibility(digits));
    }
}
