package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pro1572 {
    public static int diagonalSum(int[][] mat) {
        int ans=0;
        int m=mat.length,n=mat[0].length;
        for(int i=0;i<m;i++){
            ans+=mat[i][i];
        }
        for(int i=0;i<m;i++){
            if(i!=n-1-i){
                ans+=mat[i][n-1-i];
            }
        }
        return ans;
    }
    public static void main(String[] args)throws IOException {
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
        System.out.println(diagonalSum(matrix));
    }
}
