public class Section5 {
    static int x = 0;
    static double p=1;
    static double f = 1;
    static double result = 1;
    static int[] fibArray = {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};

    static int i = 1; //used in quiz 1 question1
    static int d = 1; //used in quiz 1 question5

    public static void main(String[] args) {
       // System.out.println("Hello, World!");
        int x = 3;

//        System.out.println("Calling fun1");
//        fun1(x);
//        System.out.println();
//        System.out.println("Calling fun2");
//        fun2(x);
//        System.out.println();
//        System.out.println("Calling fun3");
//        System.out.println(fun3(5));
//        System.out.println();        
//        System.out.println(fun4(5));
//        System.out.println();
        System.out.println("Calling funTreeRecursion");
        funTreeRecursion(x);
        System.out.println();
        System.out.println("Calling funA for Indirect Recursion");
        funA(20);
        System.out.println();
        System.out.println("Value for funNestedRecursion in Nested Recursion : " + funNestedRecursion(25));

        System.out.println();
        System.out.println("Sum of n Natural numbers using recursion : " + sumOfNaturalNumbersUsingRecursion(5));

        System.out.println();
        System.out.println("Sum of n Natural numbers using for loop : " + sumOfNaturalNumbersUsingForLoop(5));

        System.out.println();
        System.out.println("Factorial of n numbers using recursion : " + factorialOfNumbersUsingRecursion(-1));

        System.out.println();
        System.out.println("Factorial of n numbers using for loop : " + factorialOfNumbersUsingForLoop(-1));

        System.out.println();
        System.out.println("Power using Recursion : " + powerUsingRecursion(2, 8));

        System.out.println();
        System.out.println("Power using Recursion for reduced multiplication : " + power(2, 9));

        System.out.println();
        System.out.println("Power using for loop : " + powerUsingForLoop(2, 9));

        System.out.println();
        System.out.printf("Taylor series using recursion : %.6f%n " , taylorSeriesRecursion(4, 150));

        System.out.println();
        System.out.printf("Taylor series by Horner's rule using recursion : %.6f%n " , taylorSeriesHornersRuleRecursion(1, 10));

        System.out.println();
        System.out.println("Fibonacci series using For loop : " + fibonacciSeriesUsingForLoop( 6));

        System.out.println();
        System.out.println("Fibonacci series using recursion : " + fibonacciSeriesUsingRecursion( 6));

        System.out.println();
        System.out.println("Fibonacci series using recursion Memoization : " + fibonacciSeriesUsingRecursionMemoization( 6));

        System.out.println();
        System.out.println("Combination formula nCr : " + nCr( 4,2));

        System.out.println();
        System.out.println("Combination formula nCr using Recursion by Programming Pascal's triangle : " + nCrRecursion( 4,2));

        System.out.println();
        System.out.println("Tower of Hanoi using Recursion  : ");
        towerOfHanoi(3,1,2,3);

        System.out.println();
        System.out.println("Quiz1 Question1  : " + f1(1));

        System.out.println();
        System.out.println("Quiz1 Question2  : ");

        int a = 2048, sum = 0;
        foo(a, sum);
        System.out.printf("%d", sum);

        System.out.println();
        System.out.println("Quiz1 Question4  : " + f4(5));

        System.out.println();
        System.out.println("Quiz1 Question5 ");
        count(3);
    }

    //Recursion example1 For section5 Topic 50 (Lets code Recursion)
    public static void fun1(int n) {
        if (n > 0) {
            System.out.print(n + " ");
            fun1(n - 1);
        }
    }

    //Recursion example2 For section5 Topic 50 (Let's code Recursion)
    public static void fun2(int n) {
        if (n > 0) {
            fun2(n - 1);
            System.out.print(n + " ");
        }

        //System.out.println();

    }
    //Recursion example3 For section5 Topic 52 (Let's code Static and Global in Recursion)
    public static int fun3(int n) {

        if (n > 0) {
            return fun3(n - 1) + n;
        }
        return 0;
    }
    //Recursion example4 For section5 Topic 52 (Let's code Static and Global in Recursion)
    public static int fun4(int n) {
        if (n > 0) {
            x++;
            return fun4(n - 1) + x;
        }
        return 0;
    }

    //Tree Recursion example 5 For section 5 Topic 56 (Let's code Tree Recursion)
    public static void funTreeRecursion(int n) {
        if (n > 0) {
            System.out.print(n + " ");
            funTreeRecursion(n - 1);
            funTreeRecursion(n - 1);
        }
    }

    //Indirect Recursion example 6 For section 5 Topic 58 (Let's code Tree Recursion)
    public static void funA(int n) {
        if (n > 0) {
            System.out.print(n + " ");
            funB(n - 1);
        }
    }
    public static void funB(int n) {
        if (n > 1) {
            System.out.print(n + " ");
            funA(n/2);
        }
    }
    //Nested Recursion example 7 For section 5 Topic 60 (Let's code Nested Recursion)
    public static int funNestedRecursion(int n) {
        if(n > 100)
            return n-10;
        else
            return funNestedRecursion(funNestedRecursion(n+11));
    }

