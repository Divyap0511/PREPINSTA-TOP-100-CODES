import java.util.Scanner;
public class Reverseofnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hum = sc.nextInt();
        int jum = hum;
        int rno = 0;
        while (jum > 0) {
            int digit = jum % 10;
            jum = jum / 10;
            rno = (rno * 10) + digit;
            if (rno == hum) {
                System.out.println("p");
            }
        }
    }
}