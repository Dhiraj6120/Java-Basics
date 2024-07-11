public class SelectionSort {

    //  Selection Sort: In selection sort we are going through array and swap with the lesser number
    //  time complexity: O(n^2)

    public static void printArray(int[] nums){
        for (int i : nums){
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        int [] nums = {2, 5, 3, 8, 4, 9};

        for(int i = 0; i < nums.length - 1; i++){
            int smallInd = i;
            for(int j = i+1; j < nums.length;j++){
                if(nums[smallInd] < nums[j]){
                    smallInd = j;
                }
            }
            int temp = nums[smallInd];
            nums[smallInd] = nums[i];
            nums[i] = temp;
        }
        printArray(nums);
    }
}
