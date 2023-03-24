package Mylearning;
public class Constructor {
    String name,company; int age, headcount;
    double weight ;
    final static String project = "jupiter.money";
    public Constructor (String name, int age, String company, double weight, int headcount) {
        this.name = name;
        this.age = age;
        this.company = company;
        this.weight = weight;
        this.headcount = headcount;
    }
    public static void main(String[] args) {

        Constructor obj1 = new Constructor("arun",28,  "Moolya",  40,  587);
        Constructor obj2 = new Constructor( "dingu", 30,"Jupiter",60,  587);
        Constructor obj3 = new Constructor( "Prateek", 30,"Jupiter",80,  587);
        Constructor obj4 = new Constructor( "snehal", 20,"Moolya",60,  587);
        Constructor obj5 = new Constructor( "preetham", 27,"Moolya",60,  587);

        obj1.printPersonalDetails();
        obj2.printPersonalDetails();
        obj3.printPersonalDetails();
        obj4.printPersonalDetails();
        obj5.printPersonalDetails();
    }

    public void printPersonalDetails(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Weight: " + weight);
        System.out.println("Company: " + company);
        System.out.println("Company size: "+ headcount);
        System.out.println("Project name : "+ Constructor.project);

        System.out.println("    ");

        System.out.println("*******************************************");
        System.out.println("    ");




    }



}
