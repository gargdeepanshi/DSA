package pepcoding;

import java.util.Scanner;

public class move0toEnd {
    public static void main(String [] args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i =0;i<n;i++)
            arr[i]=s.nextInt();
int j=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=0)
            {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
    }
}
