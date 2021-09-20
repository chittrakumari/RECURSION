import java.util.Scanner;

public class SumOfDigits {
    int SumOfDigits(int n){
        if(n==0){
            return 0;
        }
        return SumOfDigits(n-1)+n;
    }
    public static void main(String[] args) {
        SumOfDigits obj=new SumOfDigits();
        Scanner sc=new Scanner(System.in);
        int ans=obj.SumOfDigits(sc.nextInt());
        System.out.println(ans);
    }
}
