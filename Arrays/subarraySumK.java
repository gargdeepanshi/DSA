package pepcoding;

import java.security.PublicKey;
import java.util.Scanner;

public class subarraySumK {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int k=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=s.nextInt();
        int ans=subarray(arr,n,k);
    }

    private static int subarray(int[] arr, int n, int k) {
        int curr=arr[0],start=0;
        for(int i=1;i<=n;i++)
        {
            // If curr_sum exceeds the sum,
            // then remove the starting elements
            while(curr>k && start<i-1)
            {
                curr=curr-arr[start];
                start++;
            }

            // If curr_sum becomes equal to sum,
            // then return true
            if(curr==k)
            {
                int p=i-1;
                System.out.println(
                        "Sum found between indexes " + start
                                + " and " + p);
                return 1;
            }
            // Add this element to curr_sum
            if (i < n)
                curr= curr + arr[i];
        }
        System.out.println("No subarray found");
        return 0;

        }

    }
