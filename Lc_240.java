public class Lc_240 {
    public static void main(String[] args) {

        int[][] matrix = {
                {1,5,7,9},
                {2,6,8,10},
                {3,11,12,13},
                {4,14,15,16}
        };

        int target = 122;

        System.out.println(searchMatrix(matrix, target));

    }

    static boolean searchMatrix(int[][] matrix, int target) {
        int r = 0;
        int c = matrix[0].length-1;

        while(r < matrix.length && c >= 0){
            if(matrix[r][c] == target){
                return true;
            }

            else if(matrix[r][c] > target){
                c--;
            }

            else if(matrix[r][c] < target){
                r++;
            }

        }

        return false;
    }
}
