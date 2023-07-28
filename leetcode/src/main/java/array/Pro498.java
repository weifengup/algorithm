package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pro498 {
    public static int[] findDiagonalOrder(int[][] mat) {
        int m=mat.length,n=mat[0].length;
        int[] ans=new int[m*n];
        ans[m*n-1]=mat[m-1][n-1];
        if(m==1&&n==1)
            return ans;
        int index=0,i=0,j=0;
        boolean rightTop=true;
        while(i!=m-1||j!=n-1){
            ans[index++]=mat[i][j];
            if(rightTop){
                if(i-1>=0&&j+1<n){
                    i=i-1;
                    j=j+1;
                }else if(j+1<n){
                    j=j+1;
                    rightTop=!rightTop;
                }else if(i+1<m){
                    i=i+1;
                    rightTop=!rightTop;
                }
            }else{
                if(i+1<m&&j-1>=0){
                    i=i+1;
                    j=j-1;
                }else if(i+1<m){
                    i=i+1;
                    rightTop=!rightTop;
                }else if(j+1<n){
                    j=j+1;
                    rightTop=!rightTop;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int m=Integer.parseInt(br.readLine());
        int n=Integer.parseInt(br.readLine());
        int[][] matrix=new int[m][n];
        for(int i=0;i<m;i++){
            String[] temp=br.readLine().split(" ");
            for(int j=0;j<n;j++){
                matrix[i][j]=Integer.parseInt(temp[j]);
            }
        }
        int[] ans=findDiagonalOrder(matrix);
        for(int a:ans)
            System.out.println(a);
    }
}
