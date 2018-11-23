package xiaozhao.xz2017.jingri;

import java.util.Scanner;
import java.util.Stack;

public class SimplePath {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String path = in.nextLine();
        String simplePath = "";
        Stack<String> stack = new Stack<>();
        int len=path.length();
        for(int i=0;i<len;i++){
            String name="";
            while(i<len && path.charAt(i)=='/')
                i++;
            while(i<len && path.charAt(i)!='/')
                name += path.charAt(i++);
            if(!name.equals(".") && !name.equals("..")){
                stack.push(name);
            }
            if(!stack.isEmpty() && name.equals(".."))
                stack.pop();
        }
        if(stack.isEmpty())
            System.out.print("/");
        while(!stack.isEmpty()){
            simplePath = "/"+stack.peek()+simplePath;
            stack.pop();
        }
        System.out.println(simplePath);
    }
}
