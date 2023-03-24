package Mylearning;

public class Palindrome {
    public static void main(String[] args) {
        String str = "racecar";
        String revstr = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            revstr += str.charAt(i);
        }

        System.out.println("Reversed string: " + revstr);

        if (str.equals(revstr)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
}
