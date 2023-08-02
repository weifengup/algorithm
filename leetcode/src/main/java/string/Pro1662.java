package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pro1662 {
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String temp1="";
        String temp2="";
        for(int i=0;i<word1.length;i++){
            temp1+=word1[i];
        }
        for(int i=0;i< word2.length;i++){
            temp2+=word2[i];
        }
        return temp1.equals(temp2);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n1 = Integer.parseInt(br.readLine());
        String[] temp1=new String[n1];
        for(int i=0;i<n1;i++){
            temp1[i]= br.readLine();
        }
        int n2 = Integer.parseInt(br.readLine());
        String[] temp2=new String[n2];
        for(int i=0;i<n2;i++){
            temp2[i]=br.readLine();
        }
        System.out.println(arrayStringsAreEqual(temp1,temp2));
    }
}
