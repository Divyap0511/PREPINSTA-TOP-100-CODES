import java.util.Scanner;
public class Armstrong {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int gom = 153;
        int dum = gom;
        int s,d =0;
        while(dum>0){
            int dig = dum%10;
            dum = dum/10;
            s = dig*dig*dig;
            d = d+s;
        }
        if(d==gom){
            System.out.println(gom+ " is armstrong number");
        }
    }
}
