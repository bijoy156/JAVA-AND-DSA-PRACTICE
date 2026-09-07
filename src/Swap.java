import java.util.Scanner;
public class Swap{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Enter the value of a before swapping: ");
        int a = scanner.nextInt();
        System.out.print("Enter the Value of b before swapping: ");
        int b = scanner.nextInt();
        int c = a;
        a = b;
        b = c;
        System.out.println("SWAPPING DONE....");
        System.out.println("value of a after swapping: "+ a);
        System.out.println("value of b after swapping: "+ b);
    }
}