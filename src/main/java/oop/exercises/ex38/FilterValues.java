package oop.exercises.ex38;

import java.util.ArrayList;
import java.util.List;

public class FilterValues {

    public static ArrayList<Integer> convertList(List<String> list) {

        ArrayList<Integer> newList = new ArrayList<Integer>();

        for (String s : list) {
            newList.add(Integer.valueOf(s));
        }
        return newList;
    }

    public ArrayList<Integer> evenNumbers(ArrayList<Integer> list){
        for(int i=0; i<list.size(); i++){
            if((list.get(i) % 2) != 0){
                list.remove(i);
                i--;
            }
        }
        return list;
    }
}
