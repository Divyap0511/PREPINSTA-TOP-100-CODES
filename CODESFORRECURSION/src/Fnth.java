public class Fnth {
    public static void main(String[] args){
        int N = 4;
        int currentnum=1;
        int sum=0;
        for (int i = 1; i <= N; i++) {
            int prod = 1;
            for (int j = 0; j < i; j++) {
               prod *= currentnum;
                currentnum++;
            }
            sum += prod;
        }

        System.out.println("F("+N+") ="+sum);
    }
}
