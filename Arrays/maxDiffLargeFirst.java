package pepcoding;

import java.security.PublicKey;
import java.util.Scanner;

public class maxDiffLargeFirst {
    public static void main(String[] arg)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=s.nextInt();

        int maxdiff=arr[1]-arr[0];
        int min=arr[0];
        for(int i=1;i<n;i++)
        {
            if(arr[i]-min>maxdiff)
                maxdiff=arr[i]-min;
            if(arr[i]<min)
                min=arr[i];
        }
        System.out.println(maxdiff);
    }

}
