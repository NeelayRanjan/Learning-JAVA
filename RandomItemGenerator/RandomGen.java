package com.Learning;

import javax.swing.*;
import java.util.Scanner;

public class RandomGen{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What type of random item do you want:\nI for an Integer\n" +
                "D for a Decimal\nL for a Letter\nC for a coin flip\nR for a Dice Roll\n" +
                "B for a Byte\nM for a 8 by 8 bitmap");
        String prompt = scanner.nextLine();

        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        switch (prompt) {
            case "i":
            case "I":
                System.out.println((int) (Math.random() * 100));
                break;
            case "d":
            case "D":
                System.out.println(Math.random());
                break;
            case "l":
            case "L":
                int rand = (int) (Math.random() * 26);
                String letter = alphabet.substring(rand, rand + 1);
                System.out.println(letter);
                break;
            case "c":
            case "C":
                System.out.println((int) (Math.random() * 2));
                break;
            case "r":
            case "R":
                System.out.println((int) (Math.random() * 7));
                break;
            case "B":
                for (int i = 0; i <= 6; i++) {
                    System.out.print((int) (Math.random() * 2));
                }
                break;
            case "m":
            case "M":
                JFrame rect = new JFrame();
                rect.setSize(1000,1000);
                rect.setTitle("BitMap");
                rect.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                rect.setVisible(true);
                BitMapCreator image = new BitMapCreator();
                System.out.println("How large should it be, ie. if you wanted a 5 by 5 grid, input 5");
                int size = scanner.nextInt();
                System.out.println("How dense should it be, ie. if you wanted each square to be 5 by 5 pixels, input 5");
                int den = scanner.nextInt();
                image.setIterations(size);
                image.setDensity(den);
                rect.add(image);
                rect.setVisible(true);
                break;
        }
    }
}