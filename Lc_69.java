public class Lc_69 {
    public static void main(String[] args) {
        int num = 11;

        System.out.println(calculateSqrt(num));
    }

    static int calculateSqrt(int num){
        double start = 0, end = num;

        while (start <= end){
            double mid = start + (end - start)/2;
            double sqrt = mid * mid;

            if(Math.floor(sqrt) == num){
                return (int)Math.floor(mid);
            }

            else if(sqrt > num){
                end = mid;
            }

            else if(sqrt < num){
                start = mid;
            }
        }

        return (int)Math.floor(start);
    }
}
