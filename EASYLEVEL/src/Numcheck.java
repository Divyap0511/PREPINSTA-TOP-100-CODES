import java.util.Scanner;
public class Numcheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num==0){
            System.out.println("number is equal to 0");
        }
        else{
            if(num>0){
                System.out.println("number is positive");
            }
            else{
                System.out.println("number is negative");
            }
        }
    }
}