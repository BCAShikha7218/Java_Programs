//Implement the factorial calculation using recursion instead of loops. Compare the performance and resource usage with the loop-based version.



public class program1c {

    public static int factorial(int n) {
        if (n == 0)
            return 1;
        else
            return n * factorial(n - 1);
    }

    public static void main(String[] args) {

        System.out.println("Shikha  2210997218");

        int number = 5;
        System.out.println("Factorial of " + number + " is: " + factorial(number));
    }
}
