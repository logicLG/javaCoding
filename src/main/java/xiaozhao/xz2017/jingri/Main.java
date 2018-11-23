package xiaozhao.xz2017.jingri;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        T t = new T();
        Queue<String> queue = new LinkedList<String>();
        int n=scanner.nextInt();
        for(int i=0;i<n;i++){
            String word = scanner.next();
            queue.offer(word);
            t.insert(word);
        }
        while (!queue.isEmpty()) {
            String word = queue.poll();
            System.out.println(t.search(word));
        }
    }



}
class Node {

    private Node[] children;
    private int count;

    public Node(Node[] children, int count) {
        this.children = children;
        this.count = count;
    }

    public Node getChildrenItem(int i) {
        return children[i];
    }

    public void setChildrenItem(int i, Node node) {
        children[i] = node;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

}
 class T {

    private Node root;

    public T() {
        root = new Node(new Node[26], 0);
    }
    public void insert(String word) {
        Node current = root;
        for (int i = 0; i < word.length(); ++i) {
            if (null != current.getChildrenItem(word.charAt(i) - 'a')) {
                current = current.getChildrenItem(word.charAt(i) - 'a');
                current.setCount(current.getCount() + 1);
            } else {
                Node newNode = new Node(new Node[26], 1);
                current.setChildrenItem(word.charAt(i) - 'a', newNode);
                current = newNode;
            }
        }
    }

    public String search(String word) {
        Node node = root;
        StringBuilder prefix = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            if (1 == node.getCount()) {
                break;
            }
            prefix.append(word.charAt(i));
            node = node.getChildrenItem(word.charAt(i) - 'a');
        }
        if (1 == node.getCount()) {
            return prefix.toString();
        } else {
            return word;
        }
    }

}





