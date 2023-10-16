package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Pro1419 {
    public static int minNumberOfFrogs(String croakOfFrogs) {
        int[] nums=new int[5];
        for(int i=0;i<croakOfFrogs.length();i++){
            switch (croakOfFrogs.charAt(i)){
                case 'c':{
                    if(nums[4]>0)
                        nums[4]--;
                    nums[0]++;
                    break;
                }
                case 'r':{
                    if(nums[0]>0)
                        nums[0]--;
                    else
                        return -1;
                    nums[1]++;
                    break;
                }
                case 'o':{
                    if(nums[1]>0)
                        nums[1]--;
                    else
                        return -1;
                    nums[2]++;
                    break;
                }
                case 'a':{
                    if(nums[2]>0)
                        nums[2]--;
                    else
                        return -1;
                    nums[3]++;
                    break;
                }
                case 'k':{
                    if(nums[3]>0)
                        nums[3]--;
                    else
                        return -1;
                    nums[4]++;
                    break;
                }
            }
        }
        for(int i=0;i<=3;i++)
            if(nums[i]>0)
                return -1;
        return nums[4];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String croakOfFrogs = br.readLine();
        System.out.println(minNumberOfFrogs(croakOfFrogs));
    }
}
