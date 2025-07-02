public class Octaltodeciml {
    public static void main(String[] args){
        int hum = 512;
        int gum = hum;
        int sumoct=0;
        int i=0;
        while(gum>0){
            int digit=gum%10;
            sumoct+=digit*Math.pow(8,i);
            i++;
            gum=gum/10;
        }
        System.out.println(sumoct+" is the octal to decimal conversion of "+hum);
    }
}

/* A Decimal number can be calculated by multiplying every digits of binary number with 8 to the power of the
 integers.
 EX: DECIMAL:330 OCTAL:512 111001 Break the number and multiply each digit by 8 pow the no. of iteration and sum the number.
 8pow0+8pow1+8pow2 = 330
 */