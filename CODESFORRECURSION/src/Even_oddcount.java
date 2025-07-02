public class Even_oddcount {
    public static void main(String[] args) {
        int trr[] = {101, 200, 301, 400, 501};
        int tir[] = new int[trr.length];
        int tri[] = new int[trr.length];
        int evencount = 0;
        int oddcount = 0;


        for (int i = 0; i < trr.length; i++) {
            if (trr[i] % 2 == 0) {
                tir[evencount++] = trr[i];
            } else {
                tri[oddcount++] = trr[i];
            }
        }


        System.out.print("Even elements count is " + evencount + " and elements are: ");
        for (int i = 0; i < evencount; i++) {
            System.out.print(tir[i] + " ");
        }

        System.out.println();

        System.out.print("Odd elements count is " + oddcount + " and elements are: ");
        for (int i = 0; i < oddcount; i++) {
            System.out.print(tri[i] + " ");
        }
    }
}
