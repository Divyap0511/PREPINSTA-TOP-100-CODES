import java.util.Scanner;
public class Powerofnum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        int pow = sc.nextInt();
       if(pow==0){
           System.out.println("1");
       }
        int result = 1;
        for(int i = pow;i>=1;i--){
          result = result*no;
      }
        System.out.println(result);
    }
}
