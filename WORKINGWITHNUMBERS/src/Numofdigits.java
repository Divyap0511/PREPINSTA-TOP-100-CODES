public class Numofdigits {
    public static void main(String[] args){
        int num = 123456;
        int count=0;
       while (num>0){
            int digit=num%10;
            num=num/10;
            count++;
        }
        System.out.println(count+"is the total number of digits in the number 123456");
    }
}
