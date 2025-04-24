//Lc- 744. Find Smallest Letter Greater Than Target

public class Lc_744 {
    public static void main(String[] args) {
        char[] arr = new char[]{'v','w','x','z'};

        char s = 'z';

        System.out.println(search(arr, s));

    }

    static char search (char[] arr, char s){
        int start = 0, end = arr.length-1;

        while(start <= end){

            int mid = start + (end - start) / 2;

            if(s >= arr[mid]){
                start = mid + 1;
            }

            else{
                end = mid - 1;
            }

        }

        return arr[start % arr.length];
    }


}
