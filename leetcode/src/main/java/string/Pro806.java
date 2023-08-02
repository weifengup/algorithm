package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pro806 {
    public static int[] numberOfLines(int[] widths, String s) {
        int[] ans={0,0};
        int level=1;
        int num=0;
        for(int i=0;i<s.length();i++){
            if(num+widths[s.charAt(i)-'a']<=100){
                num+=widths[s.charAt(i)-'a'];
            }else{
                num=widths[s.charAt(i)-'a'];
                level++;
            }
        }
        ans[0]=level;
        ans[1]=num;
        return ans;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] temp = br.readLine().split(",");
        int[] widths=new int[temp.length];
        for(int i=0;i<widths.length;i++){
            widths[i]=Integer.parseInt(temp[i]);
        }
        String s=br.readLine();
        int[] ans = numberOfLines(widths, s);
        for(int a:ans){
            System.out.println(a);
        }
    }
}
