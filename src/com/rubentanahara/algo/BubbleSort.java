// 1.BubbleSort
public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = { 33, 44, 12, -2, -66, 76, 324, 4, 15 };
        System.out.println(arr);

    }

    public static void bubbleSort(int[] arr) {
        for (int lastSortedIndex = arr.length - 1; lastSortedIndex >= 0; lastSortedIndex--) {
            for (int j = lastSortedIndex; j < arr.length; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }

            }

        }
    }

    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }

    public static void printArray(int[] arr) {
        for (int element : arr) {
            System.out.println(element);

        }
    }
}
