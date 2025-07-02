import java.util.Scanner;
public class Greatestof3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int p1 =sc.nextInt();
        int p2 =sc.nextInt();
        int p3 =sc.nextInt();
        if(p1>p2 && p1>p3){
            System.out.println(p1+" is greatest");
        }
        if(p2>p1 && p2>p3){
            System.out.println(p2+" is greatest");
        }
        if(p3>p1 && p3>p2){
            System.out.println(p3+" is greatest");
        }



    }
}
