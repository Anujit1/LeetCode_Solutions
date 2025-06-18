// Lc-33. Search in Rotated Sorted Array

/* -first find pivot(largest number in the array)
   -next apply binary search on first and second half to find the target
*/

public class Lc_33 {
    public static void main(String[] args){
        int[] arr = {3,4,5,6,7};

        int target = 3;

        int pivot = findPivot(arr);

        //if pivot not found
        if(pivot == -1){
            System.out.println(binarySearch(0, arr.length-1, target, arr));
            return;
        }

        //pivot on the first half
        int res = binarySearch(0, pivot, target, arr);

        //pivot on the second half
        if(res == -1){
            res = binarySearch(pivot+1, arr.length-1, target, arr);
        }

        System.out.println(res);
    }

    //find pivot
    static int findPivot(int[] arr){
        int start = 0, end = arr.length-1;
        int mid ;

        while(start <= end){
            mid = start + (end - start) / 2;

            // Case 1: mid is the pivot
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }

            // Case 2: mid-1 is the pivot
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid-1;
            }

            // Left side is unsorted (pivot must be there)
            if (arr[mid] < arr[start]) {
                end = mid - 1;
            } else { // Right side is unsorted
                start = mid + 1;
            }
        }

        return -1; // No pivot found
    }

    //binary search
    static int binarySearch(int start, int end, int target, int[] arr){
        while(start <= end){
            int mid = start + (end - start)/2;

            if(target == arr[mid]) {
                return mid;
            }
            else if(target > arr[mid]){
                start = mid + 1;
            }
            else if(target < arr[mid]){
                end = mid - 1;
            }
        }
        return -1;
    }
}
