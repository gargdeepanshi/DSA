package dp;

import java.util.ArrayDeque;
import java.util.Scanner;

public class printMinPath {
    private static class Pair{
        String p;
        int i;
        int j;

        public Pair(String p,int i,int j)
        {
            this.p=p;
            this.i=i;
            this.j=j;
        }
    }

    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int m=s.nextInt();
        int arr[][]=new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                arr[i][j]=s.nextInt();
            }
        }
        int dp[][]=new int[n][m];

        for(int i=n-1;i>=0;i--)
        {
            for(int j=m-1;j>=0;j--)
            {
                if(i==n-1 && j==m-1)
                {
                    dp[i][j]=arr[i][j];
                }
                else if(i==n-1)
                {
                    dp[i][j]=arr[i][j]+dp[i][j+1];
                }
                else if(j==m-1)
                {
                    dp[i][j]=arr[i][j]+dp[i+1][j];
                }
                else{
                    dp[i][j]=arr[i][j]+Math.min(dp[i][j+1],dp[i+1][j]);
                }
            }

        }
        System.out.print(dp[0][0]);
        ArrayDeque<Pair> q=new ArrayDeque<>();
        q.add(new Pair("",0,0));
        while(q.size()>0)
        {
            Pair r=q.poll();
            if(r.i==n-1 && r.j==m-1)
            {
System.out.println(r.p);
            }
            else if(r.i==n-1)
            {
                q.add(new Pair(r.p+"H", r.i , r.j+1));
            }
            else if(r.j==m-1)
            {
                q.add(new Pair(r.p+"V", r.i+1 , r.j));
            }
            else
            {
                if(dp[r.i][r.j+1]<dp[r.i+1][r.j])
                {
                    q.add(new Pair(r.p+"H", r.i , r.j+1));
                }
                else if(dp[r.i][r.j+1]>dp[r.i+1][r.j])
                {
                    q.add(new Pair(r.p+"V", r.i+1 , r.j));

                }
                else
                {
                    q.add(new Pair(r.p+"H", r.i , r.j+1));
                    q.add(new Pair(r.p+"V", r.i+1 , r.j));
                }
            }
        }

    }
}
