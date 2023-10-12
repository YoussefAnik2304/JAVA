import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static int fibo(int n) {
        if (n < 3) return n;
        return fibo(n - 1) + fibo(n - 2);
    }

    public static long fibo_improved(int n, HashMap<Integer, Long> memo) {
        if (memo.containsKey(n)) {
            return memo.get(n);
        }
        if (n <= 1) {
            return 1;
        }
        long fiboValue = fibo_improved(n - 1, memo) + fibo_improved(n - 2, memo);
        memo.put(n, fiboValue);
        return fiboValue;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write a number: ");
        int number = scanner.nextInt();

        long start = System.nanoTime();
        int f1 = fibo(number);
        long end = System.nanoTime();
        System.out.printf("Fibonacci of %d is %d%n", number, f1);
        System.out.printf("Execution time for fibo: %d seconds%n", (end - start)/ 1000000);

        start = System.nanoTime();
        HashMap<Integer, Long> memo = new HashMap<>();
        long f2 = fibo_improved(number, memo);
        end = System.nanoTime();
        System.out.printf("Fibonacci of %d (improved) is %d%n", number, f2);
        System.out.printf("Execution time for fibo_improved: %d seconds%n", (end - start)/ 1000000);
    }
}
