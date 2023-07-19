package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 注意int越界！！！
 */
public class Pro989 {
    public static List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> ans=new ArrayList<>();
        for(int i=num.length-1;i>=0;i--){
            int temp=num[i]+k%10;
            k/=10;
            if(temp>=10){
                k++;
                temp-=10;
            }
            ans.add(temp);
        }
        for(;k>0;k/=10){
            ans.add(k%10);
        }
        Collections.reverse(ans);
        return ans;
    }
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] temp=br.readLine().split(" ");
        int[] digits=new int[temp.length];
        for(int i=0;i<digits.length;i++)
            digits[i]=Integer.parseInt(temp[i]);
        int k=Integer.parseInt(br.readLine());
        System.out.println(addToArrayForm(digits,k));
    }
}
