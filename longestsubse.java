package dp;

import java.util.Scanner;

public class longestsubse {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        int dp[]=new int[n];
        int x=0;
        for(int i=0;i<dp.length;i++)
        {
            int max=0;
            for(int j=0;j<i;j++)
            {
                if(arr[j]<arr[i])
                {
                    if(dp[j]>max)
                    {
                        max=dp[j];
                    }
                }
            }
            dp[i]=max+1;
            if(dp[i]>x)
            {
                x=dp[i];

            }
        }
        System.out.println(x);
    }
}
