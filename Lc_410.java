//410. Split Array Largest Sum
/*
* find the min and max subarray sum
* the max and min subarray sum would be the range of the search
* */


import java.util.Arrays;

public class Lc_410 {

    public static void main(String[] args) {
        int[] nums = {7,2,5,10,8};

        System.out.println(splitArray(nums, 5));;
    }

    static int splitArray(int[] nums, int s){
        int start = nums[0], end = 0;

        for(int num : nums){
            start = Math.max(start, num);
            end = end + num;
        }

        while(start < end){
            int mid = start + (end - start)/2;
            int sum = 0, slice = 1;

            for(int num : nums){

                //if sum is more than mid, move to next slice and reset sum to current number
                if(sum + num > mid){
                    sum = num;
                    slice++;
                }

                //if sum is less than mid continue addition
                else{
                    sum += num;
                }
            }

            // check for slice
            if(slice > s){
                start = mid +1;
            }
            else{
                end = mid;
            }

        }

        return end;
    }
}
