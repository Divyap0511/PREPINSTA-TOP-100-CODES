public class Reversearr {
    public static void main(String[] args){
        int arr[]={1,2,3,4,5,6};
        int prr[]= new int[6];

        for(int i=0;i<arr.length;i++){
            prr[i]=arr[arr.length-i-1];
        }
        System.out.print("The Original array is:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
      System.out.print("The Reversed array is:");
        for(int i=0;i<prr.length;i++){
            System.out.print(prr[i]+" ");
        }

    }
}
