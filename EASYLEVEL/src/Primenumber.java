import java.util.Scanner;
public class Primenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int j = sc.nextInt();
        int h = sc.nextInt();
        for (int i = 2; i <= h; i++) {
            if (i%2!= 0) {
                System.out.println(i + "");
            }
        }
    }
}

/* Prime factorization is a way of expressing a number as a product of its prime factors. A prime number is a number that has exactly two factors, 1 and the number itself.
Example :
Input : 12
Output : 2 2 3
 */