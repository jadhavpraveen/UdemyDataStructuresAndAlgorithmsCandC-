package section15;

import java.util.Scanner;

public class TreeOperations {
    public static Node root = null;
    public static void main(String[] args) {
        create();
        preOrder(root);
        System.out.println();
        inOrder(root);
        System.out.println();
        postOrder(root );
    }
    public static void preOrder(Node p) {
        if(p != null)   {
            System.out.printf("%d ", p.data);
            preOrder(p.lChild);
            preOrder(p.rChild);
        }
    }
    public static void inOrder(Node p) {
        if(p != null)   {
            inOrder(p.lChild);
            System.out.printf("%d ", p.data);
            inOrder(p.rChild);
        }
    }
    public static void postOrder(Node p) {
        if(p != null)   {
            postOrder(p.lChild);
            postOrder(p.rChild);
            System.out.printf("%d ", p.data);
        }
    }

    public static void create() {
        Node p,t = null;
        Queue q = new Queue();
        q.create();
        root = new Node();
        System.out.println("Enter the value of root node");
        Scanner scanner = new Scanner(System.in);
        root.data = scanner.nextInt();
        root.lChild = root.rChild = null;
        q.enqueue(root);
        while(!q.isEmpty()) {
            p = q.dequeue();
            System.out.printf("Enter the left child of %d : ", p.data);
            int x = scanner.nextInt();
            if(x != -1){
                t= new Node();
                t.data = x;
                t.lChild= t.rChild=null;
                p.lChild = t;
                q.enqueue(t);
            }
            System.out.printf("Enter the right child of %d : " , p.data);
            int y = scanner.nextInt();
            if(y != -1){
                t= new Node();
                t.data = y;
                t.lChild= t.rChild=null;
                p.rChild = t;
                q.enqueue(t);
            }
        }
    }
}
