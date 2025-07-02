import java.util.Scanner;
public class Sumofsubsets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = 3;
        int drr[] = new int[N];
        for(int i =0;i<N;i++){
            drr[i]= sc.nextInt();
        }
        int temp=0;
        for (int i = 0; i < N; i++) {
            temp=temp+drr[i];
        }
        System.out.print(temp+" ");
        for (int i = 0; i <drr.length; i++) {
            int sum = 0;
            for (int j = i+1; j <drr.length; j++) {
                sum = drr[i]+drr[j];
                System.out.print(sum+" ");
            }
            System.out.print(drr[i]+" ");
        }
        System.out.print("0");

    }
}

/* System.out.print((drr[0]+drr[1]+drr[drr.length-1])+" ");
        System.out.print((drr[0]+drr[drr.length-1])+" ");

        for(int i =0;i<N;i++){
            System.out.print(drr[i]+" ");
        }
        for(int i =0;i<N-1;i++){
            int sum1 = drr[i]+drr[i+1];
            System.out.print(sum1+" ");
        }

        ALTERNATE CODE */