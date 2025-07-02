public class Ocuurenceofdigit {
    public static void main(String[] args){
        int n = 898989;
        int d = 9;
        int c=0;
        while(n>0){
            int id = n%10;
            if(id==9){
                c++;
            }
            n=n/10;

        }
        System.out.println(c+" is the total number of times a 9 occured in the number ");
    }
}
