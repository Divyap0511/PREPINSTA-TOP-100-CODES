public class Reversenum {
    public static void main(String[] args){
        int base = 1234;
        int copy= base;
        int rno=0;
        while(copy>0){
            int digit = copy%10;
            copy = copy/10;
            rno = (rno*10)+digit;
        }
        System.out.print(rno);
    }
}
