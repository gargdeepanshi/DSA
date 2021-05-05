package pepcoding;

import java.util.Scanner;

public class kconcat {
    public static long k1(long arr[])
    {
        long max=Integer.MIN_VALUE;
        long sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
            if(sum>max)
                max=sum;
            if(sum<0)
                sum=0;
        }
        return max;
    }
    public static long k2(long arr[])
    {

        long arr1[]=new long[2*arr.length];
        for(int i=0;i<arr.length;i++)
        {
            arr1[i]=arr[i];

        }
        for(int i=0;i<arr.length;i++)
            arr1[i+arr.length]=arr[i];
        return k1(arr1);
    }
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        for(int j=0;j<t;j++)
        {
            int n=s.nextInt();
            int k=s.nextInt();
            long arr[]=new long[n];
            long sum=0;
            for(int i=0;i<n;i++)
            {
                arr[i]=s.nextLong();
                sum=sum+arr[i];
            }
            if(k==1) {
                long ans=k1(arr);
                System.out.println(ans);
            }
            else if(sum<0 && k>1)
            {
                long ans=k2(arr);
                System.out.println(ans);
            }
            else if(sum>0 && k>1)
            {
                long ans=k2(arr)+(k-2)*sum;
                System.out.println(ans);

            }

        }
    }
}
