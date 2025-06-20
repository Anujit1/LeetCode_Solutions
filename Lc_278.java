//Lc-278. First Bad Version
/*
* First clue to solve this question is the versions are
    in increasing order (1,2,3,4,...,n) which is monotonic
* So, we can apply binary search
* As per the question if say 4 is the first bad number
    so later versions after 4 will be bad.
*  So, we just have to find a bad number; and apply Binary Search
* */

public class Lc_278 {
    public static void main(String[] args) {
        System.out.println(firstBadVersion(100));
    }

    // api to check for bad version
    static boolean isBadVersion(int n){
        int unknownFirstBadVersion = 10; // this is the unknown first bad version

        if(n < unknownFirstBadVersion){
            return false;
        }
        else{
            return true;
        }
    }

    // check for first bad version
    static int firstBadVersion(int n) {

        int l = 1, r = n;

        while(l < r){
            int mid = l + (r - l)/2;

            if(isBadVersion(mid)){
                r = mid;
            }

            else{
                l = mid + 1;
            }
        }
        return r;
    }
}
