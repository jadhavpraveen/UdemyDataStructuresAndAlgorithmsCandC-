package Section20;

public class InsertionSort {
    public static void main(String[] args) {
        int[] a = {3,7,9,10,6,5,12,4,11,2};
        insertionSort(a);
        display(a);
    }

    public static void insertionSort(int a[])   {
        int j, x;
        for(int i=1;i<a.length;i++) {
            j = i-1;
            x = a[i]; // element to be shifted
            while(j>-1 && a[j]>x) {
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = x;
        }
    }

    public static void display(int a[]) {
        for(int i=0;i<a.length;i++) {
            System.out.print(a[i]+" ");
        }
    }
}
