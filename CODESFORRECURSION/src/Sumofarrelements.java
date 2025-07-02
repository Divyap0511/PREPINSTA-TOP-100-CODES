import java.util.Scanner;
public class Sumofarrelements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int si=sc.nextInt();

        int prr[] = new int[si];

        for(int i=0;i<si;i++){
            prr[i]=sc.nextInt();
        }
          int temp=0;
        for (int i = 0; i < si; i++) {
            temp=temp+prr[i];
        }
        System.out.print(temp+"is the sum of array elemnts");
    }
}