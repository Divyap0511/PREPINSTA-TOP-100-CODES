import java.util.Scanner;
public class Secondlargestinarr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
          int tem;
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
            if(arr[i]>arr[j]){
               tem = arr[i];
               arr[i]=arr[j];
               arr[j]=tem;
            }
            }
            }
       if(size>0) {
            System.out.print(arr[size-2]);
        }

    }
}
