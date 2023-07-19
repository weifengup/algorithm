package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pro566 {
    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        int m=mat.length,n=mat[0].length;
        if(m*n!=r*c)
            return mat;
        int[][] ans=new int[r][c];
        for(int index=0;index<m*n;index++){
            ans[index/c][index%c]=mat[index/n][index%n];
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
        int r=Integer.parseInt(br.readLine());
        int c=Integer.parseInt(br.readLine());
        int[][] ans=matrixReshape(matrix,r,c);
        for(int[] a:ans){
            for(int aa:a){
                System.out.print(aa+" ");
            }
            System.out.println();
        }

    }
}
