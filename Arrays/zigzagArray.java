package pepcoding;

import java.util.Scanner;

public class zigzagArray {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=s.nextInt();

        boolean flag=true;
        int temp=0;
        for(int i=0;i<n-2;i++)
        {
            if(flag)
            {
                if(arr[i]>arr[i+1])
                {
                    temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;

                }
            }
            else
            {
                if(arr[i]<arr[i+1])
                {
                    temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
            flag=!flag;
        }
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
    }
}
