//Lc - 852. Peak Index in a Mountain Array

public class Lc_852 {
    public static void main(String[] args) {
        int count = 1;

        int[][] mountainArrays = {
                {1, 88, 40, 39, 29, 25, 20, 15, 9, 4},
                {30, 90, 88, 60, 55, 50, 42, 33},
                {60, 63, 70, 75, 80, 77, 71, 65},
                {85, 90, 97, 100, 101, 150, 82},
                {110, 129, 125, 120, 115, 108}
        };

        for(int[] arr : mountainArrays){
            System.out.println(count + ": " + findPeak(arr));
            count++;
        }

    }

    static int findPeak(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start < end){
            int mid = start + (end - start)/2;

            if(arr[mid] > arr[mid+1]){
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


}
