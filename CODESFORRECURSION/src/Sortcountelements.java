import java.util.Arrays;
public class Sortcountelements {

    public class FrequencyElements {
        public static void main(String[] args) {
            int[] grr = {5, 6, 4, 7, 6, 9, 6};
            int[] count = new int[grr.length];


            Arrays.sort(grr);

            int countIndex = 0;
            for (int i = 0; i < grr.length; i++) {
                if (i == 0 || grr[i] != grr[i - 1]) {
                    count[countIndex] = 1;
                } else {
                    count[countIndex]++;
                }

                if (i == grr.length - 1 || grr[i] != grr[i + 1]) {
                    System.out.println(grr[i] + ": " + count[countIndex]);
                    countIndex++;
                }
            }
        }
    }

}
