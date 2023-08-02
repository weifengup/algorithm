package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pro1704 {
    public static boolean halvesAreAlike(String s) {
        int half=s.length()/2;
        String model="aeiouAEIOU";
        int ans=0;
        for(int i=0;i<half;i++){
            if(model.indexOf(s.charAt(i))>=0){
                ans++;
            }
        }
        for(int i=half;i<s.length();i++){
            if(model.indexOf(s.charAt(i))>=0){
                ans--;
            }
        }

        return ans==0?true:false;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        System.out.println(halvesAreAlike(s));
    }
}
