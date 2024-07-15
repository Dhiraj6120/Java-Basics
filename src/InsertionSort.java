import javax.management.relation.RelationNotification;
import java.util.Random;

public class InsertionSort {

    //Insertion Sort: It will logically divide the array into 2 groups.
    // Sorted and Unsorted, and then we will take element form unsorted array
    // and put it in correct position in sorted array
//    public static void printArray(int[] nums){
//        for (int i : nums){
//            System.out.print(i + " ");
//        }
//    }
//    public static void main(String[] args) {
//        int [] nums = {4, 3, 8, 5, 9, 6, 1, 9, 2};
//
//        for (int i = 1; i < nums.length ; i++){
//            int temp = nums[i];
//            int j = i-1;
//            while (j>=0 && temp > nums[j]){
//                nums[j+1] = nums[j];
//                j--;
//            }
//
//            nums[j+1] = temp;
//        }
//        printArray(nums);
//    }

    public static void main(String[] args) {
        int[] numbers = new int[10];
        Random random = new Random();

        for(int i = 0 ; i < numbers.length; i++){
            numbers[i] = random.nextInt(100);
        }
        for (int number : numbers) {
            System.out.println(number + " ");
        }
        System.out.println("---------------------");
        insertionSort(numbers);

    }

    public static void insertionSort(int[] numArray){
        for(int i = 1; i < numArray.length; i++){
            int currentValue = numArray[i];
            int j = i - 1;
            while (j>=0 && numArray[j]>currentValue){
                numArray[j+1] = numArray[j];
                j--;
            }
            numArray[j+1] = currentValue;
        }
        for (int j : numArray) {
            System.out.println(j + " ");
        }

    }
}
