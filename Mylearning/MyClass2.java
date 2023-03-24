package Mylearning;

public class MyClass2 {
    //static int i =0;
    int i=5;
//using static keyword

    public static void main(String[] args){
//using object for class using new keyword

        MyClass2 obj2 = new MyClass2();

        System.out.println("Automation session");
        System.out.println(obj2.i);

        Person Person = new Person();
        Person.age=28;
        Person.name="STR";

        Person.printPersonalDetails();



    }
}
