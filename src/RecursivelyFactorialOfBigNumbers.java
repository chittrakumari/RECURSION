import java.math.BigInteger;
import java.util.Scanner;

public class RecursivelyFactorialOfBigNumbers {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        BigInteger no=sc.nextBigInteger();
        BigInteger response=factorialOfBigNumbers(no);
        System.out.println("Factorial of "+no+" "+response);
        System.out.println(response.toString().length());
    }
    public static BigInteger factorialOfBigNumbers(BigInteger number){
        if(BigInteger.ONE==number || BigInteger.ZERO==number){
            return BigInteger.ONE;
        }
        return number.multiply(factorialOfBigNumbers(number.subtract(BigInteger.ONE)));

    }
}
