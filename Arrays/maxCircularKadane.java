package pepcoding;

import java.util.Scanner;

public class maxCircularKadane {
  public static void main(String[] args) {
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int arr[]=new int[n];
      int sum=0;

      for(int i=0;i<n;i++)
      {
          arr[i]=s.nextInt();
          sum=sum+arr[i];
      }
      int max=arr[0],min=arr[0];
      int a=arr[0],b=arr[0];
      for(int i=1;i<n;i++)
      {
          a=Math.max(a+arr[i],arr[i]);
          max=Math.max(a,max);

          b=Math.min(b+arr[i],arr[i]);
          min=Math.min(b,min);
      }
      if(min==sum)
          System.out.println(max);
      else
          System.out.println(Math.max(max,sum-min));



    }
}
