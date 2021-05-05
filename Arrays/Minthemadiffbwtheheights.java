package pepcoding;

import java.util.*;

public class Minthemadiffbwtheheights {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        int k=s.nextInt();
        for(int i=0;i<n;i++)
            arr[i]=s.nextInt();

        Arrays.sort(arr);
        int ans=arr[n-1]-arr[0];
        int small=arr[0]+k;
        int big=arr[n-1]-k;
        int temp=0;
        if(small>big)
        {
            temp=small;
            small=big;
            big=temp;
        }
        for(int i=1;i<n-1;i++)
        {
            int sub=arr[i]-k;
            int add=arr[i]+k;

            if(sub>=small || add<=big)
                continue;

            if(big-sub<=add-small)
                small=sub;
            else
                big=add;
        }
System.out.println(Math.min(ans, big - small));
    }
}
