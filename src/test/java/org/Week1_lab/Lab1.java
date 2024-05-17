package org.Week1_lab;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

public class Lab1 {
    public static void main(String[] args) {
        printNameDetails("john","Men");
        switchCaseAgeChecker(20);
    }

    @Test
    public void bankBalanceFunction(){

        int bankBalance = 500;
        bankBalance +=250;
        bankBalance -=100;

        System.out.println("Bank balance : "+ bankBalance);
    }

    @Test
    public void celsiusCalculation(){
        double fahrenheit = 60;
        double celsius = ((fahrenheit-32)*5)/9;
        System.out.println("Celsius "+celsius);

    }

    public static void printNameDetails(String firstName,String lastName){
        String fullName = firstName +" "+ lastName;
        System.out.println("Hello my name is "+fullName);
        System.out.println("There are "+firstName.length() +" letters in my first name and "+ lastName.length()+" letters in my last name");

    }

    @Test
    public void ageChecker(int age){
        if(age >=18){
            System.out.println("You are an adult");
        }else {
            System.out.println("You are a minor");
        }
    }


    public static void switchCaseAgeChecker(int age){

        switch (age) {
            case 12:
                System.out.println("You are a child.");
                break;
            case 19:
                System.out.println("You are a teenager.");
                break;
            case 59:
                System.out.println("You are an adult.");
                break;
            default:
                if (age >= 60) {
                    System.out.println("You are a senior citizen.");
                } else {
                    System.out.println("Invalid age.");
                }
        }
    }

    @Test
    public  void decendingOrder(){
        int [] num ={1,2,3,4,5,6,7,8,8,9,10};
        Arrays.sort(num);

        for(int i=0;i<= num.length -1; i++){
            System.out.println(num[i]);
        }
    }


    @Test
    public void square(){
        for(int i=1; i < 4; i++ ){
            for(int o=1; o< 7; o++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    @Test
    public void whileloopDecendingOrder(){
        int counter = 10;

        while (counter > 0) {
            System.out.println(counter);
            counter--;
        }
        System.out.println("Liftoff!");
    }

}
