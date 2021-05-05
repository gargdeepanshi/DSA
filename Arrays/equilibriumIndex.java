package pepcoding;

import java.util.Scanner;

public class equilibriumIndex {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=s.nextInt();
        int ans=equi(arr,n);
        System.out.println(ans);
    }

    private static int equi(int[] arr, int n) {
        int sum=0;
        for(int i=0;i<n;i++)
            sum=sum+arr[i];
        int left=0;
        for(int i=0;i<n;i++)
        {
            sum=sum-arr[i];
            if(sum==left)
                return i;
            left=left+arr[i];
        }
        return -1;
    }
}
