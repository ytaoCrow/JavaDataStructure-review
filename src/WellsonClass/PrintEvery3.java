package WellsonClass;

/*
編寫一個名為“printEvery3()”的函數，它打印出等差數列 1, 4, 7, …, 88。

public static void main(String[] args) {
    printEvery3();
}

*/


public class PrintEvery3 {

    public static void  printEvery3(){
        for (int i =1;i<=88;i+=3){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        printEvery3();
    }
}

