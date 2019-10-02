package com.learn_Data_types;

public class string {

    public static void main(String[] args) {
        String myString = "This is a string";
        String mySecondString = myString + ", and this is my second string";
        String myThirdString = mySecondString + ", woah that's a unicode symbol \u221E";
        System.out.println(myThirdString);

        String numString = "200";
        String num2String = "100";
        System.out.println(num2String + numString + ", Java does not manipulate numbers in strings");
    }
}
