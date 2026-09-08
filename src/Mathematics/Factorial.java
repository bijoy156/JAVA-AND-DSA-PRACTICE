package Mathematics;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number: ");
        int num = input.nextInt();
        long factorial = fact(num);
        System.out.println(factorial);
    }

    public static long fact(int num){
        long Fact = 1;
        int i = 2;
        while(i<=num){
            Fact = Fact*i;
            i++;
        }
        return Fact;
    }
}