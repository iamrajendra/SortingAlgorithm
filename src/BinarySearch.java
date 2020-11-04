import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int [] array =  new int[] {
                5,46,7,44,545,66
        };

        int x  =66;
        Arrays.sort(array);
        int index  = binarySearch(array,x);
        if (index == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at "
                    + "index " + index);

    }
    public  static  int binarySearch(int array[],int x){
        int left = 0;
        int right  = array.length-1;

       return binarySearch(array,left,right,x);


    }

    static int binarySearch(int arr[], int left, int right, int x)
    {
        if (right >= left) {
            int mid = left + (right - left) / 2;

            // If the element is present at the
            // middle itself
            if (arr[mid] == x)
                return mid;

            // If element is smaller than mid, then
            // it can only be present in left subarray
            if (arr[mid] > x)
                return binarySearch(arr, left, mid - 1, x);

            // Else the element can only be present
            // in right subarray
            return binarySearch(arr, mid + 1, right, x);
        }

        // We reach here when element is not present
        // in array
        return -1;
    }
}
