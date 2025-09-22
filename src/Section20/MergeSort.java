package Section20;

public class MergeSort {
    public static void main(String[] args) {
        int[] a = {3,7,9,10,6,5,12,4,11,2};
        //iMergeSort(a);
        rMergeSort(a, 0, a.length - 1);
        display(a);
    }
    public static void merge(int[] a, int l, int mid, int h) {
        int i = l;
        int j = mid + 1;
        int k = l;
        int[] b = new int[100];
        while (i <= mid && j <= h) {
            if (a[i] < a[j]) {
                b[k++] = a[i++];
            } else {
                b[k++] = a[j++];
            }
        }
        //the below 2 for loops copies the remaining elements into array
        for (; i <= mid; i++) {
            b[k++] = a[i];
        }
        for (; j <= h; j++) {
            b[k++] = a[j];
        }
        //copies the sorted elements into original array a from auxillary array b
        for (i = l; i <= h; i++) {
            a[i] = b[i];
        }

    }
    //Recursive merge sort
    public static void rMergeSort(int[] a, int l, int h) {
        int mid;
        if (l < h) {
            mid = (l + h) / 2;
            rMergeSort(a, l, mid);
            rMergeSort(a, mid + 1, h);
            merge(a, l, mid, h);
        }
    }
    //Iterative merge sort
    public static void iMergeSort(int[] a) {
        int n = a.length;
        int p, i, l, mid, h;
        for (p = 2; p <= n; p = p * 2) {
            for (i = 0; i + p - 1 < n; i = i + p) {
                l = i;
                h = i + p - 1;
                mid = (l + h) / 2;
                merge(a, l, mid, h);
            }
        }
        if (p / 2 < n) {
            merge(a, 0, p / 2 - 1, n - 1);

        }
    }
    public static void display(int a[]) {
        for(int i=0;i<a.length;i++) {
            System.out.print(a[i]+" ");
        }
    }
}
