package Section8;

import java.util.Arrays;

public class Strings {
    public static void main(String[] args) {
        lengthOfString();
        changeCaseOfString();
        countVowels();
        if(validString()) System.out.println("String is valid");
        else System.out.println("String is not valid");
        System.out.println("String after reverse : " + reverseString("python"));
        if (isPallindrome("liriL")) System.out.println("String is pallindrome");
        else System.out.println("String is not pallindrome");
        duplicatesInString("finding");
        if(isAnagram("observe", "sebrveo")) System.out.println("Strings are Anagram");
        else System.out.println("Strings are not Anagram");

    }
    public static void lengthOfString()
    {
        System.out.println("**************In lengthOfString()************");
        String str = "john";

        if(str == null || str.isEmpty())
            System.out.println("String is empty");
        else
            System.out.printf("Length of string is : %d", str.length());
    }

    public static void changeCaseOfString() {
        System.out.println();
        System.out.println("**************In changeCaseOfString()************");
        String str = "JOHN";
        StringBuilder result = new StringBuilder();
        for(int i=0; i<str.length();i++)   {
            char c = str.charAt(i);
            if(c >= 'a' && c<='z') c= (char) (c-=32);
            else if (c >= 'A' && c<='Z') c= (char) (c+=32);
            result.append(c);
        }
        System.out.printf("Converted case String is %s", result);
    }
    public static void countVowels()    {
        System.out.println();
        System.out.println("**************In countVowels()************");
        String str = "How are You";
        System.out.println("Length of the String : " + str.length());
        int vCount =0;
        int wCount =0;
        int wordCount = 0;
        for(int i=0;i<str.length();i++) {
            char ch = str.charAt(i);
            //Count the vowels in a string
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                    ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')  {
                vCount++;
            }
            //count consonants or non vowels in a String
            else if (ch >= 'a' && ch<='z' || ch >= 'A' && ch<='Z' ) wCount++;

            //Count number of words in a string
            if(ch == ' ' && str.charAt(i-1) != ' ') wordCount++;
        }

        System.out.println("Number of vowels in a String : " + vCount);
        System.out.println("Number of non vowels in a String : " + wCount);
        System.out.printf("Number of words in a String : %d " , wordCount+1);
    }

    //Check if string is valid or not
    //String is valid if it contains alphabets and numbeers
    //String is not valid if it contains special characters
    public static boolean validString()    {
        System.out.println();
        System.out.println("**************In validString()************");
        String str = "Ani$$321";
        boolean isValidString = false;
        for(int i=0;i<str.length();i++) {
            char ch = str.charAt(i);
            if (!(ch >= 'a' && ch <= 'z') && !(ch >= 'A' && ch <= 'Z') &&
                    !(ch >= '0' && ch <= '9'))
                return false;
        }
        return true;
    }
    public static String reverseString(String str) {
        System.out.println();
        System.out.println("**************In reverseString()************");
        //String str = "python";
        System.out.println("String before reverse : " + str);
        StringBuilder reverseString = new StringBuilder();
        for(int i= str.length()-1;i >=0;i--) {
            char ch = str.charAt(i);
            reverseString.append(ch);
        }
        //System.out.println("String after reverse : " + reverseString);
        return reverseString.toString();
    }
   public static boolean isPallindrome(String str)  {
       System.out.println();
       String pallindromString = reverseString(str);
       System.out.println("**************In isPallindrome()************");
       if(str.equalsIgnoreCase(pallindromString)) return true;
       else return false;
   }
   public static void duplicatesInString(String str)  {
       System.out.println("**************In duplicatesInString()************");
       str = str.toLowerCase();
       int[] hashArray = new int[26];
       for(int i=0;i<str.length();i++) {
           hashArray[str.charAt(i)-97] +=1;
       }
       for(int i=0;i<hashArray.length;i++)  {
           if(hashArray[i] > 1) {
               System.out.printf("Character : %c", i + 97);
               System.out.printf(" appears : %d \n", hashArray[i]);
           }
       }
   }

   //Strings are set to Anagram if both string contain same characters
   public static boolean isAnagram(String str1, String str2)    {
       str1 = str1.toLowerCase();
       str2 = str2.toLowerCase();
       char[] ch1 = str1.toCharArray();
       char[] ch2 = str2.toCharArray();
       Arrays.sort(ch1);
       Arrays.sort(ch2);
       if(Arrays.equals(ch1,ch2))
           return true;
       return false;
   }

}
