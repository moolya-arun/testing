package Mylearning;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Hello world";
        String revstr = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            revstr += str.charAt(i);
        }

        System.out.println("Reversed string: " + revstr);
    }
}

