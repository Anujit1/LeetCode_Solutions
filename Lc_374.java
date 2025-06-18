public class Lc_374 {
    public static void main(String[] args) {
        int n = 1000;

        System.out.println(guessNumber(n));
    }

    static int guessNumber(int n){
        int start = 1, end = n, mid;
        int ans;

        while(start <= end){
            mid = start+(end-start)/2;
            ans = guess(mid);

            if(ans == 0){
                return mid;
            }

            else if(ans == 1){
                start = mid + 1;
            }

            else if(ans == -1){
                end = mid - 1;
            }

            else if(ans == 404){
                break;
            }
        }

        return -1;
    }

    static int guess(int mid){
        int pick = 2; // this is the pick, the secret number

        if(pick == mid){
            return 0;
        }

        else if(pick < mid){
            return -1;
        }

        else if(pick > mid){
            return 1;
        }
        else{
            return -1;
        }
    }
}