    //Sum of n natural numbers using Recursion example 8 of section 5 topic 62
    public static int sumOfNaturalNumbersUsingRecursion(int n)  {
        if (n==0) return 0;
        else
        return sumOfNaturalNumbersUsingRecursion(n-1) + n;
    }

    public static int sumOfNaturalNumbersUsingForLoop(int n)  {
        int s=0;
        for(int i = 0; i<= n;i++)   {
            s = s+i;
        }
        return s;
    }

    //Factorial of n numbers using Recursion example 9 of section 5 topic 64
    public static int factorialOfNumbersUsingRecursion(int n)    {
        if(n<=0)    return 1;
        else return factorialOfNumbersUsingRecursion(n-1) * n;
    }

    public static int factorialOfNumbersUsingForLoop(int n)  {
        int f=1;
        for(int i = 1; i<= n;i++)   {
            f *=i;
        }
        return f;
    }

    //Power recursion ie multiply number m, n times example 10 of section 5 topic 66
    public static int powerUsingRecursion(int m, int n) {
        if(n==0) return 1;
        else
            return powerUsingRecursion(m,n-1) * m;
    }
    //Power recursion for reduced multiplication
    public static int power(int m , int n)  {
        if(n==0) return 1;
        if(n%2 == 0)    {
            return power(m*m, n/2);
        }
        else
            return m * power(m*m, (n-1)/2);
    }
    //Power recursion using for loop
    public static int powerUsingForLoop(int m ,int n)   {
        int p = 1;
        if(n==0) return 1;
        else {
            for(int i=0 ; i< n; i++)    {
                p = m * p;
            }
            return p;
        }
    }
    //Taylor series using recursion example 11 of section 5 topic 68
    public static double taylorSeriesRecursion(int x, int n)   {
        //static variables p and f are initialized as they will be used here
        double result;
        if(n==0) return 1;

        result = taylorSeriesRecursion(x, n-1);
        p = p*x;
        f = f* n;
        return result + (p/f);

    }
    //Taylor series Horner's Rule using Recursion example 12 of section 5 topic 70
    public static double taylorSeriesHornersRuleRecursion(int x, int n) {
        //static variables result is initialized as they will be used here
        if(n==0) return result;
        result = 1 + (result * x)/n;
       return taylorSeriesHornersRuleRecursion(x, n-1);
    }
    //Fibonacci series using Recursion example 13 of section 5 topic 73
    public static int fibonacciSeriesUsingForLoop(int n) {
        int t0=0;
        int t1=1;
        int s = 0;
        if(n<=1)    return n;
        for(int i = 2; i<=n;i++)    {
            s = t0+t1;
            t0=t1;
            t1=s;
        }
        return s;
    }
    public static int fibonacciSeriesUsingRecursion(int n) {
        if(n<=1)    return n;
        return fibonacciSeriesUsingRecursion(n-2) + fibonacciSeriesUsingRecursion(n-1);
    }
    public static int fibonacciSeriesUsingRecursionMemoization(int n) {
         if(n<=1)  {
            fibArray[n] = n;
            return n;
        }
        else    {
           if(fibArray[n-2] == -1) fibArray[n-2] = fibonacciSeriesUsingRecursionMemoization(n-2);
            if(fibArray[n-1] == -1) fibArray[n-1] = fibonacciSeriesUsingRecursionMemoization(n-1);

            return fibArray[n-2] + fibArray[n-1];
        }
    }
    //Combinaton Formula nCr = n!/r!(n-r)! using Recursion example 14 of section 5 topic 75
    public static int nCr(int n, int r)    {
        int num;
        int den;
        num = factorialOfNumbersUsingRecursion(n);
        den = factorialOfNumbersUsingRecursion(r) * factorialOfNumbersUsingRecursion(n-r);
        return num/den;
    }
    public static int nCrRecursion(int n, int r) {
        if(r ==0 || n==r) return 1;
        else
            return nCrRecursion(n-1, r-1) + nCrRecursion(n-1,r);
    }

    //Tower of Hanoi using Recursion example 15 of section 5 topic 77)
    public static void towerOfHanoi(int n, int a, int b, int c)    {
        if(n>0) {
            towerOfHanoi(n-1, a,c,b);
            System.out.printf("(%d,%d)", a,c);
            towerOfHanoi(n-1,b,a,c);
        }
    }

    //Quiz1 question1 Recursion of section5 topic 78
    public static int f1(int n) {
        if (n >= 5) return n;
        n = n + i;
        i++;
        return f1(n);
    }
    //Quiz1 question2 Recursion of section5 topic 78
    public static void foo(int n, int sum)  {
        int k=0; int j=0;
        if(n==0) return;
        k=n%10;
        j=n/10;
        sum = sum + k;
        foo(j, sum);
        System.out.printf("%d", k);
    }
    //Quiz1 question4 Recursion of section5 topic 78
    public static int f4(int n) {
        int x = 1, k;
        if(n==1) return x;
        for(k=1;k<n;++k)    {
            x = x + f4(k) * f4(n-k);
        }
        return x;
    }
    //Quiz1 question5 Recursion of section5 topic 78
    public static void count(int n)  {
        System.out.printf("%d\t", n);
        System.out.printf("%d\t", d);
        d++;
        if(n>1) count(n-1);
        System.out.printf("%d\t", d);
    }
}