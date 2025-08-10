public class StringPrograms {

    public static void main(String[] args) {
        pallindromeString("niasin");
    }
    public static void pallindromeString(String str)    {
        String str1 = "";
        boolean isPallindrome = true;
        // for(int i=str.length()-1;i>=0;i--) {
        //     str1 += str.charAt(i);
        // }

        for(int i=0,j=str.length()-1;i<j;i++,j--)   {
            if(str.charAt(i)!=str.charAt(j)) {
                isPallindrome = false;
                break;
            }
        }
        if(isPallindrome) System.out.println("String is pallindrome");
        else System.out.println("String is not pallindrome");
        // if(str.equalsIgnoreCase(str1)) System.out.println("String is pallindrome");
        // else System.out.println("String is not pallindrome");
    }

}
