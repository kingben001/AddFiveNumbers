package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        double total = 0;
        
        for (int i = 1; i <= 5 ; i++ ){
            System.out.println("What is your number");
            double num = keyboard.nextDouble();
             total = total + num;

        } System.out.println(total);
    }
}
