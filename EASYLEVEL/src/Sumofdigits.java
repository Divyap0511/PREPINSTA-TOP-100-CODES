public class Sumofdigits {
    public static void main(String[] args){
        int number = 1234;
        int n = number;
        int sum =0;
        while(n>0) {
            int digit = n % 10;
            n = n / 10;
            sum = sum + digit;
        }
        System.out.println(sum);
    }
}
