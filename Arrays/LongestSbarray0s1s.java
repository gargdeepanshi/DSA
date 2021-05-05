package pepcoding;

import java.util.HashMap;
import java.util.Scanner;

public class LongestSbarray0s1s {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        int ans=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);
        //index and sum
        int sum=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==0)
                sum=sum-1;
            else if(arr[i]==1)
                sum=sum+1;

            if(map.containsKey(sum))
            {
                int index=map.get(sum);
                int len=i-index;
                if(len>ans)
                    ans=len;
            }
        }
        System.out.println(ans);

    }
}
