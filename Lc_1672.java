// Lc- 1672. Richest Customer Wealth

import java.util.ArrayList;

public class Lc_1672 {
    public static void main(String[] args) {
/*        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        list.add(new ArrayList<>(Arrays.asList(1, 2, 3)));
        list.add(new ArrayList<>(Arrays.asList(4, 5, 6)));
        list.add(new ArrayList<>(Arrays.asList(7, 8, 9)));*/

        int[][] list = {
                {1,2,3},
                {3,2,1}

        };

        System.out.println(maximumWealth(list));;
    }

/*    private static int maxSum(ArrayList<ArrayList<Integer>> list) {

        ArrayList<Integer> accountData = new ArrayList<>();

        //Array Sum
        for(ArrayList<Integer> arr : list){
            accountData.add(arraySum(arr));
        }

        return maximum(accountData);

    }

    private static Integer arraySum(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i : arr){
            sum+=i;
        }
        return sum;
    }

    private static int maximum(ArrayList<Integer> accountData) {
        int max = Integer.MIN_VALUE;

        for(int i : accountData){
            if(i > max){
                max = i;
            }
        }

        return accountData.indexOf(max);
    }*/


    public static int maximumWealth(int[][] accounts) {
        ArrayList<Integer> accountData = new ArrayList<>(100);

        //Array Sum
        for(int[] arr : accounts){
            accountData.add(arraySum(arr));
        }

        return maximum(accountData);
    }

    private static int arraySum(int[] arr) {
        int sum = 0;
        for(int i : arr){
            sum+=i;
        }
        return sum;
    }

    private static int maximum(ArrayList<Integer> accountData) {
        int max = Integer.MIN_VALUE;

        for(int i : accountData){
            if(i > max){
                max = i;
            }
        }

        return accountData.indexOf(max);
    }


}
