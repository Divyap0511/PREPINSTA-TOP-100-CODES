import java.util.Scanner;

public class Xdivisors {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter lower bound: ");
        int lowerb = sc.nextInt();
        System.out.print("Enter upper bound: ");
        int upperb = sc.nextInt();
        System.out.print("Enter number of divisors: ");
        int div = sc.nextInt();
        for (int i = lowerb; i <= upperb; i++) {
            int count = 0;
            for (int N = 1; N * N <= i; N++) {
                if (i % N == 0) {
                    count++;
                    if (N != i / N) {
                        count++;
                    }
                }
            }

            if (count == div) {
                System.out.println(i + " has exactly " + div + " divisors.");
            }
        }
    }
}
