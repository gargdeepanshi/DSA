package Graphs;
import java.util.*;
public class DFS {


    public static void printhelper(int edges[][],int sv,boolean visited[])
    {
        System.out.println(sv);
        visited[sv]=true;
        int n= edges.length;
        for(int i=0;i<n;i++)
        {
            if(edges[sv][i] ==1 && !visited[i])
            {
                printhelper(edges,i,visited);
            }
        }
    }
    public static void print(int edges[][])
    {
        boolean visited[]=new boolean[edges.length];
        for(int i=0;i< edges.length;i++) {
            if(!visited[i])
            printhelper(edges, i, visited);
        }
    }

    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        // total number of edges e
        int e = s.nextInt();
        int edges[][]=new int[n][n];
        for(int i=0;i<e;i++){
            int fv=s.nextInt();
            int sv=s.nextInt();
            edges[fv][sv]=1;
            edges[sv][fv]=1;
        }
        print(edges);

    }
}
