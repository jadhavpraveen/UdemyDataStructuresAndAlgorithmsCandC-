package section11;

public class LinkedList {
    public static Node first = null;
    //public static Node current = null;
    public static void main(String[] args) {
        Node first1 = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);

        first1.next = second;
        second.next = third;
        Node current1 = first1;
        while(current1 != null)  {
            System.out.println(current1.data);
            current1 = current1.next;
        }

        int[] a = {2,4,6,8,10};
        createNode(a);
        //displayNodes(first);
        displayNodesRecursively(first);
        countNodes(first);
        System.out.println("Number of nodes in linked List by Recursive function : " + countNodesRecursively(first));
        sumOfNodes(first);
        System.out.println("Sum of elements in nodes in linked List by Recursive function : " + sumOfNodesRecursively(first));
        maxValue(first);
    }

    public static void createNode(int[] a) {
        Node t = null;   // creates the new node
        Node last = null; // points to the last node

        first = new Node();
        first.data = a[0];
        first.next = null;
//        last.next = first;
        last = first;
        //Node last = first;
        //current  = new Node();
        for (int i=1;i<a.length;i++)    {
            t = new Node();
            t.data = a[i];
            t.next = null;
            last.next = t;
            last = t;

        }
    }

    public static void displayNodes(Node current)    {
        while(current!=null)    {
            System.out.println(current.data);
            current = current.next;
        }
    }
    public static void displayNodesRecursively(Node current)    {
        if(current != null){
            displayNodesRecursively(current.next);
            System.out.printf("%d ", current.data);
        }
    }

    public static void countNodes(Node p)  {
        System.out.println();
        int count = 0;
        while (p!=null){
            count++;
            p = p.next;
        }
        System.out.println("Number of nodes in linked list : " + count);
    }
    public static int countNodesRecursively(Node p)    {
        if(p== null)
            return 0;

          return countNodesRecursively(p.next) + 1;
    }

    public static void sumOfNodes(Node p)  {
        System.out.println();
        int sum = 0;
        while (p!=null){
            sum = sum + p.data;
            p = p.next;
        }
        System.out.println("Sum of all elements in nodes in linked list : " + sum);
    }

    public static int sumOfNodesRecursively(Node p)    {
        if(p== null)
            return 0;
        return sumOfNodesRecursively(p.next) + p.data;
    }
    public static void  maxValue(Node p)  {
        int max = 0;
        while (p!= null)    {
            if(p.data>max) max = p.data;
            p = p.next;
        }
        System.out.println("Maximum value of element in Linked list : " + max);
    }

}
