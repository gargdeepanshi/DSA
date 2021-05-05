package pepcoding;

import java.util.Scanner;

public class MaxLenBitcoinArray {
    public static void main(String[] args)
    {
        Scanner s =new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=s.nextInt();

        int inc[]=new int[n];
        int dec[]=new int[n];
        inc[0]=1;
        dec[n-1]=1;

        for(int i=1;i<n;i++)
            inc[i]=(arr[i]>=arr[i-1]) ? inc[i-1]+1 : 1;

        for(int i=n-2;i>=0;i--)
            dec[i]=(arr[i]>=arr[i+1]) ? dec[i+1]+1 : 1;

        int max=inc[0]+dec[0]-1;
        for(int i=1;i<n;i++)
        {
            if(inc[i]+dec[i]-1>max)
                max=inc[i]+dec[i]-1;
        }
        System.out.println(max);
    }
}
