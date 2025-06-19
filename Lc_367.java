//Lc-367. Valid Perfect Square


public class Lc_367 {
    public static void main(String[] args) {
        System.out.println(isPerfectSquare(2));
    }

    static boolean isPerfectSquare(int num) {

        int start = 0, end = num, mid=0;

        while (start <= end){

            mid = start + (end - start)/2;
            long sqrt = (long)mid * mid;

            if(sqrt == num){
                break;
            }

            else if(sqrt > num){
                end = mid-1;
            }


            else if(sqrt < num){
                start = mid+1;
            }
        }

        return (mid * mid == num) ? true : false;

    }
}
