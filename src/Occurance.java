import java.util.Scanner;
public class Occurance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the num of element in the array: ");
        int size = input.nextInt();
        int[] mArr = new int[size];
        int index = 0;
        while (index<size){
            System.out.println("Enter the value No. " +(index+1));
            mArr[index] = input.nextInt();
            index++;
        }
        System.out.print("Now enter the number you want to find: ");
        int searchValue = input.nextInt();
        int occur = noOfOccurance(mArr, searchValue);
        System.out.println("your num is found" + occur +"times in the array");
    }
    public static int noOfOccurance(int[] myArr, int searchValue){
        int occ=0;
        int i = 0;
        while(i<myArr.length){
            if(myArr[i] == searchValue){
                occ++;
            }
            i++;
        }
        return occ;
    }
}
