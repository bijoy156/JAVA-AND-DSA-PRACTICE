package Operations;

import java.util.Scanner;
public class swapping {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Value of a before Operations.swapping: ");
        int a = input.nextInt();
        System.out.print("Value of b before Operations.swapping: ");
        int b = input.nextInt();
        int c = a;
        a = b;
        b = c;
        System.out.println("Value of a after Operations.swapping: " +a);
        System.out.print("Value of b after Operations.swapping: " +b);
    }
}

