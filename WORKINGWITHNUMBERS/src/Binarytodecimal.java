import java.util.Scanner;
public class Binarytodecimal
{
    public static void main(String args[])
    {
        int binary = 111001;
        int decimal = 0;
        int n = 0;
        while(binary > 0)
        {
            int digit= binary%10;
            decimal += digit*Math.pow(2, n);
            binary = binary/10;
            n++;
        }
        System.out.println("The binary to decimal conversion is: "+decimal);

    }
}

/* A Decimal number can be calculated by multiplying every digits of binary number with 2 to the power of the
 integers.
 EX: DECIMAL:57 BINARY: 111001 Calculate 1's place with corresponding power to 2 and sum the number.
 2pow0+2pow3+2pow5+2pow6 = 57
 */