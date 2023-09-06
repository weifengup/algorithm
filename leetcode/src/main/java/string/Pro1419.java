package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Pro1419 {
    public static int minNumberOfFrogs(String croakOfFrogs) {
        List<Integer>[] list=new List[5];
        int[] nums=new int[5];
        for(int i=0;i<5;i++)
            list[i]=new ArrayList<>();
        for(int i=0;i<croakOfFrogs.length();i++){
            switch (croakOfFrogs.charAt(i)){
                case 'c':{
                    list[0].add(i);
                    nums[0]++;
                    break;
                }
                case 'r':{
                    if(nums[1]>=nums[0])
                        return -1;
                    nums[1]++;
                    list[1].add(i);
                    break;
                }
                case 'o':{
                    if(nums[2]>=nums[1])
                        return -1;
                    nums[2]++;
                    list[2].add(i);
                    break;
                }
                case 'a':{
                    if(nums[3]>=nums[2])
                        return -1;
                    nums[3]++;
                    list[3].add(i);

                    break;
                }
                case 'k':{
                    if(nums[4]>=nums[3])
                        return -1;
                    nums[4]++;
                    list[4].add(i);
                    break;
                }
            }
        }
        int num=nums[0];
        for(int i=1;i<5;i++)
            if(nums[i]!=num)
                return -1;
        int ans=1;
        for(int i=1;i<num;i++){
            boolean add=true;
            for(int j=0;j<i;j++){
                if(list[0].get(i)>list[4].get(j)){
                    add=false;
                }
            }
            if(add)
                ans++;
        }
        return ans;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String croakOfFrogs = br.readLine();
        System.out.println(minNumberOfFrogs(croakOfFrogs));
    }
}
