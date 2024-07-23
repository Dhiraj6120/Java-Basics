public class BubbleSort {

    //In Bubble Sord we will do multiple Swapping operations.
    public static void main(String[] args) {
        int[] nums = {1, 8, 9, 4, 6, 3, 10};
        for(int i= 0; i < nums.length - 1; i++){ // n-1
            for (int j = i + 1; j < (nums.length); j++){ //
                if(nums[i]<nums[j]){
                    int temp = nums[i];
                    nums[i] = nums[j];

                    nums[j] = temp; //New Changes in Mac

                    //num[j] = temp

                }
            }
        }
        for(int i: nums){
            System.out.println(i);
        }
    }
}
