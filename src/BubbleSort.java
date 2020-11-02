import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
      Integer[] array  =  new Integer[]{10,5,2,3,1};
      boolean isSorted = true;
      int bubbleLength  = array.length-1;
      while (isSorted){
          isSorted =false;
          for (int i = 0; i < bubbleLength; i++) {

              if (array[i] > array[i+1]){
                  swap(array,i,i+1);
                  isSorted = true;
              }

          }

          bubbleLength--;
      }

        System.out.println("args = " + Arrays.deepToString(array));
    }

    private static void swap(Integer[] array, int indexA, int indexB) {
int temp   = array[indexA];
        array[indexA] = array[indexB];
        array[indexB] = temp;
    }
}
