public class Automorphicnumber {
    public static void main(String[] args){
        int integer=6;
        int square=integer*integer;
        int digit=0;
        if(square>0){
           digit=square%10;
        }
        if(integer==digit){
            System.out.println("Automorphic Number");
        }
        else{
            System.out.println("Not an Automorphic Number");
        }
    }
}

/*Automorphic Number:Number that when squared ends with the number itself is known as the Automorphic Number.
  EX: Num: 5; SQ: 25 ==> Automorphic Number
 */