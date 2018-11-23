package xiaozhao.xz2017.jingri;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class forth {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String s1=scn.nextLine();
        int M= Integer.parseInt(s1.split(" ")[0]);
        int N= Integer.parseInt(s1.split(" ")[1]);
        int K= Integer.parseInt(s1.split(" ")[2]);
        String s2=scn.nextLine();
        List<String> word=new ArrayList<>();
        for(int i=0;i<K;i++){
            word.add(s2.split(" ")[i]);
        }
        //var s3=[['p','a','b','h','m'],['f','h','e','c','p'],['o','i','l','l','h'],['b','g','h','o','n'],['h','x','c','m','l']]
        List<List<String>> dir=new ArrayList<>();
        List<String> line=new ArrayList<>();
        for(int i=0;i<N;i++){
            line.clear();
            String ls=scn.nextLine();
            for(int j=0;j<M;j++){
                String lss[]=ls.split(" ");
                line.add(lss[j]);
            }
            dir.add(line);
        }

        for(int i=0;i<K;i++){
            String s=word.get(i);
            int j=0;
            int f=0;
            while(j!=s.length()-1){
                f=find(s.charAt(j),s.charAt(j+1),N,M,dir);
                if(f==0){
                    break;
                }else{
                    j++;
                }
            }
            if(j==s.length()-1&&f==1){
                System.out.print(s);
            }
        }

    }
    public static int find(char s1,char s2,int N,int M,List<List<String>> dir){
        int f=0;
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                if(dir.get(i).get(j).equals(s1)){
                    if(i-1>=0){
                        if(dir.get(i-1).get(j).equals(String.valueOf(s2))){
                            f=1;
                            break;
                        }
                    }
                    if(i+1<N){
                        if(dir.get(i+1).get(j).equals(String.valueOf(s2))){
                            f=1;
                            break;
                        }
                    }
                    if(j-1>=0){
                        if(dir.get(i).get(j-1).equals(String.valueOf(s2))){
                            f=1;
                            break;
                        }
                    }
                    if(j+1<M){
                        if(dir.get(i).get(j+1).equals(String.valueOf(s2))){
                            f=1;
                            break;
                        }
                    }
                }
            }
            if(f==1){
                break;
            }
        }
        return f;
    }
}
