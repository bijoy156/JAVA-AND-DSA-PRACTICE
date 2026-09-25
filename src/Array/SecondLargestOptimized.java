package Array;
//ONLY THE ALGORITHM

class SecondLargestOptimized {
    public int secondLargestElement(int[] arr) {
        int largest = arr[0];
        int SecondLargest = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            if(arr[i]>largest){
                SecondLargest = largest;
                largest = arr[i];
            }
            else if(arr[i]<largest && arr[i]>SecondLargest){
                SecondLargest = arr[i];
            }
        }
        if(SecondLargest == Integer.MIN_VALUE){
            return -1;
        }
        return SecondLargest;
    }
}
