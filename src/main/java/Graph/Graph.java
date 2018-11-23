package Graph;


import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Graph {

    private  int V;
    private int E;
    private List<Integer>[] adj;
    public Graph(int V) {
        this.V = V;
        this.E = 0;
        adj = (List<Integer>[]) new List[V];
        for (int v = 0; v < V; v++)
            adj[v] = new ArrayList<>();
    }
    public Graph(int[] in) throws IOException {
        this(in[0]); // 读取V并将图初始化
        int E = in[1];//E的条数
        //读取E
        for (int i = 2; i < in.length-1; i=i+2) {
            // 添加一条边
            int v = in[i];// 读取一个顶点
            int w = in[i+1];// 读取另一个顶点
            addEdge(v, w);// 添加一条连接它们的边
        }
    }
    // 顶点数目 // 边的数目 // 邻接表

    // 创建邻接表 // 将所有链表初始化为空
    public int V() { return V; }
    public int E() { return E; }
    public void addEdge(int v, int w) {
        adj[v].add(w);// 将w添加到v的链表中
        adj[w].add(v);// 将v添加到W的链表中
        E++;
    }
    public Iterable<Integer> adj(int v) {
        return adj[v];
    }

}
