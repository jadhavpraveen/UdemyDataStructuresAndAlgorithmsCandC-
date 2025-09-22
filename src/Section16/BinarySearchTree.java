package Section16;

public class BinarySearchTree {
    public static Node root = null;
    public static void main(String[] args) {

        root = rCreateBST(root, 50);
        rCreateBST(root, 10);
        rCreateBST(root, 40);
        rCreateBST(root, 20);
        rCreateBST(root, 30);
        displayTreeInOrder(root);
        System.out.println();
        if(searchBST(50))
         System.out.println("Element found");
        else System.out.println("Element not found");
    }
    public static boolean searchBST(int key)    {
        Node t = root;
        while (t!= null)    {
            if(key == t.data)   return true;
            else if (key < t.data) t=t.lChild;
            else t = t.rChild;
        }
        return false;
    }
    public static Node createBST(Node p, int key)  {
        Node tail = null;
        Node newNode = null;
        //Creating first node in BST
        if(p==null) {
            newNode = new Node();
            newNode.data = key;
            newNode.lChild = null;
            newNode.rChild = null;
            return newNode;
        }
        while(p!= null) {
                tail = p;
                if(key<p.data) {
                    p = p.lChild;
                } else if (key>p.data) {
                    p = p.rChild;
                }
                else return null;
            }
            newNode = new Node();
            newNode.data = key;
            newNode.lChild = null;
            newNode.rChild = null;
            if (newNode.data < tail.data)
                tail.lChild = newNode;
            else
                tail.rChild = newNode;
        return newNode;
    }

    public static Node rCreateBST(Node p, int key)  {
        Node newNode = null;
        if(p==null) {
            newNode = new Node();
            newNode.data = key;
            newNode.lChild = null;
            newNode.rChild = null;
            return newNode;
        }
        if(key<p.data) p.lChild = rCreateBST(p.lChild, key);
        else p.rChild = rCreateBST(p.rChild, key);
        return p;
    }
    public static void displayTreeInOrder(Node p)  {
        if(p != null) {
            displayTreeInOrder(p.lChild);
            System.out.printf("%d ", p.data);
            displayTreeInOrder(p.rChild);
        }
    }
}
