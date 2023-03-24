package Mylearning;

public class LargerNumber {


    public static void main(String[] args) {
        LargerNumber obj = new LargerNumber();
        obj.isLargerNumber(34, 34);
       obj.getWeekDays(4);
    }


    public void isLargerNumber(int a, int b) {

        if (a < b) {
            System.out.println("Print a is larger number :" + a);
        } else if (a > b) {
            System.out.println("Print b is larger number :" + b);
        } else {
            System.out.println("Print a and b are equal number:" + a + b);
        }
    }

    public void getWeekDays(int num){
        switch(num){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            default:
                System.out.println("Weekend");
                break;

        }
        {

        }
    }
}



