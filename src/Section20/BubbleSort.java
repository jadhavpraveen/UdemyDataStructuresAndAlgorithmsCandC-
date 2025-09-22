package Section20;

public class BubbleSort {
    public static void main(String[] args) {
        int[] a = {3,7,9,10,6,5,12,4,11,2};
        bubbleSort(a);
        display(a);
    }
    public static void bubbleSort(int a[]) {
        boolean flag = false;
        int temp;
        for(int i=0;i<a.length-1;i++) {
            for(int j=0;j<a.length-1-i;j++) {
                if(a[j]>a[j+1]) {
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    flag = true;
                }
            }
            if(flag == false) break;
        }
    }
    public static void display(int a[]) {
        for(int i=0;i<a.length;i++) {
            System.out.print(a[i]+" ");
        }
    }
}
