package pepcoding;

import java.awt.*;
import java.util.*;

public class countTripSmallSum {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=s.nextInt();
        int sum=s.nextInt();
        Arrays.sort(arr);
        int ans=0;
        for(int i=0;i<n-2;i++)
        {
            int j=i+1;
            int k=n-1;
            while(j<k)
            {
                if(arr[i]+arr[j]+arr[k]>=sum)
                    k--;
                else
                {
                    ans=ans+(k-j);
                    j++;
                }
            }
        }
        System.out.println(ans);
    }
}
