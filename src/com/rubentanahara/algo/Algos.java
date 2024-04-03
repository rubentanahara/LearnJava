class Algos {
    public static void main(String[] args) {
        int[] arr = { 20, 35, -15, 7, 55, 1, -22 };
        bubbleSort(arr);
    }

    // Bubble Sort
    public static void bubbleSort(int[] arr) {
        for (int tailIndex = arr.length - 1; tailIndex > 0; tailIndex--) {
            for (int idx = 0; idx < tailIndex; idx++) {
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
        if (i == j)
            return;

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
