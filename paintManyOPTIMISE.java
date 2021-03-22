package com.company;

import java.util.Scanner;

public class paintManyOPTIMISE {
    public static void main(String args[]) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        int arr[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = s.nextInt();
            }
        }
        int dp[][] = new int[n][m];
        int least=Integer.MAX_VALUE;
        int sleast=Integer.MAX_VALUE;
        for (int i = 0; i < m; i++) {
            dp[0][i] = arr[0][i];
            if(arr[0][i]<=least)
            {
                sleast=least;
                least=arr[0][i];
            }
            else if(arr[0][i]<=sleast)
                sleast=arr[0][i];
        }
        for(int i=1;i<n;i++)
        {
            int nl=Integer.MAX_VALUE;
            int ns=Integer.MAX_VALUE;
            for(int j=0;j<m;j++)
            {
                if(least==dp[i-1][j])
                    dp[i][j]=sleast+arr[i][j];
                else
                    dp[i][j]=least+arr[i][j];

                if(dp[i][j]<=nl)
                {
                    ns=nl;
                    nl=dp[i][j];
                }
                else if(dp[i][j]<=ns)
                {
                    ns=dp[i][j];
                }
            }
            least=nl;
            sleast=ns;
        }
        System.out.println(least);
    }
}
