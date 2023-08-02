package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pro824 {
    public static String toGoatLatin(String sentence) {
        StringBuilder sb=new StringBuilder();
        String model="aeiouAEIOU";
        String[] sents=sentence.split(" ");
        for(int i=0;i<sents.length;i++){
            if(model.indexOf(sents[i].charAt(0))>=0){
                sb.append(sents[i]);
            }else{
                sb.append(sents[i].substring(1));
                sb.append(sents[i].charAt(0));
            }
            sb.append("ma");
            for(int j=0;j<i+1;j++){
                sb.append("a");
            }
            sb.append(" ");
        }

        String ans=sb.toString();
        return ans.substring(0,ans.length()-1);
    }
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String sentence = br.readLine();
        System.out.println(toGoatLatin(sentence));
    }
}
