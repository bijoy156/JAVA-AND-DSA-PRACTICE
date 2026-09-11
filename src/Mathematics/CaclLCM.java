package Mathematics;

import java.util.Scanner;
public class CaclLCM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        int first = scanner.nextInt();
        System.out.print("Enter your second number: ");
        int second = scanner.nextInt();
        int lcm = LCM(first , second);
        System.out.println("the LCM is: " + lcm);
    }
    public static int LCM(int first, int second){
        int i = 1;
        while(i<=second){
            int factor = first * i;
            if(factor % second == 0){
                return factor;
            }
            i ++;
        }
        return 0;
    }
}
