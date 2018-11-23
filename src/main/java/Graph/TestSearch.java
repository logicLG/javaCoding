package Graph;

import Graph.dfs.CC;

import java.io.*;

public class TestSearch {
    public static void main(String[] args) throws IOException {
        int [] num=new int[]{13,13,0,5,4,3,0,1,9,12,6,4,5,4,0,2,11,12,9,10,0,6,7,8,9,11,5,3};
        Graph G=new Graph(num);
        CC c=new CC(G);
        System.out.println(c.getCount());

    }
}
