package pepcoding;

import java.util.*;

public class mergeTwoSorted {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=s.nextInt();
        int m=s.nextInt();
        int a[]=new int[m];
        for(int i=0;i<m;i++)
            a[i]=s.nextInt();

        int i=0,j=0,k=n-1;
        while(i<=k && j<m)
        {
            if(arr[i]<a[j])
                i++;
            else
            {
                int temp=arr[k];
                arr[k]=a[j];
                a[j]=temp;
                j++;
                k--;
            }
        }
        Arrays.sort(arr);
        Arrays.sort(a);
        for(i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        for( i=0;i<m;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
