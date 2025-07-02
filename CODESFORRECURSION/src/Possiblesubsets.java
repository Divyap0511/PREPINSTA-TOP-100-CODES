import java.util.Scanner;
public class Possiblesubsets {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = 3;
        int drr[] = new int[N];
        for(int i =0;i<N;i++){
            drr[i]= sc.nextInt();

        }
        for (int i = 0; i <drr.length-1; i++) {
            for (int j = i+1; j <drr.length-1; j++) {
                System.out.println(drr[i]+"  "+drr[j]+"  "+drr[j+1]);
            }
        }
        for (int i = 0; i <drr.length; i++) {
            for (int j = i+1; j <drr.length; j++) {
                System.out.println(drr[i]+"  "+drr[j]);
            }
            System.out.println(drr[i]+"  ");
        }
    }
}
