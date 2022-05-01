package DataStructures.Graph;

/*
Input:-
4
5
0 2 10
2 3 15
3 1 4
1 0 6
0 3 5

Output:-
3 ->1 ->4
0 ->3 ->5
0 ->2 ->10

*/

import java.util.Arrays;
import java.util.Scanner;

class Edge implements Comparable<Edge>{
    int src=0;
    int dst=0;
    int weight=0;
    public int compareTo(Edge e){
        return this.weight-e.weight;
    }
}

public class KruskalsAlgo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v= sc.nextInt();
        int e =sc.nextInt();
        Edge[] inp=new Edge[e];
        for(int i=0;i<e;i++){
            inp[i]=new Edge();
            inp[i].src= sc.nextInt();
            inp[i].dst= sc.nextInt();
            inp[i].weight= sc.nextInt();
        }
        Kruskals(v,e,inp);

    }
    public static void Kruskals(int v,int e,Edge[] inp){
        Arrays.sort(inp);
        Edge[] op=new Edge[v-1];
        int[] parent=new int[v];
        int k=0;
        for(int i=0;i<v;i++){
            parent[i]=i;
        }
        for(int i=0;i<e;i++){
            Edge currEdge=inp[i];
            int src_parent=find(currEdge.src,parent);
            int dst_parent=find(currEdge.dst,parent);
            if(src_parent!=dst_parent){
                op[k]=currEdge;
                k++;
                parent[src_parent]=dst_parent;
            }
        }
        for(int i =0; i <op.length; i++)
            System.out.println(op[i].src + " ->" + op[i].dst + " ->" + op[i].weight);

        }
    public static int find(int v,int[] parent){
        if(parent[v]==v){
            return v;
        }
        return find(parent[v],parent);
    }
}
