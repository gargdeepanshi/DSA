package dp;

import java.util.*;
import java.util.Scanner;

public class countDistinctSubse {
    public static void main(String args[]) {
        //jo pehli baar aa rha h usse double krdenge previous se and dusri baar wale mein se pehle k pehle ka sub krdenge
        Scanner s=new Scanner(System.in);
        String x=s.next();
        int n=x.length();
        //hum dp ka array ek aage se shuru krenge to store empty string
        int dp[]=new int[n+1];
        dp[0]=1;
        HashMap<Character,Integer> m=new HashMap<>();
        for(int i=1;i<=n;i++)
        {
            //next one is double of first one
            dp[i]=2*dp[i-1];
            //dp ka 1st char = string ka 2nd char as first is empty string
            char c=x.charAt(i-1);

            if(m.containsKey(c))
            {
                int j=m.get(c);
                //if already occured usse pehle wala minus
                dp[i]=dp[i]-dp[j-1];
            }
            m.put(c,i);
           // System.out.println(dp[i]);
        }
        System.out.println(dp[n]);
        //for non empty dp[n]-1
    }

}
