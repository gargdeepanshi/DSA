package pepcoding;

import java.util.Scanner;

public class BuySell2Transactions {
    public static void main(String [] args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=s.nextInt();

        int max=0;
        int least=arr[0];
        int dp[]=new int[n];
        for(int i=1;i<n;i++)
        {
            if(arr[i]<least)
                least=arr[i];
            max=arr[i]-least;
            if(max>dp[i-1])
                dp[i]=max;
            else
                dp[i]=dp[i-1];
        }

        int maxx=0;
        int maxat=arr[n-1];
        int dpp[]=new int[n];
        for(int i=n-2;i>=0;i--)
        {
            if(arr[i]>maxat)
                maxat=arr[i];
            maxx=maxat-arr[i];

            if(maxx>dpp[i+1])
                dpp[i]=maxx;
            else
                dpp[i]=dpp[i+1];
        }

        int op=0;
        for(int i=0;i<n;i++)
        {
            if(dp[i]+dpp[i]>op)
                op=dp[i]+dpp[i];
        }
        System.out.println(op);

    }
}
