import java.util.Scanner;
public class numberSearching{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] myArr = {5,20,9,60,100,69,90};
        System.out.print("Please enter the number you want to find: ");
        int num = scanner.nextInt();
        int found = isFound(myArr, num);
    }
    public static int isFound(int[] myArr, int num) {
        int index = 0;
        while(index < myArr.length){
            if(myArr[index] == num){
                System.out.println("number is present in the array");
                return num;
            }
            index++;
        }
        System.out.println("number is not present in the array");
        return 0;
    }
}
