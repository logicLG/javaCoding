package Graph.dfs;

import Graph.Graph;

/*判断图中是否是无环图*/
public class Cycle {
    boolean [] book;
    boolean hasCycle;
    public Cycle(Graph g){
        book=new boolean[g.V()];
        for(int i=0;i<g.V();i++){
            if(!book[i])
                dfs(g,i,i);

        }
    }
    private void dfs(Graph g,int v,int o){
        book[v]=true;
        for(int i:g.adj(v)){
            if(!book[i])
                dfs(g,i,v);
            else
                if(o!=i)hasCycle=true;
        }
    }
    public boolean getCycle(){
        return hasCycle;
    }
}
