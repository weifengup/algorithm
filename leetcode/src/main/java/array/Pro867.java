package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pro867 {
    public static int[][] transpose(int[][] matrix) {
        if(matrix.length==0||matrix[0].length==0)
            return matrix;
        int m=matrix.length,n=matrix[0].length;
        int[][] ans=new int[n][m];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                ans[j][i]=matrix[i][j];
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
        int[][] ans=transpose(matrix);
        for(int[] a:ans){
            for(int aa:a){
                System.out.print(aa+" ");
            }
            System.out.println();
        }
    }
}
