package org.Week2_lab.question4;

public class Triangle{
    public static void main(String[] args) {
        int rows = 5;
        for (int i = 1; i <= rows; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}