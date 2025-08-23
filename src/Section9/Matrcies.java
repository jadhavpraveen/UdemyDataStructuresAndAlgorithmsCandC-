package Section9;

public class Matrcies {
    public static void main(String[] args) {
        int n = 5;
        int[] a = new int[n];
        set(a,1,1,10);
        set(a,2,2,15);
        set(a,3,3,20);
        set(a,4,4,25);
        set(a,5,5,30);
        displayMatrix(a);

        System.out.println(get(a,3,3));

    }
    public static void set(int[] a, int i, int j, int element)  {
        if(i==j)    a[i-1] = element;
    }
    public static int get(int[] a, int i, int j)    {
        if(i==j)    return a[i-1];
        else return 0;
    }
    public static void displayMatrix(int[] m)   {
        for(int i=0;i<m.length;i++) {
            for(int j=0;j<m.length;j++) {
                if(i==j) System.out.printf("%d ", m[i]);
                else System.out.printf("0 ");
            }
            System.out.println();
        }
    }
}
