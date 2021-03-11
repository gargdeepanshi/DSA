package dp;

import java.util.ArrayDeque;
import java.util.Scanner;

public class printMinJumps {

        private static class Pair{
            String p;
            int s;
            int i;
            int j;

            public Pair(int i,int s,int j,String p)
            {
                this.p=p;
                this.i=i;
                this.j=j;
                this.s=0;
            }
        }

        public static void main(String args[]) {
            Scanner s=new Scanner(System.in);
            int n=s.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i]=s.nextInt();
            }
          Integer dp[]=new Integer[n];
            dp[n-1]=0;
            for(int i=n-2;i>=0;i--)
            {
                int step=arr[i];
                int min=Integer.MAX_VALUE;
                for(int j=1;j<=step && i+j<n;j++)
                {
                    if(dp[i+j] != null && dp[i+j]<min)
                    {
                        min=dp[i+j];
                    }
                }
                if(min != Integer.MAX_VALUE)
                {
                    dp[i]=1+min;
                }
            }
            System.out.println(dp[0]);
//            ArrayDeque<Pair> q=new ArrayDeque<>();
//            q.add(new Pair(0,arr[0],dp[0],0+""));
//            while(!q.isEmpty())
//            {
//
////            }


        }
}
