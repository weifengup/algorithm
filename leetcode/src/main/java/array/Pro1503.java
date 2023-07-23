package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pro1503 {
    public static int getLastMoment(int n, int[] left, int[] right) {
        int ans=0;
        for(int i=0;i<left.length;i++){
            ans=Math.max(left[i],ans);
        }
        for(int i=0;i<right.length;i++){
            ans=Math.max(n-right[i],ans);
        }
        return ans;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        String[] tt1=br.readLine().split(" ");
        int[] left=new int[tt1.length];
        String[] tt2=br.readLine().split(" ");
        int[] right=new int[tt2.length];
        for(int i=0;i< tt1.length;i++){
            left[i]=Integer.parseInt(tt1[i]);
        }
        for(int i=0;i< tt2.length;i++){
            right[i]=Integer.parseInt(tt2[i]);
        }
        System.out.println(getLastMoment(n,left,right));
    }
}
