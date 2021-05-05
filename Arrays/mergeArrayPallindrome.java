package pepcoding;

import java.util.Scanner;

public class mergeArrayPallindrome {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=s.nextInt();
        int i=0,j=n-1;
        int count=0;
        while(i<=j)
        {
            if(arr[i]==arr[j])
            {
                i++;
                j--;
            }
            else if(arr[i]>arr[j])
            {
                j--;
                arr[j]=arr[j]+arr[j+1];
                count++;
            }
            else
            {
                i++;
                arr[i]=arr[i]+arr[i-1];
                count++;
            }
        }
        System.out.println(count);
    }
}
