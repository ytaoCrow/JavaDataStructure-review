package sorts;

import java.util.Arrays;

public class SelectionSort {

    public static void selectionSort(int[] array){
        //執行陣列長度的次數
        for(int i = 0; i < array.length;i++){

            //宣告minIndex指向i，也就是陣列索引i = 0，第0個位置開始
            int minIndex = i;

            //宣告陣列索引為j，並放入i的第二個位置，執行陣列長度的次數loop
            for(int j = i+1; j < array.length;j++){

                //判斷i第二個位置的數值小於i的起始位置
                if (array[j] < array[minIndex]) {

                    //則不交換
                    minIndex = j;
                }
            }
            //如果上面判斷失敗，判斷 i 不等於 j(minIndex)，則開始交換位置
            if (i != minIndex){
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
        }
    }


    public static void main(String[] args) {
        int[] myArray = {4,2,6,5,1,3};
        selectionSort(myArray);
        System.out.println(Arrays.toString(myArray));
    }
}
