import java.util.Scanner;
public class PrimeNumbersPart2 {
    public static void main(String[] args) {
        int numbersToPrint = 20;
        int count = 0;
        int N = 2;
        System.out.println(" Số nguyên tố nhỏ hơn 100 là:");
        while (N < 100) {
            if (isPrime(N)) {
                System.out.print(N + " ");
                count++;
            }
            N++;
        }
    }
    public static boolean isPrime(int number) {
        if (number < 2) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
