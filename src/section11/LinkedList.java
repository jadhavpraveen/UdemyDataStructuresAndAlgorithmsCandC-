package section11;

import org.w3c.dom.ls.LSOutput;

public class LinkedList {
    public static Node first = null;

    //public static Node current = null;
    public static void main(String[] args) {
      /*  Node first1 = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);

        first1.next = second;
        second.next = third;
        Node current1 = first1;
        while (current1 != null) {
            System.out.println(current1.data);
            current1 = current1.next;
        }

        int[] a = {2, 4, 6, 8, 1};
        createNode(a);
        displayNodes(first);
        //displayNodesRecursively(first);
        countNodes(first);
        System.out.println("Number of nodes in linked List by Recursive function : " + countNodesRecursively(first));
        sumOfNodes(first);
        System.out.println("Sum of elements in nodes in linked List by Recursive function : " + sumOfNodesRecursively(first));
        maxValue(first);
        Node p = searchNode(first, 1);
        if (p != null) {
            System.out.println("Key  found");
            System.out.println("Display Nodes after linear search by header method");
            displayNodes(p);
        }
        else System.out.println("Key not found");
        System.out.println();
//        System.out.println("Nodes before insertion at first position");
//        displayNodes(first);
        System.out.println();
//        System.out.println("Insert node at first position and display it");
//        insertNodes(first,0);
//        System.out.println();
        int n =10;
        System.out.println("Nodes before insertion at position " + n);
        displayNodes(first);
        System.out.println();

        System.out.println("Insert node at position " + n + " and display it");
        insertNodes(first,n);
*/
    //    System.out.println("==============Insert in sorted linked list===============");
//        int[] b = {2, 4, 6, 8, 10};
//        createNode(b);
       // System.out.println("Nodes before insertion in sorted Linked list");
       // displayNodes(first);
       /* System.out.println();
        System.out.println("Nodes after insertion of new node in sorted linked List");
        insertInSortedLinkedList(first, 10);
        insertInSortedLinkedList(first, 20);
        insertInSortedLinkedList(first, 15);
        insertInSortedLinkedList(first, 40);
        insertInSortedLinkedList(first, 50);
        System.out.println();
        displayNodes(first);*/
        /*System.out.println("==============Delete a node in linked list===============");
        System.out.println("Nodes before deletion in sorted Linked list");
        displayNodes(first);
        System.out.println();
        System.out.println("Nodes after deletion in sorted Linked list");
        deleteNode(first, 3);
        displayNodes(first);*/

        /*System.out.println();
        System.out.println("==============Check if linked list is sorted or not===============");
        System.out.println("Linked list to be verified if sorted or not");
        int[] b = {2, 4, 3, 8, 10};
        createNode(b);
        displayNodes(first);
        System.out.println();
        if(isLinkedListSorted()) System.out.println("Linked list is sorted");
        else System.out.println("Linked list is not sorted");*/

/*        System.out.println();
        System.out.println("==============remove duplicates from sorted linked list===============");
        int[] b = {2, 4, 5,5, 8,10, 10};
        createNode(b);
        displayNodes(first);
        System.out.println();
        System.out.println("Linked list after removing the duplicate nodes");
        removeDuplicatesFromSortedLinkedList();
        displayNodes(first);*/
        /*System.out.println();
        System.out.println("==============Reverse the linked list===============");
        int[] b = {10, 20, 30, 40, 50};
        createNode(b);
        System.out.println("Linked List order before reversing");
        displayNodes(first);
        System.out.println();
        System.out.println("Linked List order after reversing");
        reverseLinkedList(first);*/
        System.out.println("==============Middle element in the linked list===============");
        int[] c = {10, 20, 30, 40, 50, 60,70, 80 };
        createNode(c);
        displayNodes(first);
        System.out.println();
        middleElement(first);
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
        for (int i = 1; i < a.length; i++) {
            t = new Node();
            t.data = a[i];
            t.next = null;
            last.next = t;
            last = t;

        }
    }

    public static void displayNodes(Node current) {
        while (current != null) {
            System.out.printf("%d ",current.data);
            current = current.next;
        }
    }

    public static void displayNodesRecursively(Node current) {
        if (current != null) {
            displayNodesRecursively(current.next);
            System.out.printf("%d ", current.data);
        }
    }

    public static int countNodes(Node p) {
        System.out.println();
        int count = 0;
        while (p != null) {
            count++;
            p = p.next;
        }
        System.out.println("Number of nodes in linked list : " + count);
        return count;
    }

