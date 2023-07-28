package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Pro900 {
    class RLEIterator {
        private int[] encoding;
        private int index;
        public RLEIterator(int[] encoding) {
            this.encoding=new int[encoding.length];
            this.index=0;
            for(int i=0;i<encoding.length;i++)
                this.encoding[i]=encoding[i];
        }

        public int next(int n) {
            int ans=-1;
            for(;this.index<encoding.length;this.index+=2){
                if(this.encoding[this.index]-n>=0){
                    this.encoding[this.index]-=n;
                    return this.encoding[this.index+1];
                }else{
                    n=n-this.encoding[this.index];
                }
            }
            return ans;
        }
    }
    public static void main(String[] args) throws IOException {
        RLEIterator rleIterator = new Pro900().new RLEIterator(new int[]{3,8,0,9,2,5});
        System.out.println(rleIterator.next(2));
        System.out.println(rleIterator.next(1));
        System.out.println(rleIterator.next(1));
        System.out.println(rleIterator.next(2));
    }
}
