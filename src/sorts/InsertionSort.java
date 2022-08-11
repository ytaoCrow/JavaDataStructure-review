package sorts;

import java.util.Arrays;

public class InsertionSort {

    public static void insertionSort(int[] arr){
        for (int i = 1; i< arr.length;i++){//執行陣列的長度
            int temp = arr[i];//宣告一個temp 裡面放入arr的第i項
            int j = i - 1;//宣告一個j 指向i的位置-1，也就是當i位置指向1，則j指向0的位置
            while (j > -1 && temp < arr[j]){//判斷j不能為-1和temp = arr[i]2裡面的數值 小於 arr[j]1裡面的數值
                arr[j+1] = arr[j];//把值往後移一個位置，也就是原本在j的位置+1
                arr[j] = temp;//因為j[2]的數值比j[1]小，所以將數值移到j[1]
                j--;//執行比較次數-1，直到inedx = [0]
            }
        }
    }

    public static void main(String[] args) {//建構子與回傳值
        int[] myArray = {4,2,6,5,1,3};
        insertionSort(myArray);
        System.out.println(Arrays.toString(myArray));
    }
}
