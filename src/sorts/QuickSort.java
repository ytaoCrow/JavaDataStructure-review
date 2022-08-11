package sorts;

import java.util.Arrays;

public class QuickSort {

    private static void swap(int[] arr, int firstIndex, int secondIndex){
        int temp = arr[firstIndex];
        arr[firstIndex] = arr[secondIndex];
        arr[secondIndex] = temp;
    }
    private static int pivot(int[] arr, int pivotIndex, int endIndex){
       int swapIndex = pivotIndex;
       for(int i = pivotIndex + 1; i <= endIndex; i++){
           if(arr[i] < arr[pivotIndex]){
               swapIndex++;
               swap(arr, swapIndex, i);
           }
       }
       swap(arr, pivotIndex, swapIndex);
       return swapIndex;
    }

    private static void  quickSort(int[] arr, int left, int right){
    if(left < right) {
        int pivotIndex = pivot(arr, left, right);
        quickSort(arr, left, pivotIndex - 1);
        quickSort(arr, pivotIndex + 1, right);
        }
    }

    public static void main(String[] args) {
        int[] myArray = {4,6,1,7,3,2,5};
        quickSort(myArray, 0, 6);
        System.out.println(Arrays.toString(myArray));
    }
}
