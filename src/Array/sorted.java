package Array;
import java.util.*;
public class sorted {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        boolean dec = isDecreasing(arr);
        boolean inc = isIncreasing(arr);
        if(dec||inc){
            System.out.println("Your array is sorted");
        }
        else{
            System.out.println("NOT SORTED");
        }
    }
    public static boolean isIncreasing(int[]arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] > arr[i]) {
                return false;
            }
        }
        return true;
    }
    public static boolean isDecreasing(int[]arr){
        for(int i=1; i<arr.length; i++){
            if(arr[i-1] < arr[i]){
                return false;
            }
        }
        return true;
    }
}

