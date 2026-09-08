package Array;

import java.util.Scanner;
public class sumAvg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("please enter the no of elements in the array: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        int index = 0;
        while (index < size) {
            System.out.println("Enter the " + (index + 1) + "th " + " array value: ");
            arr[index] = scanner.nextInt();
            index++;
        }
        int sum = sum(arr);
        int avg = avg(arr);
        System.out.println("The sum of your array values are: " + sum);
        System.out.println("The average of your array values are: " + avg);
    }
    public static int sum(int[] arr){
        int sum = 0;
        int i = 0;
        while (i<arr.length){
            sum = sum+arr[i];
            i++;
        }
            return sum;
        }
    public static int avg(int[] arr){
        int i = 0;
        int sum = sum(arr);
            return sum/arr.length;
        }
        }

