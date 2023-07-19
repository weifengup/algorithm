package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pro896 {
    public static boolean isMonotonic(int[] nums) {
        int n=nums.length;
        if(n<=2)
            return true;
        boolean increase=false;
        boolean decrease=false;
        for(int i=1;i<n;i++){
           if(nums[i]>nums[i-1]){
               if(increase)continue;
               if(decrease) return false;
               increase=true;
           }else if(nums[i]<nums[i-1]){
               if(decrease) continue;
               if(increase) return false;
               decrease=true;
           }
        }
        return true;
    }
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] tt=br.readLine().split(" ");
        int[] arr=new int[tt.length];
        for(int i=0;i<arr.length;i++){
            arr[i]=Integer.parseInt(tt[i]);
        }
        System.out.println(isMonotonic(arr));
    }
}
