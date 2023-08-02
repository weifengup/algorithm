package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pro1678 {
    public static String interpret(String command) {
        StringBuilder sb=new StringBuilder();
        int index=0;
        while(index<command.length()){
            if(command.charAt(index)=='G'){
                sb.append('G');
                index++;
            }else if(command.charAt(index)=='('){
                if(command.charAt(++index)==')'){
                    sb.append('o');
                    index++;
                }else if(command.charAt(index)=='a'){
                    sb.append("al");
                    index+=3;
                }
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String command = br.readLine();
        System.out.println(interpret(command));
    }
}
