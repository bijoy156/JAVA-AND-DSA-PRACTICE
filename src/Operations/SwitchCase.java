package Operations;

import java.util.Scanner;
public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();
        switch (button) {
            case 1:
                System.out.println("hello");
            case 2:
                System.out.println("namaste");
            case 3:
                System.out.println("nomoskar");
            default:
                System.out.println("invalid");
        }
    }
}