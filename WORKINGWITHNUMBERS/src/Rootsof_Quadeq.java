import java.util.Scanner;
public class Rootsof_Quadeq {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = (b*b)-(4*a*c);
        if(d>0){
            double g = -b+(Math.sqrt(d)/2*a);
            double k = -b-(Math.sqrt(d)/2*a);
            System.out.println("roots are real and different "+g+" and "+k);
        }
        if(d==0){
            double g = -b+(Math.sqrt(d)/2*a);
            System.out.println("roots are real and same "+g+" and "+g);
        }
    }
}
