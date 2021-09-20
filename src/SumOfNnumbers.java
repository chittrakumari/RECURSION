import java.util.Scanner;

public class SumOfNnumbers {
    int SumOfDigits(int n){
        if(n==0){
            return 0;
        }
        return SumOfDigits(n-1)+n;
    }
    public static void main(String[] args) {
        SumOfNnumbers obj=new SumOfNnumbers();
        Scanner sc=new Scanner(System.in);
        int ans=obj.SumOfDigits(sc.nextInt());
        System.out.println(ans);
    }
}
