package Mylearning;

public class Person {

    int age;
    double weight ;
    String name ;
    final static String Hometown = "Bangalore";

    public static void main(String[] args) {

        Person obj1 = new Person();
        obj1.age = 29;
        obj1.name = "Arun";
        obj1.weight = 80.1;


        Person obj2 = new Person();
        obj2.name = "Dingu";
        obj2.age = 25;
        obj2.weight = 75.6;

        //  System.out.println(obj1.name);
        // System.out.println(obj1.age);
        //System.out.println(Person.Hometown);
        //System.out.println(obj1.weight);

        //System.out.println("----------");

        //System.out.println(obj2.name);
        //System.out.println(obj2.age);
        //System.out.println(Person.Hometown);
        //System.out.println(obj2.weight);


        obj1.printPersonalDetails();
        obj2.printPersonalDetails();
    }

        public void printPersonalDetails(){
            System.out.println(name);
            System.out.println(age);
            System.out.println(Person.Hometown);
            System.out.println(weight);
            System.out.println("******************");






}}
