//Program to print GCD of a number using recursion.

import java.util.Scanner;

public class RecursiveGCDCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int no1=sc.nextInt();
        int no2=sc.nextInt();
        var maximum=Math.max(no1,no2);
        var minimum=Integer.sum(no1,no2)-maximum;
        System.out.println("Greatest Commom Divisor of "+no1+" and "+no2+" "+GCD(maximum,minimum));
    }
    public static int GCD(int max,int min){
        int remainder=max%min;
        if(remainder==0)
        {
            return min;
        }
        else{
            return GCD(min,remainder);
        }
    }
}
