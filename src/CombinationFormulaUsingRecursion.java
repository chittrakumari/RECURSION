import java.util.Scanner;

public class CombinationFormulaUsingRecursion {
    int NCR(int n,int r) {
        if (n == r || r == 0) {
            return 1;
        }
        return NCR(n-1,r-1)+ NCR(n-1,r) ;
    }
    public static void main(String[] args) {
        CombinationFormulaUsingRecursion obj=new CombinationFormulaUsingRecursion ();
        Scanner sc=new Scanner(System.in);
        int ans=obj.NCR(sc.nextInt(),sc.nextInt());
        System.out.println(ans);

    }
}
