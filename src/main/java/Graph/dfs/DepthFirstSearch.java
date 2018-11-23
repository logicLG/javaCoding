package Graph.dfs;


import Graph.Graph;

/*深度优先遍历，通过输入起始点，遍历与之相邻的所有点，可以获取某个点是否能能够便利到，以及起始点所在图的总点数*/
public class DepthFirstSearch {
    boolean book [];
    int count;
    public DepthFirstSearch(Graph G,int s){
        book=new boolean[G.V()];
        dfs(G,s);
    }
    private void dfs(Graph G,int v){
        book[v]=true;
        count++;
        for(int w:G.adj(v)){
            if(!book[w]){
                dfs(G,w);
            }
        }
    }
    public boolean book(int w) {

        return book[w];
    }
    public int getCount(){
        return count;
    }
}
