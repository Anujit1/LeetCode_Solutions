import java.util.ArrayList;
import java.util.List;

public class Lc_1389 {
    public static void main(String[] args) {

        int[] nums = new int[]{0,1,2,3,4};
        int[] index = new int[]{0,1,2,2,1};

//    using .add() method in list
        int[] res1 = method1(nums, index);
        System.out.println("using .add() method in list");
        for(int n : res1){
            System.out.print(n + ", ");
        }


        System.out.println(" ");


//    using swaping technique
        int[] res2 = method2(nums, index);
        System.out.println("using swaping technique");
        for(int n : res2){
            System.out.print(n + ", ");
        }


    }

//    using swaping technique
    static int[] method2(int[] nums, int[] index) {

        int[] temp = new int[nums.length];

        for(int i = 0; i < nums.length; i++){

            for(int j = i; j > index[i]; j-- ){
                temp[j] = temp[j-1];
            }

            temp[index[i]]  = nums[i];

        }

        return temp;
    }


//    using .add() method in list
    static int[] method1(int[] nums, int[] index) {
        List<Integer> target = new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            target.add(index[i],nums[i]);
        }
        int[] arr = new int[target.size()];
        for (int i = 0; i < target.size(); i++) {
            arr[i] = target.get(i);
        }
        return arr;

    }


}
