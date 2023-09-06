package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pro1528 {
    public static String restoreString(String s, int[] indices) {
        char[] ans=new char[s.length()];
        for(int i=0;i<s.length();i++){
            ans[indices[i]]=s.charAt(i);
        }
        return new String(ans);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String[] temp = br.readLine().split(",");
        int[] indices=new int[temp.length];
        for(int i=0;i<indices.length;i++)
            indices[i]=Integer.parseInt(temp[i]);
        System.out.println(restoreString(s,indices));
    }
}
