import java.util.Arrays;
public class Frequency_elements {
    public static void main(String[] args) {
        int grr[] = {5, 6, 4, 7, 6, 9, 6};
        for (int i = 0; i < grr.length; i++) {

            if (grr[i] == -1) {
                continue;
            }

            int count = 1;

            for (int j = i + 1; j < grr.length; j++) {
                if (grr[i] == grr[j]) {
                    count++;
                    grr[j] = -1;
                }
            }
            System.out.println(grr[i] + ":" + count);

        }
    }
}
