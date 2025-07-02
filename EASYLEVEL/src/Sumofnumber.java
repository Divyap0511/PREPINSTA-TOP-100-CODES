import java.util.Scanner;
public class Sumofnumber {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int t=0;
        for(int i=1;i<=h;i++)
            t = t+i;
            System.out.print(t+" is the sum of first "+h+" natural numbers");

    }
}
