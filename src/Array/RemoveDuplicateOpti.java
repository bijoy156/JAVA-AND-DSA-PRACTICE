package Array;
import java.util.Scanner;
public class RemoveDuplicateOpti {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Number of duplicate elements are: "+removeDuplicates(arr));
    }
    public static int removeDuplicates(int[] arr) {
            int i = 0;
            for(int j=0; j<arr.length; j++){
                if(arr[i]!=arr[j]){
                    i++;
                    arr[i]=arr[j];
                }

            }
            return i+1;
        }
    }

