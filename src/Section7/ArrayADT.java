package Section7;

import java.util.Arrays;

public class ArrayADT {

    public static void main(String[] args) {
        int[] b = new int[10];
        int[] a = {1,3,5,7,9,11,13,15,17,19,21,23,25};
        b[0] = 4;
        b[1] = 8;
        b[2] = 50;b[3] = 16;b[4] = 20;
        b[5] = 25;b[6] = 28;
        b[7] = 33;

        int[] c = {1,-3,5,7,-9,11,13,-15,17,19,-21,-23,25};

        //Array d and e are used in mergeArray function
        int[] d = {2,6,10,15,25,30,35};
        int[] e = {3,4,7, 18,20};

        //Array f and g are used for mergeArrayUnion and mergeArrayIntersection function
        int[] f = {2,6,10,15,25};
        int[] g = {3,6,7, 15,20};

        //Array h to find single missing element in an sorted array
        int[] h = {1,2,3,4,5,6,8,9,10,11,12};

        //Array i to find single missing element where elements are not first n natural numbers in an sorted array
        int[] i  = {6,7,8,9,10,11,13,14,15,16,17};

        // Array j for multiple missing elements in sorted array
        int[] j = {6,7,8,9,11,12,15,16,17,18,19};
        //System.out.println("Binary Search index for given key is : " + binarySearch(a,2));
        //System.out.println("Recursive Binary Search index for given key is : " + rBinarySearch(a,0,a.length-1,9));
//        System.out.println("Element at index returned by get() function is : " + get(a,12));
//        System.out.println("Element set at index by set() function : ");
//        set(a,4,29);
//        System.out.println("Max element returned by max() function is : " + max(a));
//        System.out.println("Min element returned by min() function is : " + min(a));
//        System.out.println("Sum of all elements returned by sum() function is : " + sum(a));
//        System.out.println("Avg of all elements returned by average() function is : " + average(a));
//        System.out.println("Array after it is reversed by reverse() function is : ");
          //reverse(a);
          //reverseBySwap(a);
          //  insertSort(b,34);
//        System.out.println("Is array sorted : " + isSorted(b));
//        System.out.println("Rearrange -ve numbers on LHS and +ve numbers on RHS ");
//        reArrange(c);
//        System.out.println("Merged array from mergeArray() function is : " + Arrays.toString(mergeArray(d,e)));
//        System.out.println("Union of sets using Merged array algorithm from mergeArrayUnion() function is : " + Arrays.toString(mergeArrayUnion(d,e)));
//        System.out.println("Intersection of sets using Merged array algorithm from mergeArrayIntersection() function is : " + Arrays.toString(mergeArrayIntersection(f,g)));
//        System.out.println("Diffrence of sets using Merged array algorithm from mergeArrayDiffrence() function is : " + Arrays.toString(mergeArrayDifference(f,g)));
        System.out.println();
        singleMissingElementInSortedArray(h);
        System.out.println();
        singleMissingElementInSortedArrayForAnyNaturalNumbers(i);
        System.out.println();
        multipleMissingElementInSortedArray(j);
    }
    public static int binarySearch(int[] a, int key)   {
        int l = 0;
        int h = a.length-1;
        int mid ;
        while(l<=h) {
            mid = (l+h)/2;
            if(key == a[mid])   return mid;
            else if (key < a[mid])  h = mid-1;
            else l = mid+1;
        }
        return -1;
    }

