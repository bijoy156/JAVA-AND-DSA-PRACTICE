import java.util.Scanner;
public class Operators {
    public static int showResult() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the Number: ");
        int firstNum = input.nextInt();
        return firstNum;
    }
    public static void main(String[] args) {
        int firstNum = showResult();
        int secNum = showResult();
        int sum = firstNum + secNum;
        System.out.println("The sum of two numbers: " + sum);
        int minus = firstNum - secNum;
        System.out.print("substraction of two numbers: " + minus);
    }
}
