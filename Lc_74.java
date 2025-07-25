public class Lc_74 {
    public static void main(String[] args) {
        int [][] matrix = {
                {1,3,5,7},
                {10,11,16,20},
                {23,30,34,60}
        };

        int target = 6;

        System.out.println(searchMatrix(matrix, target));
    }

    static boolean searchMatrix(int[][] matrix, int target) {
        int rStart = 0;
        int rEnd = matrix.length-1;
        int cStart = 0;
        int cEnd = matrix[0].length-1;

        while(rStart <= rEnd){
            int rMid = rStart + ( rEnd - rStart ) / 2;

            if(matrix[rMid][cStart] <= target && matrix[rMid][cEnd] >= target){
                return binarySearch(matrix, target, rMid) ? true : false;
            }

            else if ( matrix[rMid][cStart] > target){
                rEnd = rMid - 1;
            }

            else if ( matrix[rMid][cEnd] < target){
                rStart = rMid + 1;
            }
        }

        return false;
    }

    static boolean binarySearch(int[][] matrix, int target, int r){
        int cStart = 0;
        int cEnd = matrix[0].length - 1;

        while (cStart <= cEnd){
            int mid = cStart + (cEnd - cStart) / 2;

            if (matrix[r][mid] == target){
                return true;
            }
            else if (target < matrix[r][mid]){
                cEnd = mid - 1;
            }
            else if (target > matrix[r][mid]){
                cStart = mid + 1;
            }
        }

        return false;
    }
}
