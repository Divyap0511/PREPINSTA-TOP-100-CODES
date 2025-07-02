public class Perfectnumber {
    public static void main(String[] args){
        int s=28;
        int gum=0;
        for(int i=1;i<s;i++){
            if(s%i==0){
                gum+=i;
            }
        }
        if(gum==s){
            System.out.println("Perfect Number !");
        }
        else{
            System.out.println("Not a Perfect Number !");
        }
    }
}

/*Perfect Number
A Number that can be represented as the sum of it's factors except the number itself is known as the Perfect Number.
Let's try and understand it better using an example
Example
Input : 6
Output : Yes, It's a Prefect Number
Explanation : Number = 6
Factors of 6 except 6 are 1, 2 and 3.
When we add the three we get 6 itself. Therefore, it's a Perfect Number.
As mentioned above, 6 is a perfect number as it can be represented as the sum of it's factors except the number itself.
*/