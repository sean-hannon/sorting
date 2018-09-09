//The complexity of quick sort in the average case is Θ(n log(n)) and in the worst case is Θ(n2).
public class QuickSort {
    private int array[];
    private int length;

    public int[] sort(int[] inputArray){
        if (inputArray == null || inputArray.length == 0){
            return null;
        }
        this.array = inputArray;
        length = inputArray.length;
        quickSort(0, length - 1);
        return array;
    }

    private void quickSort(int lowIndex, int highIndex) {
        int i = lowIndex;
        int j = highIndex;

        int pivot = array[lowIndex + (highIndex - lowIndex)/2];
        while (i <= j){
            while (array[i] < pivot){
                i++;
            }
            while (array[j] > pivot){
                j--;
            }
            if (i <= j){
                exchangeNumbers(i, j);
                i++;
                j--;
            }
        }
        if (lowIndex < j)
            quickSort(lowIndex, j);
        if (i < highIndex)
            quickSort(i, highIndex);
    }

    private void exchangeNumbers(int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
