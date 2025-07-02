import java.util.Scanner;
public class Strongnumber {
    public static void main(String[] args) {
        int gyu = 145;
        int guy= gyu;
        int sum=0;
        while(guy>0){
            int prod=1;
            int dig= guy%10;
            for(int i=dig;i>=1;i--){
                prod=prod*i;
            }
            sum=sum+prod;
            guy=guy/10;
        }
        if(sum==gyu){
            System.out.println(gyu+" is a strong number");
        }
        else{
            System.out.println(gyu+" is not a strong number");
        }
    }
}

/* Strong Number
A Number that can be represented as the sum of the factorial of it's individual digits is known as a Strong Number.
Example
Input : 145
Output : Yes, it's a strong number
Explanation : Number = 145
145 = 1! + 4! + 5!
145 = 1 + 24 + 120
output number  = 145.
 */