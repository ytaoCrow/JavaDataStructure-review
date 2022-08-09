package sorts;
import java.util.Arrays;


public class BubbleSort {
        public static void bubbleSort(int[] array){

            //6個位置但我只要做5次比較，故array.length總長度 - 1，length為陣列的總長度。
            // i-- 類似做空，做到他沒錢0了就停止
            for (int i = array.length - 1; i > 0; i--){

            //第一次運行五次比較，第二次運行四次比較
                for (int j = 0; j < i; j++){

                    //比較前後，如果j的位置 數值 大於j+1位置的 數值，則j跟j+1交換
                    if(array[j] > array[j+1]){

                        //我宣告了temp這個變數 指向 array[j] 的記憶體，記憶體初始值為0
                        int temp = array[j];

                        //交換位置，指向j+1的記憶體位置
                        array[j] = array[j+1];

                        //將結果複製j+1並指向temp
                        array[j+1] = temp;
                    }
                }
            }
        }

        public static void main(String[] args) {
            int[] myArray = {4,2,6,5,1,3};
            bubbleSort(myArray);
            System.out.println(Arrays.toString(myArray));
        }
    }
