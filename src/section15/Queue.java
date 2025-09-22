package section15;

import java.util.Scanner;

public class Queue {
    int front;
    int rear;
    Node[] a;

    public void create()    {
        front = rear = -1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of an queue");
        int size = scanner.nextInt();
        a = new Node[size];
    }
    public void enqueue(Node x)  {

        //Before insertion check if queue is full
        if(rear == a.length-1)
            System.out.println("Queue is full");
        else    {
            //increment the pointer and then insert
            rear++;
            a[rear] = x;
        }
    }
    public Node dequeue()    {
        Node x = null;
        //Before deletion check if queue is empty
        if(front == rear)
            System.out.println("Queue is empty");
        else    {
            //increment the pointer and then delete
            front++;
            x = a[front];
        }
        return x;
    }
    public boolean isEmpty()    {
        return (rear == front);
    }
}
