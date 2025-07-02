
public class Lcm {
    public static void main(String[] args) {
        int no1=12;
        int no2=14;
        int hcf=1;
        int lcm=0;
        for (int i = 1; i <= Math.min(no1, no2); i++) {
                if (no1 % i == 0 && no2 % i == 0) {
                    hcf = i;
                }
            }
        lcm=(no1*no2)/hcf;
        System.out.println(lcm+" is the LCM of "+no1+","+no2);

        }
    }

