class Abundantnumber {
    public static void main(String[] args){
        int j=12;
        int sum=0;
        for(int i=1;i<j;i++){
            if(j%i==0)
            {
                sum=sum+i;
            }

        }
        if(sum>j){
            System.out.print("Abundant Number");
        }
        else{
            System.out.print("Abundant Number");
        }
    }
}

/* ABUNDANT NO: IF THE SUM OF THE FACTORS OF N IS GREATER THAN N. N=18;F=1+2+3+6+9=21; 21>18.*/