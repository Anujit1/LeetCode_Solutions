//Lc-167. Two Sum II - Input Array Is Sorted
/*
* In this question we are given an array and a target
* We have to find the 2 index whose sum is equal to target
* It is a 1-indexed array
* So,
* We are using 2 pointers and Binary search approach to find the index
* We are using binary search because the question has a hint, the array
    is sorted in nondecreasing order.
*
* The 2 pointers are set to start and end of the array
* If their sum is grater than the target; decrement end, as the largest number
    is at the end.
* If their sum is smaller than the target; increment start, as the smallest
    numbers are at the start.
* Repeat these steps and if the sum of start and end is equal to target
    return the indexes.
* */

public class Lc_167 {
    public static void main(String[] args) {
        int[] numbers = {2,7,11,15,20};
        int target = 17;

        int[] indexes = twoSum(numbers, target);

        for(int index : indexes){
            System.out.println(index);
        }
    }

    static int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {

            if (numbers[left] + numbers[right] == target) {
                return new int[]{left + 1, right + 1};
            } else if (numbers[left] + numbers[right] > target) {
                right--;
            } else {
                left++;
            }
        }
        return new int[]{-1, -1};
    }
}
