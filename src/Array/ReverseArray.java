package Array;

import java.util.Scanner;
public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        rev(arr);
        System.out.println("the reversed array is: ");
        printArray(arr);


    }
    public static void printArray(int[]arr){
        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i]+ " ");
        }

    }

    public static void rev(int[] arr) {
        for(int i=0;i<arr.length/2; i++){
            int swap = arr[i];
            arr[i]=arr[(arr.length-1)-i];
            arr[(arr.length-1)-i] = swap;

        }
    }
}


