package Section13;

import java.util.Scanner;

public class StackOperations {
    public static Stack stack = null;
    public static StackCharArray stackCArray = null;
    public static void main(String[] args) {

        /*stack = new Stack();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the stack");
        stack.size = scanner.nextInt();
        stack.top = -1; // indicates stack is empty
        stack.a = new int[stack.size];
        push(stack, 5);
        push(stack, 10);
        push(stack, 15);
        push(stack, 20);
        push(stack, 25);
        display(stack);
        //int x = pop(stack);
        //System.out.println("Element popped out : " + x);
        //display(stack);
        System.out.println("Enter position to get the element");
        int position = scanner.nextInt();
        if(peek(stack, position) == -1) System.out.println("Invlid position : " + position);
        else System.out.println("Element at position " + position + " is " + peek(stack, position));
        System.out.println("Element at the top of stack : " + stackTop(stack));
        System.out.println("Is stack empty : " + isEmpty(stack));
        System.out.println("Is stack full : " + isStackFull(stack));*/

        //Check if parenthsis are balanced or not
        System.out.println("Check if parenthsis are balanced or not");
        String parenthesis = "((a+b)*(c+d)))";
        char[] c = parenthesis.toCharArray();
        if(isBalanced(c)) System.out.println("Parenthesis are balanced");
        else System.out.println("Parenthesis are not balanced") ;
    }
    public static boolean isBalanced(char[] c)  {
        stackCArray = new StackCharArray();
        stackCArray.size = c.length;
        stackCArray.top = -1;
        stackCArray.a = c;
        for(int i= 0;i<c.length;i++)    {
            if(c[i] == '(') pushCharacters(stackCArray, c[i]);
            else if(c[i] == ')')   {
                if(isEmptyCStack(stackCArray)) return false;
                popCStack(stackCArray);
            }
        }
        return isEmptyCStack(stackCArray) ? true : false;
    }
    public static void pushCharacters(StackCharArray st, char x)  {
        if(st.top == st.a.length-1)
            System.out.println("Stack overflow");
        else {
            st.top++ ;
            st.a[st.top] = x;
        }
    }
    public static void popCStack(StackCharArray st)    {
        int x = -1;
        if(st.top == -1) System.out.println("Stack under flow");
        else {
            x = st.a[st.top];
            st.top--;
        }
    }
    public static boolean isEmptyCStack(StackCharArray st) {
        return st.top == -1 ? true : false;
    }
    public static void push(Stack st, int x)  {
        if(st.top == st.a.length-1)
            System.out.println("Stack overflow");
        else {
            st.top++ ;
            st.a[st.top] = x;
        }
    }
    public static int pop(Stack st) {
        int x = -1;
        if(st.top == -1) System.out.println("Stack under flow");
        else {
            x = st.a[st.top];
            st.top--;
        }
        return x;

    }
    public static int peek(Stack st, int position)  {
        int x = -1;
        //Check if position is valid or not
        if(st.top-position+1 < 0) x = -1;
        else
            x = st.a[st.top-position+1];
        return x;
    }

    public static int stackTop(Stack st)    {
        if(st.top == -1)    return -1;
        else return st.a[st.top];
    }
    public static boolean isEmpty(Stack st) {
        return st.top == -1 ? true : false;
    }
    public static boolean isStackFull(Stack st) {
         return st.top == st.a.length-1 ? true : false;
    }
    public  static void display(Stack st)   {
        if(st.top == -1) System.out.println("Stack is empty");
        for(int i=0;i<= st.top;i++)   {
            System.out.printf("%d ", st.a[i]);
        }
        System.out.println();
    }
}
