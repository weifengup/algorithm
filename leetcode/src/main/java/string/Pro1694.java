package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pro1694 {
    public static String reformatNumber(String number) {
        StringBuilder sb=new StringBuilder();
        int num=0;
        for(int i=0;i<number.length();i++){
            if(number.charAt(i)!=' '&&number.charAt(i)!='-'){
                sb.append(number.charAt(i));
                num++;
            }
            if(i%3==2){
                sb.append('-');
            }
        }
        if(num%3==0){
            sb.deleteCharAt(sb.length()-1);
        }else if(num%3==1&&num>=4){
            sb.deleteCharAt(sb.length()-2);
            sb.insert(sb.length()-2,'-');
        }
        return sb.toString();
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String number = br.readLine();
        System.out.println(reformatNumber(number));
    }
}
