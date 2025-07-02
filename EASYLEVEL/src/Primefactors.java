import java.util.Scanner;
public class Primefactors {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number: ");
        int y=sc.nextInt();
        while(y%2==0){
            y=y/2;
            System.out.print("2 ");
        }
        for(int i=3;i<=100;i++){
            if(y%i==0){
                y=y/i;
                System.out.print(i+" ");
            }

        }
    }
}
