//Lc - 1095. Find in Mountain Array

public class Lc_1095 {
    public static void main(String[] args) {
        int[] arr = {1, 5, 2};
        int size = arr.length-1;

        int target = 2;

        int peak = findPeak(arr, size);
        int result = binarySearch(arr, target, 0, peak, true);

        if(result != -1){
            System.out.println(result);
        }

        System.out.println(binarySearch(arr, target, peak, size, false));
    }

    //    calculate peak
    static int findPeak(int[] arr, int size){
        int start = 0;
        int end = size;

        while(start < end){
            int mid = start + (end - start)/2;

            if(arr[mid] > arr[mid + 1]){
                //if true you are in the descending part of the array
                end = mid;
            }

            else if(arr[mid] < arr[mid + 1]){
                //if true you are in the ascending part
                start = mid +1;
            }
        }
        return start;
    }

    // binarySearch
    static int binarySearch(int[] arr, int target, int start, int end, boolean isAscending){

        while (start <= end) {

            int mid = (start + end) / 2;
            int midVal = arr[mid];

            if (midVal == target) {
                return mid;
            }

            if (isAscending) {

                if (target > midVal) {
                    start = mid + 1;
                }

                else {
                    end = mid - 1;
                }
            }

            else {

                if (target > midVal) {
                    end = mid - 1;
                }

                else {
                    start = mid + 1;
                }
            }

        }

        return -1;
    }


}
