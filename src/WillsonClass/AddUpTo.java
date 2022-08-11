package WillsonClass;

/*
編寫一個名為"addUpTo()”的函數，參數為一個整數n，
return type為int，return應為 1 + 2 + 3 + … + (n - 1) + n的值

public static void main(String[] args) {
    System.out.println(addUpTo(10));
    System.out.println(addUpTo(100));
    System.out.println(addUpTo(1000));
    System.out.println(addUpTo(10000));
}

55
5050
500500
50005000

公式(1+100）×100÷2
*/




public class AddUpTo {

    public static int addUpTo(int n) {

        //我自己的解法
        int result = 0;
        result = (1+n) * n/2;
        return result;

        /*for loop 解法
        int result = 0;
        for (int i = 1; i <=n ; i++){
            result +=  i;
        }
        return result;
    */
    }

    public static void main(String[] args) {
        System.out.println(addUpTo(10));
        System.out.println(addUpTo(100));
        System.out.println(addUpTo(1000));
        System.out.println(addUpTo(10000));
    }


}



