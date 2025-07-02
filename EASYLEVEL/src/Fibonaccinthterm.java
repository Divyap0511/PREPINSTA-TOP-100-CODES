public class Fibonaccinthterm {
    public static void main(String[] args){
        int f=5;
        int n1=0;
        int n2=1;
        int n3;
        System.out.print(n1+""+n2);
        for(int i=2;i<=f;i++){
            n3=n1+n2;
            n1=n2;
            n2=n3;
            System.out.print(""+n3+"");
        }
    }
}
