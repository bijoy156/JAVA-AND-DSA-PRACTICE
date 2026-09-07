package Mathematics;

import java.util.Scanner;
public class oddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        System.out.println("the odd numbers are: ");
        printOddNum(num);
        System.out.println("The even numbers are: ");
        printEvenNum(num);
    }
    public static void printOddNum(int num){
        int i = 1;
        while (i<=num) {
            System.out.println(i);
            i=i+2;
            }
        }
    public static void printEvenNum(int num){
        int i = 0;
        while(i<=num){
            System.out.println(i);
            i=i+2;
        }
    }
    }

