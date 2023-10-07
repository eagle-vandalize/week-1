public class ArrayManipulation4 {
    public static int fibonacci(int n) {
        if (n <= 1)
            return n;
        else
            return fibonacci(n-1) + fibonacci(n-2);
    }

    public static void main(String[] args) {
        int n = 6;
        // we have to use a loop to print each recursion call 
        
        for(int i=0;i<=n;i++){
            int result = fibonacci(i);
            System.out.println(result);
        }
        //int result = fibonacci(n);
        //System.out.println("The Fibonacci number at position " + n + " is: " + result);
    }
}


