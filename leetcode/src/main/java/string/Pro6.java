package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pro6 {
    public static String convert(String s, int numRows) {
        if(numRows==1)
            return s;
        StringBuilder[] sbs=new StringBuilder[numRows];
        for(int i=0;i<numRows;i++)
            sbs[i]=new StringBuilder();
        int flag=1;
        int index=0;
        for(int i=0;i<s.length();i++){
            sbs[index].append(s.charAt(i));
            if((index==numRows-1&&flag==1)||(index==0&&flag==-1)){
                flag=-flag;
            }
            index+=flag;
        }
        for(int i=1;i<numRows;i++)
            sbs[0].append(sbs[i]);
        return sbs[0].toString();
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int numRows=Integer.parseInt(br.readLine());
        System.out.println(convert(s,numRows));
    }
}
