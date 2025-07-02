import java.util.Scanner;
public class Quadrant {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
       if(X>0 && Y>0)
           System.out.println(X+"and"+Y+"are in 1st Quadrant");

         else if(X<0 && Y>0)
            System.out.println(X+"and"+Y+"are in 2nd Quadrant");

       else if(X>0 && Y<0)
            System.out.println(X+"and"+Y+"are in 4th Quadrant");

        else if (X<0 && Y<0)
            System.out.println(X+"and"+Y+"are in 3rd Quadrant");

        else if(X==0 && Y==0)
           System.out.println(X+"and"+Y+"are at Origin");

        else if(X!=0 && Y==0)
           System.out.println(X+"and"+Y+"are on X axis");
       else if(X==0 && Y!=0)
           System.out.println(X+"and"+Y+"are on Y axis");

    }
}
