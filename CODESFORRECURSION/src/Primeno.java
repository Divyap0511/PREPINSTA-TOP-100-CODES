public class Primeno {
    public static void main(String[] args) {
        for (int n = 2; n < 100; n++) {
            boolean isPrime = true;

            if (n == 2) {
                isPrime = true;
            } else if (n % 2 == 0) {
                isPrime = false;
            } else {
                for (int i = 3; i * i <= n; i += 2) {
                    if (n % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            if (isPrime) {
                System.out.print(n + " ");
            }
        }
    }
}
