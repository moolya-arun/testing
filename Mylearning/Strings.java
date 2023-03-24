package Mylearning;

public class Strings {

        public static void main(String[] args) {
            String str = "Arun kumaar T s";
            String str2 ="India";
            String str3="India";

            System.out.println(str.toLowerCase());
            System.out.println(str.toUpperCase());
            System.out.println(str.contains("T"));
            System.out.println(str.charAt(3));
            System.out.println(str.endsWith("n"));
            System.out.println(str.length());
            System.out.println(str.indexOf(5));
            System.out.println(str3.startsWith("i"));
            System.out.println(str3.endsWith("i"));
            System.out.println(str3.equals(str2));
            System.out.println(str3.substring(4));
            System.out.println(str3.substring(1,4));







            int length = str.length();

            int doubleCount = 0;
            for (int i = 0; i < length - 1; i++) {
                if (str.charAt(i) == str.charAt(i+1)) {
                    doubleCount++;
                }
            }

            System.out.println("String: " + length);
            System.out.println("Double letters: " + doubleCount);

            if (str2.equals(str3)) {
                System.out.println("both the string are same");
            }
            else{
                System.out.println("both the string are different");
            }

        }
    }


