import java.util.Random;

public class SelecSort {
    public static void main(String[] args) {
//        int []nums = {4, 8, 1, 5, 3, 9, 2};
        int[] nums = new int[10];
        Random random = new Random();

        for (int i = 0; i<nums.length;i++){
            nums[i] = random.nextInt(100);
        }

        for (int i: nums){
            System.out.println(i + " ");
        }
        System.out.println("________________________________________________");


        for(int i = 0; i < nums.length; i++){
            int index = i;
            for(int j = i + 1; j < nums.length; j++){
                if(nums[index] > nums[j]){
                    index = j;
                }
            }
            int temp = nums[i];
            nums[i] = nums[index];
            nums[index] = temp;
        }

        System.out.println("________________________________________________");
        for (int i: nums){
            System.out.println(i + " ");
        }
    }

}
