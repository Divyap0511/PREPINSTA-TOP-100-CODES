import java.util.Scanner;
public class Powerofnum {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int base=scan.nextInt();
        int pow=scan.nextInt();
        int mul=base;
        for (int i=1 ; i<pow ; i++){
            mul = base * mul;
        }
        System.out.println("The powered value is : "+mul);
    }
}
