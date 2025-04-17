// Lc- 1431. Kids With the Greatest Number of Candies

import java.util.*;

public class Lc_1431 {

    static int maxElement(int[] candies){
        int max = Integer.MIN_VALUE;

        for (int candy : candies) {
            if (candy > max) {
                max = candy;
            }
        }

        return max;
    }

    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> res = new ArrayList<>();

        int max = maxElement(candies);

        for (int candy : candies) {
            if ((candy + extraCandies) >= max) {
                res.add(true);
            } else {
                res.add(false);
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[] candy = new int[]{2, 3, 6, 1, 3};

        int extraCandies = 3;

        List<Boolean> res = new ArrayList<>();

        res = kidsWithCandies(candy, extraCandies);

        for (boolean r : res) {
            System.out.println(r);
        }
    }
}
