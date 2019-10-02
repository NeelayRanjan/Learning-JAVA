package com.User_Input;

import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your year of birth:");

        boolean hasNextInt = scanner.hasNextInt();

        if(hasNextInt) {
            int yearOfBirth = scanner.nextInt();
            scanner.nextLine(); // handle next line character (enter key)

            System.out.println("Enter your name: ");
            String name = scanner.nextLine();
            int age = 2018 - yearOfBirth;

            if(age >= 0 && age <= 120) {
                System.out.println("Your name is " + name + ", and you are " + age + " years old.");
            } else {
                System.out.println("Invalid year of birth, you are not "+ age +" years old");
            }
        } else {
            System.out.println("Input is in incorrect format; needed integer");
        }

        scanner.close();
    }
}
