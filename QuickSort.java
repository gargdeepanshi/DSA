package sorting;

import java.util.Scanner;

public class QuickSort {
    public static void quicksort(int arr[],int start,int end)
    {
        if(start>=end)
            return;

        int pivotpos=partition(arr,start,end);
        quicksort(arr,start,pivotpos-1);
        quicksort(arr,pivotpos+1,end);
    }
    public static int partition(int arr[],int start,int end)
    {
        int pivot=arr[start];
        int count=0;
        for(int i=start+1;i<=end;i++)
        {
            if(arr[i]<=pivot)
                count++;
        }
        int pivotp=start+count;
        int temp=arr[pivotp];
        arr[pivotp]=arr[start];
        arr[start]=temp;

        int i=start,j=end;
        while(i<pivotp && j>pivotp)
        {
            if(arr[i] <= pivot) {
                i++;
            }
            else if(arr[j] > pivot) {
                j--;
            }
            else {
                int temp2=arr[i];
                arr[i]=arr[j];
                arr[j]=temp2;
                i++;
                j--;

            }
        }
        return pivotp;
    }
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = s.nextInt();

        quicksort(arr,0,n-1);
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");

    }
}
