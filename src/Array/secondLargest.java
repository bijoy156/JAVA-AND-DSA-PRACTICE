package Array;

public class secondLargest {
    public static void main(String[] args) {
        int[] myArr = {-0, -83, -62, -2222, -69, -100, -12, -10000, -6969};
        int foundIt = findSecondLargest(myArr);
        System.out.println("the second largest element in the array is: " + foundIt);
    }
    public static int findSecondLargest(int[] myArr) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MAX_VALUE;
        int i = 0;
        while (i < myArr.length) {
            if (myArr[i] > largest) {
                secondLargest = largest;
                myArr[i] = largest;
            } else if (myArr[i] > secondLargest && myArr[i]!= largest) {
                secondLargest = myArr[i];
            }
            i++;
        }
        return secondLargest;
    }
}

