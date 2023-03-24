package Mylearning;

public class IfClass {


public static void main(String[] args) {
    IfClass obj = new IfClass();
    obj.isOddEven(21);
}

        public void isOddEven(int num) {
        if (num% 2 == 0) {
            System.out.println("number is even:"+ num);}
            else {
            System.out.println("number is odd:" + num);
        }
        }
    }
