package section11;

public class CircularLinkedList {
    private static Node head = null;
    static int flag = 0;
    public static void main(String[] args) {
        int[] b = {10, 20, 30, 40, 50};
        createNode(b);
        System.out.println("Number of nodes created : " + countNodes(head));
        System.out.println("Display nodes before inserting new node.");
        dispayNodes(head);
        System.out.println("Display nodes after inserting new node.");
        insert(head, 5, 25);
        dispayNodes(head);
       // rDispayNodes(head);
    }

    public static  void insert(Node p, int index, int x)    {
        if(index < 0 || index > countNodes(p)) {
            System.out.println("Index position is greater than number of nodes or is less than zero ");
            return;
        }
        Node t = null;
        //index = 0 means we need to insert a node before head
        if(index == 0)  {
            t = new Node();
            t.data = x;
            //This checks if there are any nodes or head is present or not
            //If head is not present then point head to newly created node t
            if(head == null)    {
                head = t;
                head.next = head ; //This makes linked list circular
            }
            //Head is not null and we can insert a new node before head
            else {
                t.next = head;
                //traverse the pointer p till the last node
                //last node is identified when p.next == head
                while(p.next!= head)    {
                    p=p.next;
                }
                //will point p.next to t, to maintain the circularity
                p.next = t;
                head = t;
            }
        }
        //This condition inserts the node at given position
        else {
            t = new Node();
            t.data = x;
            for(int i=0;i<index-1;i++)  {
                p = p.next;
            }
            t.next = p.next;
            p.next = t;
        }
    }
    public static int countNodes(Node p)    {
        int count = 0;
        do {
            count++;
            p = p.next;
        }while (p != head);
        return count;
    }
    public static void createNode(int[] a)  {
        Node t = null;
        Node last = null;
        head = new Node();
        head.data = a[0];
        head.next = head;   // assigning head to head.next we make this as circular
        last = head;

        for (int i=1;i<a.length;i++)    {
            t = new Node();
            t.data = a[i];
            t.next = last.next;
            last.next = t;
            last = t;
        }
    }

    public static void dispayNodes(Node h) {
        if(head == null) {
            System.out.println("No nodes created to be displayed");
            return;
        }
        do {
                System.out.printf("%d   ", h.data);
                h = h.next;
        }while (h!= head);
        System.out.println();
    }

    public static void rDispayNodes(Node h) {

        if(h!= head || flag==0) {
            flag=1;
            System.out.printf("%d   ", h.data);
            rDispayNodes(h.next);
        }
        flag=0;
        System.out.println();
    }
}
