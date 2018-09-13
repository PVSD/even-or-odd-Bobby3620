package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner kbInput = new Scanner(System.in);

        //Enter an int
        System.out.println("Enter an integer: ");
        int kbInt = kbInput.nextInt();
        int kbEven = kbInt % 2;

        if(kbEven == 0){
            System.out.println("The integer " + kbInt + " is even.");
        }else {
            System.out.println("The integer " + kbInt + " is odd.");
        }


        //Decides if odd or even


    }
}
