package Section13;

public class StackLinkedList {
    public static Node top = null;

    public static void main(String[] args) {
        push(10);
        push(20);
        push(30);
        push(40);
        push(50);
        display();

        System.out.printf("Deleted node : %d ", pop());
        System.out.printf("Deleted node : %d ", pop());
        System.out.println();
        display();
    }
    public static void push(int x)    {
        Node t = new Node();
        if(t == null) System.out.println("Stack is overflow");

        else {
            t.data = x;
            t.next = top;
            top = t;
        }
    }
    public static int pop() {
        Node p = null;
        int x = -1;
        if(top == null) System.out.println("Stack is empty");
        p = top;
        top = top.next;
        x = p.data;
        p = null;
        return x;
    }

    public static void display() {
        Node p = top;
        while(p!= null) {
            System.out.printf("%d ", p.data);
            p = p.next;
        }
        System.out.println();
    }

}
