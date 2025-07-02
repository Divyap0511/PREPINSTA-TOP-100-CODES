
import java.util.Scanner;
public class Zerotoone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int NUMBER [] = new int[6];

        for(int i =0;i<6;i++){
            NUMBER[i] = sc.nextInt();
        }

        for(int i=0;i<6;i++){
            if(NUMBER[i]==0){
                NUMBER[i]=1;
            }
            System.out.print(NUMBER[i]+"");
        }
    }
}
