package Array;

import java.util.Scanner;
public class DeleteElement {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of elements: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0; i<size; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the element you want to delete: ");
        int x = sc.nextInt();
        int Occurance = Occur(arr,x);
        int[] delete = newArr(arr,x,Occurance);
        System.out.print("array after deleting: ");
        printArr(delete);

    }
    public static void printArr(int[] delete){
        for(int i=0; i<delete.length; i++){
            System.out.print(delete[i]+ " ");
        }

    }
    public static int Occur(int[]arr, int x){
        int occ = 0;
        for(int i=0; i<arr.length; i++){
            if(x == arr[i]){
                occ++;
            }
        }
        return occ;
    }
    public static int[] newArr(int[]arr, int x, int occ){
        int[] newArr = new int[arr.length-occ];
        int j=0;
        for(int i=0; i<arr.length; i++){
           if(arr[i] != x){
               newArr[j]=arr[i];
               j++;
            }
        }
        return newArr;

    }
}