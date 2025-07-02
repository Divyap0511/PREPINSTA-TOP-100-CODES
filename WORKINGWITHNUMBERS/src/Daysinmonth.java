import java.util.Scanner;

public class Daysinmonth {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();

        if(month==2){
            int year = sc.nextInt();
            if(year%400==0 || (year%4==0 && year%100!=0)){
                System.out.println("the year is leap thus the month has 29 days");
            }
            else{
                System.out.println("28 days");
            }
        }
        if(month ==1 || month ==3 || month ==5 || month ==7 || month ==8 || month ==10 || month ==12 ){
            System.out.println("31 days");
        }
        if(month ==4 || month ==6 || month ==9 || month ==11){
            System.out.println("30 days");
        }
    }

}
