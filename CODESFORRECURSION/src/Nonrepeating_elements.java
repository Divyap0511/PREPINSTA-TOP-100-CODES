import java.util.Arrays;
public class Nonrepeating_elements {
    public static void main(String[] args) {
        int temparr[] = {7, 9, 5, 4, 3, 7};

        Arrays.sort(temparr);

        for (int i = 0; i < temparr.length; i++) {

            if (temparr[i] == -1) {
                continue;
            }

            int count = 1;

            for (int j = i + 1; j < temparr.length; j++) {
                if (temparr[i] == temparr[j]) {
                    count++;
                    temparr[j] = -1;
                }
            }

            if (count == 1) {
                System.out.print(temparr[i] + " ");
            }
        }
    }
}
