package section11;

public class DoublyLinkedList {
    private static DoublyNode first = null;

    public static void main(String[] args) {
        int[] b = {10, 20, 30, 40, 50};
        createNode(b);
        display(first);
        //System.out.println("Number of Nodes in the Doubly Linked list : " + count(first));
        insert(first, 5,35);

    }

    private static void createNode(int[] b) {
        DoublyNode t = null; // to create a new node
        DoublyNode last = null;
        first = new DoublyNode();
        first.prev = null;
        first.next = null;
        first.data = b[0];
        last = first; // with the help of last pointer we create the next nodes
        for (int i=1;i<b.length;i++)    {
            t = new DoublyNode();
            t.data = b[i];
            t.next = last.next;
            t.prev = last;
            last.next = t;
            last = t;
        }
    }
    private static void display(DoublyNode p)   {
        while (p!= null)    {
            System.out.printf("%d   ", p.data);
            p=p.next;
        }
        System.out.println();
    }
    private static int count(DoublyNode p)  {
        int count = 0;
        while (p!=null) {
            count++;
            p=p.next;
        }
        System.out.println("Number of Nodes in the Doubly Linked list : " + count);
        return count;
    }
    private static void insert(DoublyNode p, int index, int x)  {
        if(index < 0 || index > count(p))   {
            System.out.println("Index is either zero or greater than the length of nodes");
            return;
        }

        if(index == 0)  {
            DoublyNode t = new DoublyNode();
            t.data = x;
            t.prev = null;
            t.next = first;
            first = t;
        }
        else {
            for(int i=0;i<index-1;i++)  {
                p=p.next;
            }
            DoublyNode t = new DoublyNode();
            t.data = x;
            //4 links will be modified
            t.next = p.next;
            t.prev = p;
            if(p.next!=null)
                p.next.prev = t;
            p.next = t;
        }
        System.out.println("Display nodes after inserting new node");
        display(first);
    }
}
