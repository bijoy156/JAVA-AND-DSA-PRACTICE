import java.util.*;
public class PracTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the number of elements: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the "+(i+1) + "th element :");
            arr[i] = sc.nextInt();
        }
        int sum = arraySum(arr);
        float avg = arrAverage(arr, sum);

        System.out.println("sum of the array is: "+sum);
        System.out.println("Average of the array is: "+avg);
    }

    public static int arraySum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }

    public static float arrAverage(int[] arr, int sum) {
        float avg = 0;
        avg = (float) sum / arr.length;
        return avg;
}
}