    public static int rBinarySearch(int[] a, int l, int h, int key) {
        int mid;
        if(l<=h)    {
            mid = (l+h)/2;
            if(key == a[mid]) return mid;
            else if(key<a[mid]) return rBinarySearch(a,l ,mid-1, key);
            else return rBinarySearch(a, mid+1, h,key);
        }
        return -1;
    }
    public static int get(int[] a,int index)    {
        if(index >=0 && index < a.length)   return a[index];
        return -1;
    }
    public static void set(int[] a,int index, int x)    {
        if(index >=0 && index < a.length)   a[index] = x;
        System.out.println(Arrays.toString(a));
    }
    public static int max(int[] a)  {
        int max = a[0];
        for(int i=1;i<a.length;i++)
            if(a[i]> max) max = a[i];
        return max;
    }
    public static int min(int[] a)  {
        int min = a[0];
        for(int i=1;i<a.length;i++)
            if(a[i]<min) min = a[i];
        return min;
    }
    public static int sum(int[] a)  {
        int sum = 0;
        for(int i=0;i<a.length;i++) sum +=a[i];
        return sum;
    }
    public static float average(int[] a)    {
        return sum(a)/a.length;
    }
    public static void reverse(int[] a) {
        System.out.println("Array before it is reversed by reverse() function is : " + Arrays.toString(a));
        int[] b = new int[a.length];
        for(int i=a.length-1,j=0;i>=0;i--,j++)    {
            b[j] = a[i];
        }
        for(int i=0;i<a.length;i++) a[i] = b[i];
        System.out.println("Array a after reversing by reverse() function is : " + Arrays.toString(a));
    }
    public static void reverseBySwap(int[] a)   {
        System.out.println("Array before it is reversed by reverseSwap() function is : " + Arrays.toString(a));
        for(int i=0,j=a.length-1;i<j;i++,j--)   {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
        System.out.println("Array a after reversing by reverseBySwap() function is : " + Arrays.toString(a));
    }
    public static void insertSort(int[] a, int element) {
        System.out.println("Array before insertion of element in an sorted array : " + Arrays.toString(a));
        int noOfElements = 0;
        for(int i=0; i< a.length;i++)   if(a[i] != 0) noOfElements++; // gets me count of number of elements than the actual size of array
        if(noOfElements == a.length) return;
        int i = noOfElements-1;
        while(i>= 0 && a[i]>element) {
            a[i+1] = a[i];
            i--;
        }
        a[i+1] = element;
        System.out.println("Array after insertion of element in an sorted array : " + Arrays.toString(a));
    }
    public static boolean isSorted(int[] a) {
        int noOfElements = 0;
        for(int i=0; i< a.length;i++)   if(a[i] != 0) noOfElements++; // gets me count of number of elements than the actual size of array
        for(int i=0;i<noOfElements-1;i++) {
            if(a[i]>a[i+1]) return false;
        }
        return true;
    }
    public static void reArrange(int[] a)   {
        int i = 0, j=a.length-1;  // i for -ve value index and j for +ve element index
        while (i<j)     {
            while(a[i] <0)  i++;
            while(a[j] > 0) j--;
            if(i<j) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        System.out.println("After +ve and -ve numbers are rearranged : " + Arrays.toString(a));
    }

    public static int[] mergeArray(int[] a, int [] b)   {
        int i=0,j=0,k=0;
        int[] c = new int[a.length + b.length];
        while(i<a.length && j<b.length) {
            if(a[i] < b[j]) c[k++] = a[i++];
            else
                    c[k++] = b[j++];
        }
        //Copy rest of the elements remaining in any of the a or b array into c array
        for(;i<a.length;i++)    c[k++] = a[i];
        for(;j<b.length;j++)    c[k++] = a[j];
        return c;
    }

    public static int[] mergeArrayUnion(int[] a, int [] b)   {
        int i=0,j=0,k=0;
        int[] c = new int[a.length + b.length];
        while(i<a.length && j<b.length) {
            if(a[i] < b[j]) c[k++] = a[i++];
            else if (b[j] < a[i]) c[k++] = b[j++];
            else {
                c[k++] = a[i++];
                j++;
            }
        }
        //Copy rest of the elements remaining in any of the a or b array into c array
        for(;i<a.length;i++)    c[k++] = a[i];
        for(;j<b.length;j++)    c[k++] = a[j];
        return c;
    }
    public static int[] mergeArrayIntersection(int[] a, int [] b)   {
        int i=0,j=0,k=0;
        int[] c = new int[a.length + b.length];
        while(i<a.length && j<b.length) {
            if(a[i] < b[j]) {
                i++;
                //k++;
            }
            else if (b[j] < a[i]) {
                j++;
                //k++;
            }
            else {
                c[k++] = a[i++];
                j++;
            }
        }
        //Copy rest of the elements remaining in any of the a or b array into c array
       // for(;i<a.length;i++)    c[k++] = a[i];
        //for(;j<b.length;j++)    c[k++] = a[j];
        return c;
    }

    //In difference we copy only elements of A that are not in b
    public static int[] mergeArrayDifference(int[] a, int [] b)   {
        int i=0,j=0,k=0;
        int[] c = new int[a.length + b.length];
        while(i<a.length && j<b.length) {
            if(a[i] < b[j]) c[k++] = a[i++];
            else if (b[j] < a[i]) j++;
            else if(a[i] == b[j]) {
                i++;
                j++;
            }
        }
        //Copy rest of the elements remaining in any of a into c
        for(;i<a.length;i++)    c[k++] = a[i];
        //for(;j<b.length;j++)    c[k++] = a[j];
        return c;
    }
    //Find single missing element in an sorted array
    public static void singleMissingElementInSortedArray(int[] a)   {
        //find out sum of all natural numbers
        int n = a[a.length-1];
        int sum = (n * (n+1))/2;
        //find the sum of all elements in the array
        int s = 0;
        for(int i=0; i<a.length;i++)  {
            s = s+ a[i];
        }
        System.out.printf("Single missing number in the given sorted array : %d", sum-s);
    }

    //Find single missing element if an  array does not contain first n natural numbers
    public static void singleMissingElementInSortedArrayForAnyNaturalNumbers(int[] a)   {
        //get the difference of first element and its index
        int diff = a[0]-0;
        //scan for all elements
        for (int i=0;i<a.length;i++)    {
            if(a[i]-i != diff)  {
                System.out.printf("Missing number for sorted array not with first n natual sumbers is : %d", i+ diff);
                break;
            }
        }
    }
    //Find multiple missing elements in an sorted array topic 122
    public static void multipleMissingElementInSortedArray(int[] a) {
        //get the difference of first element and its index
        int diff = a[0]-0;
        System.out.print("Multiple missing elements in sorted array are : ");
        //scan for all elements
        for (int i=0;i<a.length;i++) {

            if (a[i] - i != diff) {
                while (diff < a[i] - i) {
                    System.out.printf("%d    ", i + diff);
                    diff++;
                }
            }
        }
    }

}
