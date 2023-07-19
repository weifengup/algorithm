package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pro1450 {
    public static int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int ans=0;
        for(int i=0;i<startTime.length;i++){
            if(queryTime>=startTime[i]&&queryTime<=endTime[i])
                ans++;
        }
        return ans;

    }
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] tt1=br.readLine().split(" ");
        int[] startTime=new int[tt1.length];
        for(int i=0;i<startTime.length;i++)
            startTime[i]=Integer.parseInt(tt1[i]);
        tt1=br.readLine().split(" ");
        int[] endTime=new int[tt1.length];
        for(int i=0;i<endTime.length;i++)
            endTime[i]=Integer.parseInt(tt1[i]);
        int queryTime=Integer.parseInt(br.readLine());
        System.out.println(busyStudent(startTime,endTime,queryTime));
    }
}
