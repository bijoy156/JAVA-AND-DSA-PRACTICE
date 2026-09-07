package Mathematics;

import java.util.Scanner;
public class Table {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your number: ");
        long num = scanner.nextLong();
        multiplicationTable(num);
    }
    public static void multiplicationTable(long num){
        long i = 1;
        while (i<=10){
            System.out.println(num + "x" + i + "=" + (num*i));
            i ++;
        }
    }
}