
public class Hcf {
    public static void main(String[] args) {
      int no1=36;
      int no2=60;
      int hcf=1;
        for (int i = 1; i <= Math.min(no1, no2); i++) {
            if (no1 % i == 0 && no2 % i == 0) {
                hcf = i;
            }
        }
        System.out.println(hcf+" is the hcf of"+no1+","+no2);
    }
}

/* GCD(Greatest Common Divisor) or HCF(Highest Common Factor) of two numbers is the number which is the largest
 common factor of both numbers. It is also referred as Greatest Common Factor(GCF), Greatest Common Measure(GCM),
 Highest Common Divisor(HCD).
 */