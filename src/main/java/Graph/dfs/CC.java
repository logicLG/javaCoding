package Graph.dfs;

import Graph.Graph;

/*查找连通分量比如连通分量的数量，某个点所在的连通分量的数字，两个点是否属于同一个连通分量*/
public class CC {
    int count=0;
    int id[];
    boolean book[];
    public CC(Graph G){
        book=new boolean[G.V()];
        id=new int[G.V()];
        for(int i=0;i<G.V();i++){
            if(!book[i]){
                dfs(G,i);
                count++;
            }
        }
    }
    public void dfs(Graph g,int v){
        book[v]=true;
        id[v]=count;
        for(int i:g.adj(v)){
            if(!book[i]){
                dfs(g,i);
            }
        }
    }
    public boolean connected(int v,int s){
        return id[v]==id[s];
    }

    public int getCount(){
        return count;
    }
    public int getId(int v){
        return id[v];
    }
}
