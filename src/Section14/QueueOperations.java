package Section14;

import java.util.Scanner;

public class QueueOperations {
    private static Queue q = null;
    public static void main(String[] args) {
        q = new Queue();
        create(q);
        enqueue(q, 10);
        enqueue(q, 20);
        enqueue(q, 30);
        enqueue(q, 40);
        enqueue(q, 50);
        display(q);
        dequeue(q);
        display(q);
    }
    public static void create(Queue q)  {

        q.rear = -1;
        q.front = -1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of an queue");
        int size = scanner.nextInt();
        q.a = new int[size];
    }
    public static void enqueue(Queue q , int x) {

        //Before insertion check if queue is full
        if(q.rear == q.a.length-1)
            System.out.println("Queue is full");
        else    {
            //increment the pointer and then insert
            q.rear++;
            q.a[q.rear] = x;
        }
    }
    public static void dequeue(Queue q)  {
        int x = -1;
        //Before deleting check if queue is empty or not
        if(q.front == q.rear) System.out.println("Queue is empty");
        else {
            q.front++;
            System.out.printf("Element deleted from queue is : %d\n",q.a[q.front]);
        }
    }
    public static void display(Queue q) {
        if(q.front == q.rear) System.out.println("Queue to be displayed is empty ");
        else {
            System.out.print("Queue displayed is : ");
            for(int i=q.front+1;i<=q.rear;i++)   {
                System.out.printf("%d ", q.a[i]);
            }
        }
        System.out.println();
    }
}
