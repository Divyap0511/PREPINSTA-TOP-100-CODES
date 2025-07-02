public class Friendlypair {
    public static void main(String[] args){
        int num1=30;
        int num2=140;
       int sum1=0;
               int sum2=0;
        for(int i=1;i<num1;i++){
            if(num1%i==0){
               sum1=(sum1+i)/num1;
            }
        }
        for(int i=1;i<num2;i++){
            if(num2%i==0){
                sum2=(sum2+i)/num2;
            }
        }
        if(sum1==sum2){
            System.out.println(num1+","+num2+" are friendly pair");
        }
        else {
            System.out.println(num1+","+num2+" are not a friendly pair");
        }
    }
}

/* Friendly Pair
The numbers whose ( sum of divisors ) / number ratio is same are known as Friendly Pair Numbers.
ex: 6,12: sum of factors of 6/6 = 1 and sum of factors of 12/12 =1.
 */