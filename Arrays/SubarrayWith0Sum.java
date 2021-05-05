package pepcoding;
import java.util.*;
class Pair
{
    int a;
    int b;
    Pair(int a,int b)
    {
        this.a=a;
        this.b=b;
    }
}
public class SubarrayWith0Sum {
    static ArrayList<Pair> findSubArrays(int arr[],int n)
    {
        HashMap<Integer,ArrayList<Integer>> map=new HashMap<>();
        ArrayList<Pair> a=new ArrayList<>();
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum=sum+arr[i];
            if(sum==0)
            {
                a.add(new Pair(0,i));
            }
            ArrayList<Integer> al=new ArrayList<>();
            if(map.containsKey(sum))
            {
                al=map.get(sum);
                for(int i=0;i<al.size();i++)
                    a.add(new Pair(al.get(i)+1,i));
            }
            al.add(i);
            map.put(sum,al);
        }
        return a;
    }
    static void print(ArrayList<Pair> out)
    {
        for (int i = 0; i < out.size(); i++)
        {
            Pair p = out.get(i);
            System.out.println("Subarray found from Index "
                    + p.a + " to " + p.b);
        }
    }
    public static  void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=s.nextInt();

        ArrayList<Pair> out = findSubArrays(arr, n);
        if (out.size() == 0)
            System.out.println("No subarray exists");
        else
            print(out);
    }
}
