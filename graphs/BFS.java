package Graphs;
import java.util.*;
public class BFS {
    public static void bfs(int edges[][],int V ,int start,boolean visited[])
    {
        Queue<Integer> q=new LinkedList<>();
        q.add(start);
        visited[start]=true;
        while(!q.isEmpty())
        {
            int front=q.poll();
            System.out.print(front+" ");
            for(int i=0;i<V;i++)
            {
                if(edges[front][i] ==1 && visited[i] !=true)
                {
                    q.add(i);
                    visited[i]=true;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int V = s.nextInt();
        int E = s.nextInt();


        int[][] edges = new int[V][V];

        for (int i = 0; i < E; i++) {
            int a = s.nextInt();
            int b = s.nextInt();
            edges[a][b] = 1;
            edges[b][a] = 1;

        }
        boolean visited[]=new boolean[V];
        for(int i=0;i< edges.length;i++)
        {
            if(!visited[i])
                bfs(edges,V,i,visited);
        }

    }
}
