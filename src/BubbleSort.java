public class BubbleSort {
    public static void main(String[] args) {
        int[] nums = {1, 8, 9, 4, 6, 3};
        for(int i= 0; i < nums.length; i++){
            for (int j = i + 1; j < (nums.length); j++){
                if(nums[i]<nums[j]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        for(int i: nums){
            System.out.println(i);
        }
    }
}
