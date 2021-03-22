package com.company;

import java.util.Scanner;

public class paintHouseMany {
    public static void main(String args[]) {
        //O(n^3)
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m=s.nextInt();
        int arr[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = s.nextInt();
            }
        }
        int dp[][] = new int[n][m];
        for(int i=0;i<m;i++)
            dp[0][i]=arr[0][i];
        for(int i=1;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                int min=Integer.MAX_VALUE;
                for(int k=0;k<m;k++)
                {
                    if(k!=j)
                    {
                        if(dp[i-1][k]<min)
                        {
                            min=dp[i-1][k];
                        }

                      }
                }
                dp[i][j]=arr[i][j]+min;
            }
        }
       int min=Integer.MAX_VALUE;
        for(int k=0;k<m;k++)
        {
            if(dp[n-1][k]<min)
                min=dp[n-1][k];
        }
        System.out.println(min);
    }
}
