package siva;

import java.util.Arrays;

public class practise {
    public static void main(String[] args) {
        int[] arr = { 53, -11, 99, 0, 0, 999, 42, 53, -3, 602, 9, 17, 54, 54, 602, 999, -11, 42, 999, -3, 54, 53, 17 };
        // int[] arr = {6,4,5,2,2,88,1};

        // bubbleSortPractise(arr);
        // cyclicSort(arr);
        // insertionSort(arr);
        // mergeSort1(arr, 0, arr.length - 1);
        // quickSort(arr, 0, arr.length - 1);
        // System.out.println("after quick sort"+Arrays.toString(arr));
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (high <= low) {
            return;
        }
        int start = low;
        int end = high;
        int pivot = start + (end - start) / 2;
        while (end - start > 0) {
            while (arr[start] < arr[pivot]) {
                start++;
            }
            while (arr[end] > arr[pivot]) {
                end--;
            }
            if (start <= end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
        quickSort(arr, low, end);
        quickSort(arr, start, high);
    }

    public static void mergeSort1(int[] arr, int i, int j) {
        int start = i, end = j;
        if (end - start <= 0) {
            return;
        }
        int mid = start + (end - start) / 2;

        mergeSort1(arr, start, mid);
        mergeSort1(arr, mid + 1, end);

        mergeSortHelper1(arr, start, mid, end);
    }

    // below method merge sorts by modifying the original array
    public static void mergeSortHelper1(int[] arr, int start, int mid, int end) {
        System.out.println(" ============== ");
        System.out.println("helper array 1 " + Arrays.toString(arr));
        System.out.println(" ============== ");
        int[] resultArray = new int[end - start + 1];
        int i = start, j = mid + 1, k = 0;
        while (i <= mid && j <= end) {
            if (arr[i] < arr[j]) {
                resultArray[k] = arr[i];
                i++;
            } else {
                resultArray[k] = arr[j];
                j++;
            }
            k++;
        }
        while (i <= mid) {
            resultArray[k] = arr[i];
            i++;
            k++;
        }
        while (j <= end) {
            resultArray[k] = arr[j];
            j++;
            k++;
        }

        for (int l = 0; l < resultArray.length; l++) {
            arr[start + l] = resultArray[l];
        }

    }

    // belowe method does merge sort but doesn't modifies the original array
    public static int[] mergeSort(int[] arr) {
        System.out.println("initial arr " + Arrays.toString(arr));
        int start = 0, end = arr.length;
        if ((end - 1) - start <= 0) {
            return arr;
        }
        int mid = start + (end - start) / 2;
        int[] t1 = mergeSort(Arrays.copyOfRange(arr, start, mid));
        int[] t2 = mergeSort(Arrays.copyOfRange(arr, mid, end));
        return mergeSortHelper(t1, t2);
    }

    public static int[] mergeSortHelper(int[] arr1, int[] arr2) {
        System.out.println(" ============== ");
        System.out.println("helper array 1 " + Arrays.toString(arr1));
        System.out.println("helper array 2 " + Arrays.toString(arr2));
        System.out.println(" ============== ");
        int[] resultArray = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                resultArray[k] = arr1[i];
                i++;
            } else {
                resultArray[k] = arr2[j];
                j++;
            }
            k++;
        }
        while (i < arr1.length) {
            resultArray[k] = arr1[i];
            i++;
            k++;
        }
        while (j < arr2.length) {
            resultArray[k] = arr2[j];
            j++;
            k++;
        }
        return resultArray;
    }

    public static void insertionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.println("========================");
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
            System.out.println("partially sorted array " + Arrays.toString(arr));
            System.out.println("======================");
        }
        System.out.println(" insertion sorted array is " + Arrays.toString(arr));
    }

    public static void cyclicSort(int[] arr) {
        // since the array lenght is 5 and limit is from 1 to 5, cyclic sort is
        // applicable
        // here...
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != i + 1) {
                int temp = arr[i];
                arr[i] = arr[temp - 1];
                arr[temp - 1] = temp;
            }
        }
        System.out.println("array after cyclic sort: " + Arrays.toString(arr));
    }

    public static void bubbleSortPractise(int[] arr) {
        System.out.println("BubbleSort is initiated...");

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j <= arr.length - 1; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("after sorting arr is " + Arrays.toString(arr));
    }
}
