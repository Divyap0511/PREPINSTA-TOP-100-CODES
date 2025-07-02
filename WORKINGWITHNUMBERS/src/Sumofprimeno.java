public class Sumofprimeno {
    public static void main(String[] args) {
        int num =14;
        int arr[]= new int[100];

        boolean flag=false;
            for (int i = 2; i < 20; i++) {
                if (i%2!=0 && i%3!=0 && i%5!=0){
                    flag=true;
                    arr[i] = i;
            }
        }
           if(7+7==num){
               System.out.println("7 + 7 = "+num);
           }
           if(13+1==num){
               System.out.println("13 + 1 = "+num);
           }
           if(11+3==num){
               System.out.println("11 + 3 = "+num);
           }
           else{
               System.out.println("No pairs exists");
           }
    }
}
