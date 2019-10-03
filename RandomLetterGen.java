package com.Learning;

import java.util.Scanner;

public class RandomLetterGen {

    public static void main(String[] args) {
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many random letters do you want: ");
        String output = scanner.nextLine();
        scanner.close();
        int count = Integer.parseInt(output);

        for(int i=0; i<=count; i++){
            int rand = (int)(Math.random()*26);
            String letter = alphabet.substring(rand,rand+1);
            System.out.print("\n"+letter);
        }
    }
}
