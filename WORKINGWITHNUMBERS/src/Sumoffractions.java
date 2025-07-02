public class Sumoffractions {
    public static void main(String[] args) {
        int num1 = 1;
        int deno1 = 3;
        int num2 = 3;
        int deno2 = 9;
        int lcm = 1;
        int hcf = 0;

        if (deno1 > deno2) {
            for (int i = 1; i <= deno1; i++) {
                if (deno1 % i == 0 && deno2 % i == 0) {
                    hcf = i;
                }
            }
        } else {
            for (int i = 1; i <= deno2; i++) {
                if (deno1 % i == 0 && deno2 % i == 0) {
                    hcf = i;
                }
            }
        }
        lcm = (deno1 * deno2) / hcf;

        int newNum1 = (num1 * lcm) / deno1;
        int newNum2 = (num2 * lcm) / deno2;
        int sumNum = newNum1 + newNum2;

        for(int i =1;i<=9 && i<=6 ;i++){
            if(lcm%i==0 && sumNum%i==0){
                int numer = sumNum/i;
                int denom = lcm/i;
                System.out.println(numer+"/"+denom);
            }
        }
    }
}
