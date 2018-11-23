package Graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BreadthFirstPaths {
    boolean []book;
    int edgeTo[];
    private int s=0;
    public BreadthFirstPaths(Graph G,int s){
        this.book=new boolean[G.V()];
        edgeTo=new int[G.V()];
        this.s=s;
        bfs(G,this.s);
    }
    public void bfs(Graph g,int v){
        Queue<Integer> que=new LinkedList<>();
        que.offer(v);
        book[v]=true;
        while (!que.isEmpty()) {
            int tmp=que.poll();
            for (int i : g.adj(tmp)) {
                if (!book[i]) {
                    edgeTo[i]=tmp;
                    book[i]=true;
                    que.add(i);
                }
            }
        }
    }
    public boolean hasPathTo(int v){
        return book[v];
    }
    public Iterable<Integer> getPath(int v){
        if(hasPathTo(v)==false)
            return null;
        Stack<Integer> stack=new Stack<>();
        for(int x=v;x!=s;x=edgeTo[x]){
            stack.push(x);
        }
        stack.push(s);
        return stack;
    }
}
