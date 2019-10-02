package com.learn_Data_types;

public class Byte_Int_Short_Long {

    public static void main(String[] args) {
	int myMinInt = -2147483648;
	int myMaxInt = 2147483647;
	// Use a Int for very large numbers and calculations
    // Has a width of 32

    byte myMinByte = -128;
    byte myMaxBtye = 127;
    // Use a byte for efficiency and to conserve memory
    // Has a width of 8

    short myMinShort = -32768;
    short myMaxShort = 32767;
    // Use a short only if a byte is not enough
    // Has a width of 16

    long myMinLong = -9223372036854775808L;
    long myMaxlong = 9223372036854775807L;
    // Use only if dealing with extremely large numbers
    // Has a width of 64
    // Important: put a uppercase "L" by the end of the number
    // to tell the computer that it is a long

    }
}
