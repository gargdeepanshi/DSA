package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
    //catalan num
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int dp[]=new int[n+1];
        dp[0]=1;
        dp[1]=1;
        for(int i=2;i<=n;i++)
        {
            for(int j=0;j<i;j++)
            {
                dp[i]=dp[i]+dp[j]*dp[i-j-1];
            }
        }
        System.out.println(dp[n]);
           }
}
