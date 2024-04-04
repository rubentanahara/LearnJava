import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {20, 35, -15, 7, 55, 1, -22};
        int[] arr2 = {2, 5, 9, 8, 2, 8, 7, 10, 4, 3};
        int[] radixArr = {4725, 4586, 1330, 8792, 1594, 5729};
        // bubbleSort(arr);
        // selectionSort(arr);
        // insertionSort(arr);
        // shellSort(arr);
        // int result = recursiveFactorial(5);
        // System.out.println(result);
        // mergeSort(arr, 0, arr.length);
        // quickSort(arr, 0, arr.length);
        // countingSort(arr2, 1, 10);
//        radixSort(radixArr, 10, 4);
        Arrays.parallelSort(arr);
        printArray(arr);
    }

    // Radix sort
    public static void radixSort(int[] arr, int radix, int width) {
        for (int i = 0; i < width; i++) {
            radixSingleSort(arr, i, radix);
        }
    }

    private static void radixSingleSort(int[] arr, int position, int radix) {
        int numItems = arr.length;

        int[] countArr = new int[radix];

        for (int value : arr) {
            countArr[getDigit(position, value, radix)]++;
        }

        for (int j = 1; j < radix; j++) {
            countArr[j] += countArr[j - 1]; // ajust the count array
        }

        int[] temp = new int[numItems];
        for (int k = numItems - 1; k >= 0; k--) {
            temp[--countArr[getDigit(position, arr[k], radix)]] = arr[k];

        }
        for (int k = 0; k < numItems; k++) {
            arr[k] = temp[k];
        }
    }

    private static int getDigit(int position, int value, int radix) {
        return value / (int) Math.pow(radix, position) % radix;
    }

    // Counting Sort
    public static void countingSort(int[] arr, int min, int max) {

        int[] countArr = new int[(max - min) + 1];

        for (int item : arr) {
            countArr[item - min]++;
        }

        int j = 0;
        for (int i = min; i <= max; i++) {
            while (countArr[i - min] > 0) {
                arr[j++] = i;
                countArr[i - min]--;
            }
        }

    }

    // Quick Sort
    // divide and conquer
    public static void quickSort(int[] input, int start, int end) {
        if (end - start < 2) return;

        int pivotIndex = partition(input, start, end);
        quickSort(input, start, pivotIndex);
        quickSort(input, pivotIndex + 1, end);

    }

    private static int partition(int[] input, int start, int end) {
        // this is using the first element as the pivotIndex
        int pivot = input[start];
        int i = start;
        int j = end;

        while (i < j) {
            while (i < j && input[--j] >= pivot) ;
            if (i < j) {
                input[i] = input[j];
            }

            while (i < j && input[++i] <= pivot) ;
            if (i < j) {
                input[j] = input[i];
            }
        }
        input[j] = pivot;
        return j;
    }

    // Merge sort
    // divide and conquer
    //
    public static void mergeSort(int[] input, int start, int end) {
        if (end - start < 2) return;

        // partition the array
        int mid = (end + start) / 2;
        mergeSort(input, start, mid);
        mergeSort(input, mid, end);
        merge(input, start, mid, end);
    }

    public static void merge(int[] input, int start, int mid, int end) {

        if (input[mid - 1] <= input[mid]) { // 1# Optimazation
            return;
            // we always use sorted arrays
        }

        int i = start;
        int j = mid;
        int tempIndex = 0;

        int[] temp = new int[end - start];
        while (i < mid && j < end) {
            temp[tempIndex++] = input[i] <= input[j] ? input[i++] : input[j++];
        }
        // #2 optimization

        System.arraycopy(input, i, input, start + tempIndex, mid - i);
        System.arraycopy(temp, 0, input, start, tempIndex);
    }

    // recursion
    // factorial recursive
    public static int recursiveFactorial(int num) {
        if (num == 0) return 1;
        return num * recursiveFactorial(num - 1);
    }

    // factorial iterative
    public static int iterativeFactorial(int num) {
        if (num == 0) return 1;

        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static void shellSort(int[] arr) {
        System.out.println("Shell Sort");
        // Unstable
        for (int gap = arr.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < arr.length; i++) {
                int newElement = arr[i];
                int j = i;
                while (j >= gap && arr[j - gap] > newElement) {
                    arr[j] = arr[j - gap];
                    j -= gap;
                }
                arr[j] = newElement;
            }
        }
        printArray(arr);
    }

    // Insertion Sort
    public static void insertionSort(int[] arr) {
        System.out.println("Insertion Sort");
        // Stable sort
        for (int firstUnsortedIdx = 1; firstUnsortedIdx < arr.length; firstUnsortedIdx++) {
            int newElement = arr[firstUnsortedIdx];
            int i;
            // arr[i - 1] is prevItem
            for (i = firstUnsortedIdx; i > 0 && arr[i - 1] > newElement; i--) {
                arr[i] = arr[i - 1];
            }
            arr[i] = newElement;
        }

        printArray(arr);
    }

    // Selection Sort
    public static void selectionSort(int[] arr) {
        System.out.println("Selection Sort");
        // Unstable
        for (int lastUnsortedIdx = arr.length - 1; lastUnsortedIdx > 0; lastUnsortedIdx--) {
            int largest = 0;
            for (int idx = 1; idx <= lastUnsortedIdx; idx++) {
                if (arr[idx] > arr[largest]) {
                    largest = idx;
                }
            }
            swap(arr, largest, lastUnsortedIdx);
        }
        printArray(arr);
    }

    // Bubble Sort
    public static void bubbleSort(int[] arr) {
        System.out.println("Bubble Sort");
        // Stable sort
        for (int lastUnsortedIdx = arr.length - 1; lastUnsortedIdx > 0; lastUnsortedIdx--) {
            for (int idx = 0; idx < lastUnsortedIdx; idx++) {
                if (arr[idx] > arr[idx + 1]) {
                    swap(arr, idx, idx + 1);
                }

            }
        }

        printArray(arr);
    }

    // printArray
    public static void printArray(int[] arr) {
        for (int item : arr) {
            System.out.println(item);
        }
    }

    // Swap method
    public static void swap(int[] arr, int i, int j) {
        if (i == j) return;

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

// Stable and unstable sort
// comes to play when you have duplicate values
// is the initial orders will be perserve
// unstable relative order of the duplicates items will not perserve
// Stable Sort
// The initial order is perserved