    public static int countNodesRecursively(Node p) {
        if (p == null)
            return 0;

        return countNodesRecursively(p.next) + 1;
    }

    public static void sumOfNodes(Node p) {
        System.out.println();
        int sum = 0;
        while (p != null) {
            sum = sum + p.data;
            p = p.next;
        }
        System.out.println("Sum of all elements in nodes in linked list : " + sum);
    }

    public static int sumOfNodesRecursively(Node p) {
        if (p == null)
            return 0;
        return sumOfNodesRecursively(p.next) + p.data;
    }

    public static void maxValue(Node p) {
        int max = 0;
        while (p != null) {
            if (p.data > max) max = p.data;
            p = p.next;
        }
        System.out.println("Maximum value of element in Linked list : " + max);
    }

    //Search where in every search the value searched will be moved to header position
    public static Node searchNode(Node p, int key) {
        Node q = null;
        while (p != null) {
            if (key == p.data) {
                q.next = p.next;
                p.next = first;
                first = p;
                return p;
            }
            q = p;
            p = p.next;
        }
        return null;
    }
    public static Node linearSearchNode(Node p, int key) {
        Node q = null;
        while (p != null) {
            if (key == p.data) return p;
            p = p.next;
        }
        return null;
    }
    public static Node RLinearSearchNode(Node p, int key) {
        Node q = null;
        if(p== null)    return null;
        if (key == p.data) return p;
        return RLinearSearchNode(p.next, key);
    }
    public static void insertNodes(Node p,int position)    {
        //check if index is valid. If not then return
        if(position < 0 || position > countNodes(p)) return;

        //New node to be inserted
        Node newNode  = new Node();
        newNode.data = 10;

        //if position = 0 that means insert the new node at first position
        if(position==0) {
            newNode.next = first;
            first = newNode;
        }
        if(position > 0)    {
            for(int i=0;i<position-1 && p!=null;i++)    {
                p = p.next;
            }
            if(p!= null)    {
                newNode.next = p.next;
                p.next = newNode;
            }
        }
        displayNodes(first);
    }
    public static void insertInSortedLinkedList(Node p, int x) {
        //Need to have 2 pointers p and q to traverse the linked list
        Node q = null;
        Node t = new Node();
        t.data = x;
        t.next = null;
        if(first == null)
            first = t;
        else {
            //traverse the link list till we get a value in node less than x
            while (p != null && x > p.data ) {
                q = p;
                p = p.next;
            }
            //if p is first node then
            if(p==first)    {
                t.next = first;
                first = t;
            }
            else {
                t.next = q.next;
                q.next = t;
            }
        }
    }
    public static int deleteNode(Node p, int index)    {
        Node q = null;
        int x =-1;
        if(index<1 || index > countNodes(p)) return x;
        if(index == 1) {
            q = first;
            x = first.data;
            first = first.next;

        }
        else {
            for(int i=0; i<index-1 && p != null;i++)    {
                q=p;
                p=p.next;
            }
            x = p.data;
            q.next = p.next;
        }
        return x;
    }
    public static boolean isLinkedListSorted()  {
        Node p = first.next;
        Node q = first;
        while(p!= null) {
            if(p.data < q.data) return false;
            p=p.next;
            q = q.next;
        }
        return true;
    }
    public static void removeDuplicatesFromSortedLinkedList()   {
//        //Node p  = first.next;
//        Node q = p.next;
//        while (q!= null)    {
//            if(p.data != q.data)    {
//                p = q;
//                q = q.next;
//            }
//            //Remove duplicate nodes
//            else    {
//                p.next = q.next;
//                q = p.next;
//            }
//        }
        Node p  = first.next;
        Node q = first;
        while (p!= null)    {
            if(q.data != p.data)    {
                q = p;
                p = p.next;
            }
            //Remove duplicate nodes
            else    {
                q.next = p.next;
                p = q.next;
            }
        }
        //displayNodes(first);
    }
    public static void reverseLinkedList(Node p)    {
        Node q = null;
        Node r = null;
        while (p!= null)    {
            r=q;
            q=p;
            p=p.next;
            q.next = r;
        }
        first = q;
        displayNodes(first);
    }

    public static void middleElement   (Node p) {
        Node q = first;
        while(q != null)    {
            q=q.next;
            if(q != null)  q = q.next;
            if(q != null) p = p.next;
        }
        System.out.println("Middle element in the linked list is : " + p.data);

    }
}
