package BinarySearch;

import java.util.Scanner;
public class BinarySearching {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the num of element in the array: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        for(int i=0; i<size; i++){
            System.out.println("Enter the "+(i+1)+" element: ");
            arr[i]= input.nextInt();
        }
        System.out.println("Enter the number you want to find: ");
        int target = input.nextInt();
        System.out.println("Target found at index " + binarySearch(arr, target));
    }
    public static int binarySearch(int[]arr,int target){
        int low = 0;
        int high = arr.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid] == target){
                return mid;
            } else if (arr[mid]<target) {
                low = mid+1;
            }else {
                high = mid-1;
            }
        }
        return -1;
    }

}
