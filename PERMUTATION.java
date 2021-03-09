package Recursion;

import java.util.Scanner;

public class PERMUTATION {
    public static void per(String x,String ans)
    {
        int n=x.length();
        if(n==0)
        {
            System.out.println(ans);
            return;
        }
        boolean arr[]=new boolean[26];
        for(int i=0;i<n;i++)
        {
            char c= x.charAt(i);
            //rest of the string except i
            String as=x.substring(0,i)+x.substring(i+1);

            //for distinct
            if(arr[c-'a']==false)
            per(as,ans+c);
            arr[c-'a']=true;
        }
    }
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        String x=s.next();

        per(x,"");


    }
}
