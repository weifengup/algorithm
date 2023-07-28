package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 贪心算法
 */
public class Pro334 {
    public static boolean increasingTriplet(int[] nums) {
        if(nums.length<3)
            return false;
        int first=nums[0],second=Integer.MAX_VALUE;
        for(int i=1;i<nums.length;i++){
            int num=nums[i];
            if(num>second){
                return true;
            }else if(num>first){
                second=num;
            }else{
                first=num;
            }
        }
        return false;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] tt=br.readLine().split(" ");
        int[] nums=new int[tt.length];
        for(int i=0;i<nums.length;i++)
            nums[i]=Integer.parseInt(tt[i]);
        System.out.println(increasingTriplet(nums));
    }
}
