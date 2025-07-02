class Main {
    public static void main(String[] args) {
        int j=24;
        int i=j;
        int sum=0;
        while(j>0){
            int digit=i%10;
            sum=sum+digit;
            i=i/10;
        }
        if(j%sum==0){
            System.out.println("Harshad Number");
        }
        else{
            System.out.println("Not a Harshad Number");
        }
    }
}
/* HARSHAD NO: A NUMBER THAT IS DIVISIBLE BY SUM OF ITS DIGITS. EX: NO.:21; 21/(2+1)=7 */