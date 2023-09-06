package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 抽象问题：其实只要看两个字符串的L和R的相对位置关系即可
 */
public class Pro777 {
    public static boolean canTransform(String start, String end) {
        if(start.length()==1){
            return start.equals(end);
        }
        int sindex=0,eindex=0;
        while(sindex<start.length()&&eindex<end.length()){
            while(sindex<start.length()&&start.charAt(sindex)=='X') sindex++;
            while(eindex<end.length()&&end.charAt(eindex)=='X') eindex++;
            if(sindex>=start.length()||eindex>=end.length()) return sindex==eindex;
            if(start.charAt(sindex)!=end.charAt(eindex)) return false;
            if(start.charAt(sindex)=='R'&&sindex>eindex) return false;
            if(start.charAt(sindex)=='L'&&sindex<eindex) return false;
            sindex++;
            eindex++;
        }
        while (sindex<start.length()){
            if(start.charAt(sindex)!='X')
                return false;
        }
        while(eindex<end.length()){
            if(end.charAt(eindex)!='X')
                return false;
        }
        return true;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String start = br.readLine();
        String end = br.readLine();
        System.out.println(canTransform(start,end));
    }
}
