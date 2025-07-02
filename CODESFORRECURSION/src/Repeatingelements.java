import java.util.Arrays;

public class Repeatingelements {
        public static void main(String[] args) {
            int grr[] = {5, 6, 4, 8, 9, 10,9};

            Arrays.sort(grr);

            int dist_count=1;
            for (int i = 0; i < grr.length-1; i++) {
                if(grr[i]==grr[i+1]){
                    dist_count++;
                    System.out.println(grr[i]+" : "+dist_count);
                }
            }

        }

    }

