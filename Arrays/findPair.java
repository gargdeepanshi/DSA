package pepcoding;

import java.util.Scanner;

public class findPair {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int k=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=s.nextInt();
        boolean b=findP(arr,k);
    }

    private static boolean findP(int[] arr, int n) {
        int i=0,j=1;
        while(i<arr.length && j<arr.length)
        {
            if(i!=j && arr[j]-arr[i]==n)
            {
                System.out.print("Pair Found: "+
                        "( "+arr[i]+", "+ arr[j]+" )");
                return true;
            }
            else if(arr[j]-arr[i]<n)
                j++;
            else
                i++;
        }
        System.out.print("No such pair");
        return false;
    }
}
