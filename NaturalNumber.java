public class NaturalNumber {

    //print number in ascending order
    public static void printNum(int n){
        if(n == 1){
            System.out.println(1);
            return;
        }
        printNum(n - 1);
        System.out.print(n + " ");
    }


    //print factorial

    public static int factorial(int n){
        if(n == 0){
            return 1;
        }
        return n * factorial(n - 1);
    }


    //Sum of n numbers

    public static int Sum(int n){
        if(n == 1){
            return 1;
        }
        return n + Sum(n - 1);
    }


    //Fibonacci Series

    public static int fibonacci(int n){
        if(n == 0 || n == 1){
            return n;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        //printNum(1);
        System.out.println(fibonacci(6));
    }
}
