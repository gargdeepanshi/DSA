package pepcoding;

import java.util.Scanner;

public class searchInRotatdArray {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int k=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=s.nextInt();
        int ans=search(arr,0,n-1,k);
        if (ans != -1)
            System.out.println("Index: " + ans);
        else
            System.out.println("Key not found");
    }

    private static int search(int[] arr, int l, int h, int k) {
        if(l>h)
            return -1;
        int mid=(l+h)/2;
        if(arr[mid]==k)
            return mid;
        /* If arr[l...mid] first subarray is sorted */
        if(arr[l]<=arr[mid])
        {
            if(k>=arr[l] && k<=arr[mid])
                return search(arr,l,mid-1,k);
            else
                return search(arr,mid+1,h,k);
        }
        else
        {
            if(k>=arr[mid] && k<=arr[h])
                return search(arr,mid+1,h,k);
        }
        return search(arr,l,mid-1,k);
    }
}
