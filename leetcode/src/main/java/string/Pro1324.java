package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Pro1324 {
    public static List<String> printVertically(String s) {
        s=s.trim();
        String[] words = s.split(" ");
        int flag=s.length()-1;
        int index=0;
        List<String> ans=new ArrayList<>();
        while(flag!=-1){
            StringBuilder sb=new StringBuilder();
            int end=flag;
            flag=-1;
            for(int i=0;i<=end;i++){
                if(index<words[i].length()){
                    sb.append(words[i].charAt(index));
                    flag=i;
                }else{
                    sb.append(" ");
                }
            }
            index++;
            ans.add(sb.toString());
        }
        return ans;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        List<String> strings = printVertically(s);
        for(String ss:strings){
            System.out.println(ss);
        }
    }
}
