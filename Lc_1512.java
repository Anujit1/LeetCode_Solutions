// Lc- 1512. Number of Good Pairs

public class Lc_1512 {

    static int countGoodPair(int[] nums){
        int c = 0;

        for(int i = 0; i < nums.length; i++){
            for(int j = i; j < nums.length; j++){
                if((i < j) && (nums[i] == nums[j])){
                    c++;
                }
            }
        }

        return c;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 4, 1, 2, 4, 1, 3};

        System.out.println(Lc_1512.countGoodPair(nums));

    }
}
