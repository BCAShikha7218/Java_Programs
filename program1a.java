//Write a Java program that prints all the prime numbers between 1 and 100.Implement this using both for and while loops.


public class program1a {

    public static void main(String[] args) {

	System.out.println("Shikha  2210997218");

        System.out.println("Prime numbers between 1 and 100 using FOR LOOP:");
        for(int i = 2; i <= 100; i++) {
            boolean isPrime = true;
            for(int j = 2; j <= i/2; j++) {
                if(i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\n-------------------------------------------------"); 
        System.out.println("Prime numbers between 1 and 100 using WHILE LOOP:");
        int num = 2;
        while(num <= 100) {
            boolean isPrime = true;
            int divisor = 2;
            while(divisor <= num/2) {
                if(num % divisor == 0) {
                    isPrime = false;
                    break;
                }
                divisor++;
            }
            if(isPrime) {
                System.out.print(num + " ");
            }
            num++;
        }
    }
}