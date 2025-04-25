public class Lc_34 {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 5};

        int[] res = searchRange(nums, 1);

        for(int num : res){
            System.out.println(num);

        }
    }

    static public int[] searchRange(int[] nums, int target) {
        int[] res = new int[]{-1, -1};

        res[0] = search(nums, target, true);
        if(res[0] != -1){
            res[1] = search(nums, target, false);
        }

        return res;
    }

     static public int search (int[] nums, int target, boolean firstSearch){

        int ans = -1;
        int start = 0, end = nums.length-1;

        // first occurrence
        while(start <= end){
            int mid = (start + (end - start)/2);

            if(target == nums[mid]){
                ans = mid;
                if(firstSearch){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }

            else if(target > nums[mid]){
                start = mid + 1;
            }

            else if(target < nums[mid]){
                end = mid - 1;
            }
        }
        return ans;
    }
}
