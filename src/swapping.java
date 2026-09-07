import java.util.Scanner;
public class swapping {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Value of a before swapping: ");
        int a = input.nextInt();
        System.out.print("Value of b before swapping: ");
        int b = input.nextInt();
        int c = a;
        a = b;
        b = c;
        System.out.println("Value of a after swapping: " +a);
        System.out.print("Value of b after swapping: " +b);
    }
}

