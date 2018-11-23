package backtracking;

import array.LIS;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Administrator on 2018/4/2 0002.
 */
public class exist {
    List<List<Integer>> result=new ArrayList<List<Integer>>();



    public boolean exist(char[][] board, String word) {
        int size=word.length();
        char[] chars=new char[size];
        for(int i=0;i<size;i++){
            chars[i]=word.charAt(i);
        }
        int m=board.length;
        int n=board[0].length;
        List<int[]> list=new ArrayList<>();
        //boolean[] hasChar=new boolean[size];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]==chars[0]) {
                    int a[]=new int[]{i,j};
                    list.add(a);
                }
            }
        }
        if(list.size()==0)return false;

        for(int [] array:list){
            List<Integer> listback=new ArrayList<>();
            char boardtmp[][]=new char[m][n];
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    boardtmp[i][j]=board[i][j];
                }
            }
            boardtmp[array[0]][array[1]]='0';
            backtracking(array,boardtmp,word,word.length()-1,1,listback);
            if(result.size()!=0)
                return true;

        }
        return false;
    }
    public void backtracking(int[]a,char[][] board,String word,int length,int start,List<Integer> list){
        if(length==0) {
            result.add(new ArrayList<>(list));
            return;
        }
        int m=board.length;
        int n=board[0].length;
        int x=a[0];
        int y=a[1];

        if(x+1<m) {
            int [] atmp=new int[]{x+1,y};
            list.add(1);
            char tmp=board[x+1][y];
            if(board[x+1][y]!='0'&&board[x+1][y]==word.charAt(start)){
                board[x+1][y]='0';
                backtracking(atmp,board,word,length-1,start+1,list);
                list.remove(list.size()-1);

            }
            else {
                list.remove(list.size()-1);
            }
            board[x+1][y]=tmp;
        }
        if(x-1>=0) {
            int [] atmp=new int[]{x - 1, y};
            list.add(1);
            char tmp=board[x-1][y];
            if(board[x-1][y]!='0'&&board[x-1][y]==word.charAt(start)){
                board[x-1][y]='0';
                backtracking(atmp,board,word,length-1,start+1,list);
                list.remove(list.size()-1);
            }
            else {
                list.remove(list.size()-1);

            }
            board[x-1][y]=tmp;
        }
        if(y+1<n){
            int [] atmp=new int[]{x , y+1};
            list.add(1);
            char tmp=board[x][y+1];
            if(board[x][y+1]!='0'&&board[x][y+1]==word.charAt(start)){
                board[x][y+1]='0';
                backtracking(atmp,board,word,length-1,start+1,list);
                list.remove(list.size()-1);

            }
            else {
                list.remove(list.size()-1);

            }
            board[x][y+1]=tmp;
        }
        if(y-1>=0){
            int [] atmp=new int[]{x , y-1};
            list.add(1);
            char tmp=board[x][y-1];
            if(board[x][y-1]!='0'&&board[x][y-1]==word.charAt(start)){
                board[x][y-1]='0';
                backtracking(atmp,board,word,length-1,start+1,list);
                list.remove(list.size()-1);
            }
            else {
                list.remove(list.size()-1);

            }
            board[x][y-1]=tmp;
        }
    }
    public static void main(String[] args) {
        char [][] board=new char[][]{{'c','a','a'},{'a','a','a'},{'b','c','d'}};
        exist exist=new exist();
        System.out.println(exist.exist(board,"aab"));
    }
}
