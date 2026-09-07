package Array;//Take an array as input from the user. Search for a given number x and print the index at which it occurs.

import java.util.*;
public class linearSearching {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int arr[] = new int[input];
        for (int i = 0; i < input; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("enter the number: ");
        int x = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                System.out.println("x found at index: " + i);
            }
        }
    }
}






