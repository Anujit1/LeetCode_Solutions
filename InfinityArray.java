//Find Element In An Infinite Size Array
//https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/

/*      Note: This can give an "out of bound" error because
        in real world scenario there can not be an infinite
        size array or an array without a length feature.
*/

public class InfinityArray {
    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 3, 4, 5, 6, 7, 8, 9, 11, 22, 34, 58, 59, 63, 65, 69, 70};

        int target = 70;

        System.out.println(searchTarget(target, arr));

    }

//    Search the location of target
    static int searchTarget(int target,  int[] arr){
        int l = 0, h = 1;
        int val = arr[0];

        // Find high to do binary search
        while (val < target) {

            // Store previous high
            l = h;

            // Double high index
            h = 2 * h;

            // Update new value
            val = arr[h];
        }

        return binarySearch(arr, target, l, h);
    }

//    apply binary search on the found range
    static int binarySearch(int[] arr,int target, int start, int end){

        while(start <= end){
            int mid = start + (end - start)/2;

            if(target == arr[mid]){
                return mid;
            }
            else if(target > arr[mid]){
                start = mid +1;
            }
            else if(target < arr[mid]){
                end = mid -1;
            }

        }
        return -1;

    }
}
