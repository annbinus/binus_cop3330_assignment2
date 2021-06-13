package oop.exercises.ex36;

import java.util.ArrayList;

public class computingStatistics {

    public static double average(ArrayList<String> list){
        int sum = 0;

        for(String str: list){
            sum += Integer.parseInt(str);
        }

        return ((double)sum/list.size());
    }

    public static int min(ArrayList<String> list) {

        int min = Integer.parseInt(list.get(0));

        for (int i = 1; i < list.size(); i++) {
            if (Integer.parseInt(list.get(i)) < min) {
                min = Integer.parseInt(list.get(i));
            }
        }

        return min;
    }
    public static int max(ArrayList<String> list){

        int max = Integer.parseInt(list.get(0));

        for (int i = 1; i < list.size(); i++) {
            if (Integer.parseInt(list.get(i)) > max) {
                max = Integer.parseInt(list.get(i));
            }
        }

        return max;
    }

    public static double std(ArrayList<String> list){

        double sum = 0;

        for(String str : list){
            sum += Math.pow((Double.parseDouble(str)-average(list)),2);
        }

        return (double)(Math.sqrt((sum/list.size()-1)));
    }
}