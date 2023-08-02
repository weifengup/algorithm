package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pro520 {
    public static boolean detectCapitalUse(String word) {
        // 0 全大写，1全小写，2首字母大写
        int status=-1;
        if(word.length()==1)
            return true;
        if(word.charAt(0)>='a'&&word.charAt(0)<='z'){
            status=1;
        }else{
            if(word.charAt(1)>='a'&&word.charAt(1)<='z'){
                status=2;
            }else{
                status=0;
            }
        }
        for(int i=1;i<word.length();i++){
            if(status==0&&word.charAt(i)>='a'&&word.charAt(i)<='z')
                return false;
            else if(status==1&&word.charAt(i)>='A'&&word.charAt(i)<='Z')
                return false;
            else if(status==2&&word.charAt(i)>='A'&&word.charAt(i)<='Z')
                return false;
        }
        return true;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        System.out.println(detectCapitalUse(word));
    }
}
