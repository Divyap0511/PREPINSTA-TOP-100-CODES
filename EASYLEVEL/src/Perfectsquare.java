import java.util.Scanner;
public class Perfectsquare {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        int sqrt = (int) Math.sqrt(test);
        int sq = sqrt*sqrt;
        if (sq==test) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}

/*Perfect Square : Number whose square of the sqroot == Original Number. EX. N0:49 ; SQRT: 7 ; SQ:49.*/