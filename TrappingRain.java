import java.util.Scanner;

public class TrappingRain {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=s.nextInt();
        //code
        int left=0,right=n-1;
        int leftmax=0,rightmax=0;
        int ans=0;
        while(left<right)
        {
            if(arr[left]<arr[right])
            {
                if(arr[left]>=leftmax)
                    leftmax=arr[left];
                else
                    ans=ans+(leftmax-arr[left]);
                left++;
            }
            else
            {
                if(arr[right]>=rightmax)
                    rightmax=arr[right];
                else
                    ans=ans+(rightmax-arr[right]);
                right--;
            }
        }
        System.out.println(ans);
    }
}
