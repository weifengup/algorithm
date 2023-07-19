package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 枚举优化：时间复杂度降低一层
 * 原理：枚举其中一个数之后，题目的条件已经确定了其他的要素（另一个数）的条件，
 * 如果能找到一种方法直接判断题目要求的那个数是否存在，就可以省掉枚举后一个数的时间了。
 * 较为进阶地，在数据范围允许的情况下，我们可以使用桶1记录遍历过的数。
 */
public class Pro1534 {
    public static int countGoodTriplets(int[] arr, int a, int b, int c) {
        int ans=0,n=arr.length;
        int []mem=new int[1001];
        for(int j=0;j<n-1;j++){
            for(int k=j+1;k<n;k++){
                if(Math.abs(arr[j]-arr[k])<=b){
                    int lj=arr[j]-a,rj=arr[j]+a;
                    int lk=arr[k]-c,rk=arr[k]+c;
                    int l=Math.max(0,Math.max(lj,lk));
                    int r=Math.min(1000,Math.min(rj,rk));
                    if(l<=r){
                        if(l==0){
                            ans+=mem[r];
                        }else{
                            ans+=mem[r]-mem[l-1];
                        }
                    }
                }
            }
            for(int i=arr[j];i<=1000;i++){
                mem[i]++;
            }
        }
        return ans;
    }
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] tt=br.readLine().split(" ");
        int[] arr=new int[tt.length];
        for(int i=0;i<arr.length;i++){
            arr[i]=Integer.parseInt(tt[i]);
        }
        int a=Integer.parseInt(br.readLine());
        int b=Integer.parseInt(br.readLine());
        int c=Integer.parseInt(br.readLine());
        System.out.println(countGoodTriplets(arr,a,b,c));
    }
}
