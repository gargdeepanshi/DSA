package dp;

import java.util.Scanner;

public class paintfence {
    public static void main(String args[]) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k=s.nextInt();
        int same=k*1;
        int diff=k*(k-1);
        int total=same+diff;
        for(int i=3;i<=n;i++)
        {
            same=diff*1;
            diff=total*(k-1);
            total=same+diff;
        }
        System.out.println(total);
    }
}
