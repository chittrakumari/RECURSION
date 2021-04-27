/*
Recursion:
1.Function should call itself.
2.Input should be modified in such a way that base condition is satisfied.
 */

//Program to print factorial of a number using recursion.


import java.util.Scanner;

public class RecursiveFactorialCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int no = sc.nextInt();
        if (no < 0) {
            System.out.println("Please enter a number greater than 0");
        } else {
            System.out.println("factorial of " + no + " =" + factorial(no));
        }
    }
    public static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }

        //Head Recursion(After faction has called itself some task or operation is left.
        return n*factorial(n-1);
    }
}
