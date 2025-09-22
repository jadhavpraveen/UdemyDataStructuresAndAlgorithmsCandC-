package Section20;

public class SelectionSort {
    public static void main(String[] args) {
        int[] a = {3,7,9,10,6,5,12,4,11,2};
        selectionSort(a);
        display(a);
    }
    public static void selectionSort(int a[])   {
        int k, temp;
        for(int i=0;i<a.length-1;i++) {
            for(int j=k=i;j<a.length;j++) {
                if(a[j]<a[k]) k = j;
            }
            temp = a[i];
            a[i] = a[k];
            a[k] = temp;
        }
    }
    public static void display(int a[]) {
        for(int i=0;i<a.length;i++) {
            System.out.print(a[i]+" ");
        }
    }
}
