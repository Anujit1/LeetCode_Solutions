//Lc-441. Arranging Coins


public class Lc_441 {
    public static void main(String[] args) {
        System.out.println(arrangeCoins(10));;
    }

    static int arrangeCoins(int n) {
        long start = 0, end = n, mid = 0;
        long coinRequired = 0;
        long ans = 0;

        while(start <= end){
            mid = start + (end - start)/2;
            coinRequired = (mid * (mid + 1)) / 2;

            if(coinRequired <= n){
                ans = mid;
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }

        return (int)ans;

    }
}
