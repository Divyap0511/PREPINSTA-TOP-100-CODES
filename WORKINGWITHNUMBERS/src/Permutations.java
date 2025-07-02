public class Permutations {
    public static void main(String [] args){
        int students=9;
        int chairs=5;
        int fsc=1;
        int fac=1;
        int r =students-chairs;
        for(int i=students;i>=1;i--){
            fsc=fsc*i;
        }
        for(int i=r;i>=1;i--){
            fac=fac*i;
        }
        int per=fsc/fac;
        System.out.println(per+ " permutations are possible");
    }
}

/*nPr= n!/(n-r)! */