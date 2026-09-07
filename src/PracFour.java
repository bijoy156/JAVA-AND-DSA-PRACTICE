import java.util.Scanner;
public class PracFour {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        int Smaximum = SecMaxNum(arr);
        System.out.println("The Second maximum element in your array is :"+Smaximum);
    }
    public static int SecMaxNum(int[]arr) {
        int max = arr[0];
        int SecMax = arr[1];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                SecMax = max;
                max = arr[i];
            }
            else if(arr[i] > SecMax) {
                    SecMax = arr[i];
                }
        }
        return SecMax;
    }
}
