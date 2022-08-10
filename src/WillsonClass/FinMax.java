package WillsonClass;

/*
編寫一個名為"findMax()”的函數，
參數為一個array of Integers，return type為int，
返回的值為array當中所有元素當中，最大的那個。

public static void main(String[] args) {
    int[] array = {4, 3, 6, 7, 9, 10, 33, 0, -4, 12, 400, 133, 324, 1234231, 12334};
    System.out.println(findMax(array));
}

1234231
 */


public class FinMax {

    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
        public static void main(String[] args){
            int[] array = {4, 3, 6, 7, 9, 10, 33, 0, -4, 12, 400, 133, 324, 1234231, 12334};
            System.out.println(findMax(array));
        }
    }


