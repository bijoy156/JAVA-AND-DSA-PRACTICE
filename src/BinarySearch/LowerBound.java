package BinarySearch;

import java.util.Scanner;
public class LowerBound {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the no of element: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println();
            arr[i] = input.nextInt();
        }
        System.out.println("Enter the number you want to find: ");
        int target = input.nextInt();
        System.out.println("Lower bound of the array is: "+Binary(arr,target));
    }
    public static int Binary(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        int answer = arr.length;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] >= target) {
                answer = mid;
                high = mid-1;
            } else {
                low = mid + 1;
            }
        }
        return arr[answer];
    }
}
