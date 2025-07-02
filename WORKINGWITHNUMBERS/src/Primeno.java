public class Primeno {
    public static void main(String[] args) {
        System.out.println("Prime numbers from 1 to 100:");

        for (int n = 1; n <= 100; n++) {
            if (n < 2) continue; // Skip 0 and 1

            // Check divisibility
            boolean isPrime = true;

            while (n % 2 == 0) { // Handle 2 separately
                if (n == 2) {
                    isPrime = true;
                    break;
                }
                isPrime = false;
                break;
            }

            int p = 3;
            while (p * p <= n) { // Check odd factors up to sqrt(n)
                if (n % p == 0) {
                    isPrime = false;
                    break;
                }
                p += 2; // Skip even numbers
            }

            if (isPrime) {
                System.out.print(n + " ");
            }
        }
    }
}
