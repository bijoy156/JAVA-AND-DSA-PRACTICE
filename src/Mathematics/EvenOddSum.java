package Mathematics;

import java.util.Scanner;
public class EvenOddSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int sum = sc.nextInt();
        int evenSum = 0;
        for(int i=0; i<=sum; i=i+2) {
            evenSum = evenSum + i;
        }
        System.out.println(evenSum);
        int oddSum = 0;
        for(int i=1; i<=sum; i=i+2){
            oddSum = oddSum+i;
        }
        System.out.println(oddSum);
        sc.close();
    }
}

