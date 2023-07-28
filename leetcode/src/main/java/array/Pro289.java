package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pro289 {
    public static void gameOfLife(int[][] board) {
        int m=board.length,n=board[0].length;
        int[][] mark=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]==1){
                    if(j-1>=0){
                        if(i-1>=0)
                            mark[i-1][j-1]+=1;
                        mark[i][j-1]+=1;
                        if(i+1<m)
                            mark[i+1][j-1]+=1;
                    }
                    if(i-1>=0)
                        mark[i-1][j]+=1;
                    if(i+1<m)
                        mark[i+1][j]+=1;
                    if(j+1<n){
                        if(i-1>=0)
                            mark[i-1][j+1]+=1;
                        mark[i][j+1]+=1;
                        if(i+1<m)
                            mark[i+1][j+1]+=1;
                    }
                }
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]==1){
                    if(mark[i][j]<2)
                        board[i][j]=0;
                    if(mark[i][j]>3)
                        board[i][j]=0;
                }else{
                    if(mark[i][j]==3)
                        board[i][j]=1;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int m=Integer.parseInt(br.readLine());
        int n=Integer.parseInt(br.readLine());
        int [][] board=new int[m][n];
        for(int i=0;i<m;i++){
            String[] temp=br.readLine().split(" ");
            for(int j=0;j<n;j++)
                board[i][j]=Integer.parseInt(temp[j]);
        }
        gameOfLife(board);
        for(int[] bb:board){
            for(int b:bb){
                System.out.print(b);
            }
            System.out.println();
        }
    }
}
