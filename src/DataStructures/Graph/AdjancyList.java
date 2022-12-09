package DataStructures.Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class AdjancyList {
    public static void addEdge(ArrayList<ArrayList<Integer>> adj,int u,int v){  // undirected graph
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
    public static void printGraph(ArrayList<ArrayList<Integer>> adj){
        for(int i=0;i<adj.size();i++){
            System.out.println("Adjacency List of vertex "+i);
            for(int j=0;j<adj.get(i).size();j++){
                System.out.print(" -> "+adj.get(i).get(j));
            }
            System.out.println();
        }
    }
    public static void BFS(ArrayList<ArrayList<Integer>> adj,int s, int v){    // BFS when source vertex is given
        boolean[] visited=new boolean[v];
        visited[s]=true;
        Queue<Integer> q = new LinkedList<>();
        q.offer(s);
        while(q.isEmpty()==false){
            int u= q.poll();
            System.out.println(u);
            for(int j=0;j<adj.get(u).size();j++){
                if(visited[adj.get(u).get(j)]==false){
                    visited[adj.get(u).get(j)]=true;
                    q.offer(adj.get(u).get(j));
                }
            }
        }
    }
    public static void DFSrec(ArrayList<ArrayList<Integer>> adj,int s,boolean[] visited){
        visited[s]=true;
        System.out.println(s);
        for(int i=0;i<adj.get(s).size();i++){
            if(visited[adj.get(s).get(i)]==false){
                DFSrec(adj,adj.get(s).get(i),visited);
            }
        }
    }
    public static void DFS(ArrayList<ArrayList<Integer>> adj,int s,int v){
        boolean[] visited =new boolean[v];
        DFSrec(adj,s,visited);
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
        int vertices = 5;             // Capacity of main arrayList
        for(int i=0;i<vertices;i++){
            adj.add(new ArrayList<Integer>());    // Add  5 Lists one at each index of the main List

        }


        addEdge(adj,0,1);  // 1->2  && 2->1 in one addEdge operation
        addEdge(adj,0,2);
        addEdge(adj,1,3);   //   graph for  BFS TRAVERSAL
        addEdge(adj,2,3);
        addEdge(adj,2,4);
        addEdge(adj,3,4);


       /* addEdge(adj,0,1);
        addEdge(adj,0,2);
        addEdge(adj,1,3);
        addEdge(adj,1,4);     // graph for DFS traversal
        addEdge(adj,2,3);
        addEdge(adj,3,4); */


        printGraph(adj);
        System.out.println();
        System.out.println("BFS is + ");
        BFS(adj,0,5);

        System.out.println();
        System.out.println("DFS is ");
        boolean[] checked = new boolean[5];
        DFSrec(adj,0,checked);
        DFS(adj,0,5);




    }



}
