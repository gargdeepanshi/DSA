package pepcoding;

import java.util.Scanner;

public class ThreePartitioning {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        int low=sc.nextInt();
        int high=sc.nextInt();
        int s=0,e=n-1;
        for(int i=0;i<=e;)
        {
            if(arr[i]<low)
            {
                int temp=arr[s];
                arr[s]=arr[i];
                arr[i]=temp;
                s++;
                i++;

            }
            else if(arr[i]>high){
         int temp=arr[e];
         arr[e]=arr[i];
         arr[i]=temp;
         e--;

        }
            else
                i++;
        }
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
    }
}
