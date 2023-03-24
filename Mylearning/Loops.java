package Mylearning;

import javax.sound.midi.SysexMessage;

public class Loops {

    public static void main(String[] args){
        printNumbers();
        printNum();
    }

    public static void printNumbers(){

        int i=1;
        while(i<10){
            System.out.println(i);
            i++;
            
        }

    }

    public static void printNum() {
        for (int i = 0; i <= 10; i++) {
            for (int j = 0; j <= 10; j++) {

                System.out.println("j=" + j);
                System.out.println("i=" +i);
                System.out.println("*********");

            }
        }
    }}
