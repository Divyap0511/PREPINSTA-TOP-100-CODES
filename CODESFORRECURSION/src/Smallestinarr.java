import java.util.Scanner;

public class Smallestinarr {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int size = sc.nextInt();
            int arr[] = new int[size];

            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }

            int max = arr[0];
            int min = arr[0];

            for (int i = 1; i < size; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
                else{
                    min = arr[i];
                }
            }
            System.out.println(min + " is the min"+max+"is the max");

        }
    }


