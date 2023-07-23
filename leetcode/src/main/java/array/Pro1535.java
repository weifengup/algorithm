package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pro1535 {
    public static int getWinner(int[] arr, int k) {
        int ans=0;
        int n=arr.length;
        int stack=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]<stack){
                ans++;
                if(ans==k){
                    return stack;
                }
            }else{
                stack=arr[i];
                ans=1;
                if(ans==k){
                    return stack;
                }
            }
        }
        return stack;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] tt=br.readLine().split(" ");
        int[] arr=new int[tt.length];
        for(int i=0;i<arr.length;i++){
            arr[i]=Integer.parseInt(tt[i]);
        }
        int k=Integer.parseInt(br.readLine());
        System.out.println(getWinner(arr,k));
    }
}
