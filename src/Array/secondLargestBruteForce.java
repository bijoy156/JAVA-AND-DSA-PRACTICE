package Array;
//ONLY THE APPROACH
class secondLargestBruteForce {
    public int secondLargestElement(int[] arr) {
        int largest = arr[0];
        for(int i=0; i<arr.length; i++){
            if(largest<arr[i]){
                largest = arr[i];
            }
        }
        int secLargest = Integer.MIN_VALUE;
        for(int i=1; i<arr.length; i++){
            if(secLargest<arr[i] && arr[i]<largest){
                secLargest=arr[i];
            }

        }
        if(secLargest == Integer.MIN_VALUE){
            return -1;
        }
        return secLargest;

    }

}

