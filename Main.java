package com.Learning;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<Integer>();

        for(int i=0;i<=100;i++){
            array.add((int)(Math.random()*100));
        }

        System.out.println("Initial Array: "+ array);
        System.out.println("Sorted Array: "+ Int_Sorter.sort(array));
    }
}
