package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// value[i]+value[j]+i-j;

public class Pro1014 {
    public static int maxScoreSightseeingPair(int[] values) {
        int ans=0;

        return ans;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] temp=br.readLine().split(" ");
        int[] digits=new int[temp.length];
        for(int i=0;i<digits.length;i++)
            digits[i]=Integer.parseInt(temp[i]);
        System.out.println(maxScoreSightseeingPair(digits));
    }
}
