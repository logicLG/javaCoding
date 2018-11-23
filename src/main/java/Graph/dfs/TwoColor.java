package Graph.dfs;

import Graph.Graph;

/*是否是二分图即每条边的两个端点的颜色都不相同*/
public class TwoColor {
    boolean isTwoColor=true;
    boolean book[];
    boolean color[];
    public TwoColor( Graph g){
        book=new boolean[g.V()];
        color=new boolean[g.V()];
        for(int i=0;i<g.V();i++){
            if(!book[i])
                dfs(g,i);
        }
    }
    public void dfs(Graph g,int v){
        book[v]=true;
        for(int i: g.adj(v)){
            if(!book[i]){
                color[i]=!color[v];
                dfs(g,i);
            }
            else
                if(color[i]==color[v]){
                    isTwoColor=false;
                }
        }
    }
    public boolean isBipartite(){
        return isTwoColor;
    }
}
