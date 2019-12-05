package com.Learning;
import java.util.ArrayList;

public final class Int_Sorter {
    public static ArrayList<Integer> sort(ArrayList<Integer> array){
        ArrayList<Boolean> complete = new ArrayList<Boolean>();
        boolean done = false;
        boolean sorted = false;
        int length = array.size();
        int num;

        while(!done){
            for(int i=1;i<length;i++){
                if(array.get(i)<array.get(i-1)) {
                    num = array.get(i);
                    array.remove(i);
                    array.add(i-1, num);
                    complete.add(false);
                }else{
                    complete.add(true);
                }
            }


            if(complete.contains(false)==false){
                done = true;
            }
            complete.clear();
        }


        return array;
    }
}
