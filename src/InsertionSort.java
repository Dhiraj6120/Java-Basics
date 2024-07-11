public class InsertionSort {

    //Insertion Sort: It will logically divide the array into 2 groups.
    // Sorted and Unsorted, and then we will take element form unsorted array
    // and put it in correct position in sorted array
    public static void printArray(int[] nums){
        for (int i : nums){
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        int [] nums = {4, 3, 8, 5, 9, 6, 1, 9, 2};

        for (int i = 1; i < nums.length ; i++){
            int temp = nums[i];
            int j = i-1;
            while (j>=0 && temp > nums[j]){
                nums[j+1] = nums[j];
                j--;
            }

            nums[j+1] = temp;
        }
        printArray(nums);
    }
}
