import java.util.Scanner;
public class Last_nonzero_fact {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int fact = sc.nextInt();
        int prod = 1;
        for(int i = fact;i >= 1;i--){
            prod=prod*i;
        }
        System.out.println(prod+" is the factorial of the number "+fact);
        while(prod%10==0) {
            prod = prod / 10;
        }
        System.out.println((prod%10)+ " is the last non-zero digit of the factorial value ");
    }
}
