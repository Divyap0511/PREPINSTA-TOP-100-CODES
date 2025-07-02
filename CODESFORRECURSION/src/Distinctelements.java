import java.util.Arrays;
public class Distinctelements {

    public static void main(String[] args) {

        int grr[] = {5, 6, 10, 8, 9, 10,9};
          Arrays.sort(grr);

        int dist_count=1;

        for (int i = 0; i < grr.length-1; i++) {
            boolean flag= false;
                if(grr[i]==grr[i+1]){
                   flag=true;
                }
                if(!flag){
                    dist_count++;
                }
                }
           System.out.print(dist_count);
            }

        }





