package test;

import array.LIS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Administrator on 2018/4/2 0002.
 */
public class list
{
    public static void main(String[] args) {

        int [] board=new int[]{1,2,3};
        int [] boardtmp=Arrays.copyOf(board,3);
        int [] boardclone=board.clone();
        int [] boardtmp2=board;
        change(boardtmp);
        change(boardclone);
        for(int a:boardtmp){
            System.out.println(a);
        }
        for(int b:board){
            System.out.println(b);
        }
    }
    public static void change(int p[]){
        p[0]=4;



}}
