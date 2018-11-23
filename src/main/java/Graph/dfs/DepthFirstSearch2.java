package Graph.dfs;


import Graph.Graph;

import java.util.Stack;

/*深度优先遍历，通过输入起始点，可以获取与之相邻的任一点的路径*/
public class DepthFirstSearch2 {
    boolean []book;
    int s;
    int[] edgeTo;//目标路径点的前一个位置点，用来往回获取路径
    public DepthFirstSearch2(Graph G,int s){
        book=new boolean[G.V()];
        edgeTo=new int[G.V()];
        this.s=s;
        dfs(G,s);
    }
    private void dfs(Graph g,int v){
        book[v]=true;
        for(int w:g.adj(v)){
            if(!book[w]){
                edgeTo[w]=v;
                dfs(g,w);
            }
        }
    }
    public boolean hasPathTo(int s){
        return book[s];
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
