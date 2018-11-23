package xiaozhao.xz2017;

import util.BFS;

import java.util.*;
import java.util.stream.Collectors;

//给定一个 n 行 m 列的地牢，其中 '.' 表示可以通行的位置，'X' 表示不可通
//        行的障碍，牛牛从 (x0 , y0 ) 位置出发，遍历这个地牢，和一般的游
//        戏所不同的是，他每一步只能按照一些指定的步长遍历地牢，要求每一步
//        都不可以超过地牢的边界，也不能到达障碍上。地牢的出口可能在任意某
//        个可以通行的位置上。牛牛想知道最坏情况下，他需要多少步才可以离开这个地牢。
//        输入描述:
//
//        每个输入包含 1 个测试用例。每个测试用例的第一行包含两个整数 n 和 m
//        （1 <= n, m <= 50），表示地牢的长和宽。接下来的 n 行，每行 m 个字
//        符，描述地牢，地牢将至少包含两个 '.'。接下来的一行，包含两个整数 x0, y0，
//        表示牛牛的出发位置（0 <= x0 < n, 0 <= y0 < m，左上角的坐标为 （0, 0），
//        出发位置一定是 '.'）。之后的一行包含一个整数 k（0 < k <= 50）表示牛牛合
//        法的步长数，接下来的 k 行，每行两个整数 dx, dy 表示每次可选择移动的行和列
//        步长（-50 <= dx, dy <= 50）
//        输出描述:
//        输出一行一个数字表示最坏情况下需要多少次移动可以离开地牢，如果永远无法离开
//        ，输出 -1。以下测试用例中，牛牛可以上下左右移动，在所有可通行的位置.上，地
//        牢出口如果被设置在右下角，牛牛想离开需要移动的次数最多，为3次。
//        示例1
//        输入
//        复制
//        3 3
//        ...
//        ...
//        ...
//        0 1
//        4
//        1 0
//        0 1
//        -1 0
//        0 -1
//        输出
//        复制
//        3
public class second {
    static class Node{
        int x;
        int y;
        int round;
        public Node(int x, int y, int round) {
            this.x = x;
            this.y = y;
            this.round = round;
        }

    }

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int m=scn.nextInt();
        char [][] input=new char [n][m];
        for(int i=0;i<n;i++){
            String str=scn.next();
            input[i]=str.toCharArray();
        }
        int x0=scn.nextInt();
        int y0=scn.nextInt();
        Node start=new Node(x0,y0,0);
        int k=scn.nextInt();
        int direct[][]=new int[k][2];
        for(int i=0;i<k;i++){
            for(int j=0;j<2;j++){
                direct[i][j]=scn.nextInt();
            }
        }
        List<Node> result=new ArrayList();
        int [][]arc=new int[n][m]; //标记已经走过的路
        Queue<Node> queue=new LinkedList();;//待搜索队列
        queue.offer(start);
        arc[x0][y0]=1;
        /*****重要组成-持续搜索的标志。待搜索队列里有东西******/
        while(!queue.isEmpty()){
            Node temp=queue.poll();
            for(int i=0;i<k;i++){//尝试搜索四个方向的点，如果满足就加入待搜索队列中
                int new_x=temp.x+direct[i][0];
                int new_y=temp.y+direct[i][1];
                if(new_x<0||new_y<0||new_x>=n||new_y>=m||input[new_x][new_y]=='X')
                    continue;//该方向上出界，考虑下一方向
                if(arc[new_x][new_y]==1)continue;
                arc[new_x][new_y]=1;
                Node next=new Node(new_x, new_y,temp.round+1);
                result.add(next);
                queue.offer(next);
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(input[i][j]=='.'&&arc[i][j]==0){
                    System.out.println("-1");
                    return;
                }
            }
        }


        int max=result.stream().max((x,y)->(x.round-y.round)).get().round;
        System.out.println(max);
    }
}
