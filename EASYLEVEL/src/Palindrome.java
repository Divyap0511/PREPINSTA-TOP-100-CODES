import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int yu = sc.nextInt();
        int hu = yu;
        int rno = 0;
        while(hu > 0) {
            int digit = hu % 10;
            hu = hu/10;
            rno = (rno*10)+ digit;
        }
        if(rno==yu){
            System.out.println(yu+ " is palindrome" );
        }
    }
}
