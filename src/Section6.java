import java.util.Arrays;
import java.util.List;

public class Section6 {

    public static void main(String[] args) {
         int[] a = new int[]{2, 4, 6};
         int[] b = {12,3,4,5};

         int[] c = new int[7];
            List<Integer> d = Arrays.asList(1,2,3,4);
        System.out.println(Arrays.toString(b));
        System.arraycopy(b,0,c,0,b.length);
        System.out.println(Arrays.toString(c));
//         for(int i=0;i<4;i++)   {
//             System.out.printf(b[i] + " ");
//         }
         for (int element : d)  {
             System.out.printf(element + " ");
         }
        System.out.println("Two dimensional arrays");
        twoDimensionalArray(); 
    }
    public static void twoDimensionalArray()    {
        int[][] a = new int[3][4];
        int[][] b = {{1,2,3,4}, {2,4,6,8}, {1,3,5,7}};
        System.out.println(b.length);
        for(int i=0;i<3;i++)    {
            for(int j=0;j<4;j++)    {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
    }
}
