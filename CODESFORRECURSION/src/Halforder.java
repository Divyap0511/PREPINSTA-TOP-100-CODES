import java.util.Arrays;
import java.util.Scanner;
public class Halforder {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int yrr[]=new int[N];
        for(int i=0;i<N;i++){
            yrr[i]=sc.nextInt();
        }
        Arrays.sort(yrr);
        for(int i=0;i<N/2;i++){
            System.out.print(yrr[i]+" ");
        }
       int temp;
        for(int i=N-1;i>=N/2;i--){
            System.out.print(yrr[i]+" ");
        }

    }
}
