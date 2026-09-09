package Mathematics;

import java.util.Scanner;
public class Digit_Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = scanner.nextInt();
        int sum = sumOfDigits(num);
        System.out.println("Sum of the digits: " + sum);
    }
    public static int sumOfDigits(int num){
       int sum = 0;
       while(num>0){
           sum = sum +(num%10);
           num = num/10;
       }
       return sum;
    }
}