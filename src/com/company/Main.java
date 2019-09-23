package com.company;

import javafx.beans.binding.DoubleExpression;

import java.util.Scanner;

public class Main {
int userHeight, userWeight;
    public static void main(String[] args) {
	// write your code here
//p1
        Scanner keyboard;
        keyboard = new Scanner(System.in);
    String feet;
    Double inches;
    String name;
    Double weight;
int imp;

//p2
        System.out.println("Hello,What is your name");
        name= keyboard.nextLine();
        System.out.print("Hello "+ name);
        System.out.println(",Welcome to your BMI calculator");
        System.out.println("What is your height in inches");
        inches= keyboard.nextDouble();
       System.out.println("What is your weight in pounds");
        weight= keyboard.nextDouble();
       imp= 703;

       System.out.println(" " );
       System.out.println(imp*weight/(inches*inches));











    }

}
