package Round883;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class B {
    public static String winner(char[][] nums){
        String  ans="DRAW";
        for(int i=0;i<3;i++){
            if(nums[i][0]!='.'&&nums[i][0]==nums[i][1]&&nums[i][1]==nums[i][2]){
                return String.valueOf(nums[i][0]);
            }
        }
        for(int i=0;i<3;i++){
            if(nums[0][i]!='.'&&nums[0][i]==nums[1][i]&&nums[1][i]==nums[2][i]){
                return String.valueOf(nums[0][i]);
            }
        }
        if(nums[0][0]!='.'&&nums[0][0]==nums[1][1]&&nums[1][1]==nums[2][2]){
            return String.valueOf(nums[0][0]);
        }
        if(nums[0][2]!='.'&&nums[0][2]==nums[1][1]&&nums[1][1]==nums[2][0]){
            return String.valueOf(nums[0][2]);
        }
        return ans;
    }
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        for(int i=0;i<t;i++){
            char[][] nums=new char[3][3];
            for (int j=0;j<3;j++){
                String s = br.readLine();
                nums[j][0]=s.charAt(0);
                nums[j][1]=s.charAt(1);
                nums[j][2]=s.charAt(2);
            }
            System.out.println(winner(nums));
        }
    }
}
