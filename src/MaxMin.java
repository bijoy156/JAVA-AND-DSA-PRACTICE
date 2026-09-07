import java.util.Scanner;
public  class MaxMin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number of element: ");
        int size = input.nextInt();
        if (size == 0) {
            System.out.println("there should be one element in the array to find maximum and Minimum value. Please restart the program");
        }
        int[] myArr = new int[size];
        int index = 0;
        while (index < size) {
            System.out.print("Enter the element no " + (index + 1) + ":");
            myArr[index] = input.nextInt();
            index++;
        }
        int max = maxValue(myArr);
        int min = minValue(myArr);
        System.out.println("the Maximum value in the array is: " +max);
        System.out.println("the Minimum value in the array is: " +min);
    }
    public static int maxValue(int[] myArr) {
        int max = myArr[0];
        int i = 1;
        while (i < myArr.length) {
            if (myArr[i] > max) {
                max = myArr[i];
            }
            i++;
        }
        return max;
    }
    public static int minValue(int[] myArr) {
        int min = myArr[0];
        int i = 1;
        while (i < myArr.length) {
            if (myArr[i] < min) {
                min = myArr[i];
            }
            i++;
        }
        return min;
    }
}
