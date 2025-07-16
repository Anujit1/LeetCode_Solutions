//lc-283 Move Zeroes

public class lc_283 {
    public static void main(String[] args) {
        int[] nums = {1,0,2,4,5,0,41,5,2,0,0,1,1,4,5,6};

        moveZeroes(nums);

        for (int i : nums) {
            System.out.println(i);
        }
    }

    static public void moveZeroes(int[] nums) {

        int i = 0;

        if(nums.length == 1 || nums.length == 0){
            return;
        }

        for( int j = 0; j < nums.length; j++){
            if( nums[ j ] != 0){
                //swap
                int temp;
                temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;

                i++;
            }
        }
    }


}
