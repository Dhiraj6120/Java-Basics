import java.util.Random;

//youtube Link: https://www.youtube.com/watch?v=bOk35XmHPKs&ab_channel=CodingwithJohn

public class MergeSort {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        Random random = new Random();

        for (int i = 0; i<numbers.length; i++){
            numbers[i] = random.nextInt(100);
        }

        System.out.println("Before: ");
        for (int i = 0; i<numbers.length; i++){
            System.out.println(numbers[i]);
        }

        divideMergeSort(numbers);
        System.out.println("After: ");
        for (int i = 0; i<numbers.length; i++){
            System.out.println(numbers[i]);
        }
    }

    public static void divideMergeSort(int[] numbers){
        int inputArrayLen = numbers.length;
        if(numbers.length  < 2){
            return;
        }

        int midIndex = inputArrayLen / 2;
        int[] leftArr = new int[midIndex];
        int[] rightArr = new int[inputArrayLen - midIndex];

        for(int i = 0; i<midIndex; i++){
            leftArr[i] = numbers[i];
        }
        for (int i = midIndex; i<inputArrayLen; i++){
            rightArr[i-midIndex] = numbers[i];
        }

        divideMergeSort(leftArr);
        divideMergeSort(rightArr);

        mergeArr(numbers, leftArr, rightArr);

    }

    private static void mergeArr(int[] numbers, int[] leftArr, int[] rightArr){
        int leftSize = leftArr.length;
        int rightSize = rightArr.length;

        int leftItr = 0, rightItr = 0, k = 0;

        while (leftItr < leftSize && rightItr < rightSize){
            if(leftArr[leftItr] < rightArr[rightItr]){
                numbers[k] = leftArr[leftItr];
                leftItr++;
            }
            else {
                numbers[k] = rightArr[rightItr];
                rightItr++;
            }
            k++;
        }
        while (leftItr < leftSize){
            numbers[k] = leftArr[leftItr];
            leftItr++;
            k++;
        }
        while (rightItr < rightSize){
            numbers[k] = rightArr[rightItr];
            rightItr++;
            k++;
        }
    }
}
