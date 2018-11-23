package xiaozhao.xz2017.yy;

import java.util.Map;
import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        Node root=new Node(a);
        Node rootReverse=new Node(a);
        int count=1;
        while (sc.hasNextInt()){
            int temp=sc.nextInt();
            root.next=new Node(temp);
            rootReverse.next=new Node(temp);
            count++;
            if(count==5){
                break;
            }
        }
        rootReverse=reverse(rootReverse);
        while (count!=0){
            count--;
            count--;
            System.out.println("node = "+root.value);
            root=root.next;
            System.out.println("node = "+rootReverse.value);
            rootReverse=rootReverse.next;
        }


    }
    public static Node reverse(Node node) {
        Node prev = null;
        Node now = node;
        while (now != null) {
            Node next = now.next;
            now.next = prev;
            prev = now;
            now = next;
        }
        return prev;
    }
}
class Node{
    int value;
    Node next;
    public Node(int value){
        this.value=value;
    }
}
