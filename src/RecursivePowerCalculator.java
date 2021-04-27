import java.util.Scanner;

public class RecursivePowerCalculator {
    public static void main(String[] args) {
        System.out.println("Enter base and exponent:");
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        int b=sc.nextInt();
        if( a<0 || b<0){
            System.out.println("Please enter numbers greater than zero");
        }
        else {
            System.out.println("The value is"+" "+PowerCalculator(a,b));
        }
    }
    public static int PowerCalculator(int base,int exponent){
        if(exponent==1){
            return base;
        }

        return base*PowerCalculator(base, exponent-1);
    }
}
