package Mathematics;

import java.util.Scanner;
public class Prime{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the number: ");
        int num = scanner.nextInt();
        boolean prime = checkPrime(num);
    }
    public static boolean checkPrime(int num) {
        int i = 2;
        while (i < num) {
            if (num % i == 0) {
                System.out.println("number is not prime");
                return false;
            }
            i++;
        }
        System.out.println("Number is prime ");
        return true;
    }
}
