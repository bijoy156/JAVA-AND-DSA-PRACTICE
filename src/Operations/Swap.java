package Operations;

import java.util.Scanner;
public class Swap{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Enter the value of a before Operations.swapping: ");
        int a = scanner.nextInt();
        System.out.print("Enter the Value of b before Operations.swapping: ");
        int b = scanner.nextInt();
        int c = a;
        a = b;
        b = c;
        System.out.println("SWAPPING DONE....");
        System.out.println("value of a after Operations.swapping: "+ a);
        System.out.println("value of b after Operations.swapping: "+ b);
    }
}