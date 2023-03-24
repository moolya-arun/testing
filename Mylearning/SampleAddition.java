package Mylearning;

public class SampleAddition {

    public static void main(String[] args){
        SampleAddition sample = new SampleAddition();
        int sumOfTwoNumbers;
        sumOfTwoNumbers = sample.addNumbers(10,50);
        System.out.println("Sum of two numbers: "  + sumOfTwoNumbers);
        int isEven = sumOfTwoNumbers %2;
        System.out.println(isEven);

    }
     //public static void addNumbers(int a, int b){
    //int sum= a + b;
    //System.out.println(sum);
    public int addNumbers(int a, int b){
        int sum= a +b;
        return sum;








}
}

