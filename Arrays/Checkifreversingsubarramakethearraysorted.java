package pepcoding;

import java.util.*;

public class Checkifreversingsubarramakethearraysorted {
    static boolean checkReverse(int arr[], int n)
    {
        int temp[]=new int[n];
        for(int i=0;i<n;i++)
            temp[i]=arr[i];

        Arrays.sort(temp);
        int front=0;
        for( front =0;front<n;front++)
        {
            if(temp[front]!=arr[front])
                break;
        }
        int back=0;
        for(back=n-1;back>=0;back--)
        {
           if( temp[back]!=arr[back])
               break;
        }
        if(front>=back)
            return true;
        do{
            front++;
            if(arr[front-1]<arr[front])
                return false;
        }while(front !=back);
        return true;
    }
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=s.nextInt();

        if (checkReverse(arr, n)) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }

}
