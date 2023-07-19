package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pro66 {
    public static int[] plusOne(int[] digits) {
        boolean carry=true;
        for(int i=digits.length-1;i>=0;i--){
            if(carry){
                int temp=digits[i]+1;
                digits[i]=temp%10;
                if(temp<10){
                    carry=false;
                }
            }else{
                break;
            }
        }
        if(!carry)
            return digits;
        else{
            int[] ans=new int[digits.length+1];
            ans[0]=1;
            for(int i=0;i<digits.length;i++)
                ans[i+1]=digits[i];
            return ans;
        }
    }
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] temp=br.readLine().split(" ");
        int[] digits=new int[temp.length];
        for(int i=0;i<digits.length;i++)
            digits[i]=Integer.parseInt(temp[i]);
        int[] ans=plusOne(digits);
        for(int a:ans)
            System.out.println(a);
    }
}
