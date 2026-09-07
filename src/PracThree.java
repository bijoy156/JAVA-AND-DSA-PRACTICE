import java.util.Scanner;
public class PracThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the elements of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the number you want to search: ");
        int x = sc.nextInt();
        findElement(arr, x);
        System.out.println("Elements found ");
        int total= totalOccurances(arr, x);
        System.out.println("your elements occurs "+total+" times is the array");
    }
    public static void findElement(int[]arr, int x){
        for(int i=0; i<arr.length; i++){
            if(x==arr[i]){
                System.out.println("found at index: "+i);
            }

        }
    }
    public static int totalOccurances(int[]arr, int x){
        int total = 0;
        for(int i=0;i<arr.length;i++) {
            if (x == i) {
                total = total + 1;
            }
        }

        return total;
    }
}
