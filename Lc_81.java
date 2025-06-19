// Lc-81. Search in Rotated Sorted array II


public class Lc_81  {
    public static void main(String[] args){
        int[] nums = {3,4,4,4,4,5,6,7,8,9,9,9,9,9,9,0,1,2,3,3,3,3,3,3};

        int target = 3;

        System.out.println(search(nums, target));;
    }

    //searching
    static boolean search(int[] nums, int target) {
        int start = 0, end = nums.length-1;

        while (start <= end){
            int mid = start + (end - start)/2;

            if(nums[mid] == target){
                return true;
            }

            if(nums[start] < nums[mid]){
                if(target >= nums[start]  && target < nums[mid]){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }

            else if(nums[start] > nums[mid]){
                if(target <= nums[end] && target > nums[mid]){
                    start = mid + 1;
                }
                else{
                    end = mid - 1;
                }
            }

            else{
                start++;
            }
        }
        return false;
    }
}
