package Mylearning;

public class ArrayTypes {

    public static void main(String[] args) {
        int i = 10;
        String str = "arunkumaar ts";

        int num[] = {1, 2, 3, 4, 50, 60, 70, 10};
        String strArray[] = {"arun", "Dingu", "Kumaar"};

int numArray [][]= new int[2][6];
        numArray[0][0]=40;
        numArray[0][1]=44;
        numArray[0][2]=50;
        numArray[0][3]=54;
        numArray[0][4]=64;
        numArray[0][5]=60;

        numArray[1][0]=40;
        numArray[1][1]=44;
        numArray[1][2]=50;
        numArray[1][3]=54;
        numArray[1][4]=64;
        numArray[1][5]=60;

        int j;
        for(j=0; j<numArray.length; j++){
            System.out.println(numArray[j]);
        }





    }
}