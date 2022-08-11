package WillsonClass;

public class Position {
    public static void main(String[] args) {
        position("abcd"); // prints -1
        position("AbcD"); // prints A 0
        position("abCD"); // prints C 2
    }

    public static void position(String s) {
        boolean found = false;
        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            if (Character.toUpperCase(c) == c) {
                System.out.println(c + " " + i);
                found = true;
                return;
            }

        }
        if(!found){
            System.out.println(-1);
        }
    }
}