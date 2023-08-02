package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pro1556 {
    public static String thousandSeparator(int n) {
        StringBuilder sb=new StringBuilder();
        if(n==0)
            return String.valueOf(n);
        int ans=0;
        while(n>0){
            sb.append(String.valueOf(n%10));
            ans++;
            if(ans%3==0){
                sb.append('.');
            }
            n/=10;
        }
        String temp=sb.toString();
        sb=new StringBuilder();
        for(int i=temp.length()-1;i>=0;i--){
            sb.append(temp.charAt(i));
        }
        temp=sb.toString();
        return temp.charAt(0)=='.'?temp.substring(1):temp;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        System.out.println(thousandSeparator(n));
    }
}
