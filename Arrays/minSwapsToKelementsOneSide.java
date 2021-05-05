package pepcoding;

import java.util.Scanner;

public class minSwapsToKelementsOneSide {
    public static void main(String [] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k=s.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = s.nextInt();

        int count=0;
        for(int i=0;i<n;i++) {
            if (arr[i] <= k)
                count++;
        }

        int bad=0;
        for(int i=0;i<count;i++)
        {
            if(arr[i]>k)
                bad++;
        }
        int ans=bad;
        for(int i=0,j=count;j<n;i++,j++)
        {
            if(arr[i]>k)
                bad--;
            if(arr[j]>k)
                bad++;

            ans=Math.min(ans,bad);
        }
        System.out.println(ans
        );

    }
}
