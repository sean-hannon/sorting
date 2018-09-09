//The complexity of bubble sort has a worst and average case of O(n2)
public class BubbleSort {

    public int[] sort(int array[]){
        int length = array.length;
        int k;
        for (int i = length; i >= 0; i--) {
            for (int j = 0; j < length - 1; j++) {
                k = j + 1;
                if (array[j] > array[k]){
                    swapNumbers(j, k, array);
                }
            }

        }
        return array;
    }

    private void swapNumbers(int j, int k, int[] array) {
        int temp = array[j];
        array[k] = array[j];
        array[j] = temp;
    }
}
