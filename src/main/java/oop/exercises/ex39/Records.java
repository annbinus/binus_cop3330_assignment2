package oop.exercises.ex39;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Records {

    private ArrayList<Map> record = new ArrayList<Map>();

    public void recordbase(){
        Map<String, String> employee1 = new HashMap<>();
        employee1.put("Firstname","John");
        employee1.put("Lastname","Johnson");
        employee1.put("Position","Manager");
        employee1.put("Separation Date","2016-12-31");

        Map<String, String> employee2 = new HashMap<>();
        employee2.put("Firstname","Tou");
        employee2.put("Lastname","Xiong");
        employee2.put("Position","Software Engineer");
        employee2.put("Separation Date","2016-10-05");

        Map<String, String> employee3 = new HashMap<>();
        employee3.put("Firstname","Michaela");
        employee3.put("Lastname","Michaelson");
        employee3.put("Position","District Manager");
        employee3.put("Separation Date","2015-12-19");

        Map<String, String> employee4 = new HashMap<>();
        employee4.put("Firstname","Jake");
        employee4.put("Lastname","Jacobson");
        employee4.put("Position","Programmer");
        employee4.put("Separation Date","");

        Map<String, String> employee5 = new HashMap<>();
        employee5.put("Firstname","Jacquelyn");
        employee5.put("Lastname","Jackson");
        employee5.put("Position","DBA");
        employee5.put("Separation Date","");

        Map<String, String> employee6 = new HashMap<>();
        employee6.put("Firstname","Sally");
        employee6.put("Lastname","Webber");
        employee6.put("Position","Web Developer");
        employee6.put("Separation Date","2015-12-18");

        record.add(employee1);
        record.add(employee2);
        record.add(employee3);
        record.add(employee4);
        record.add(employee5);
        record.add(employee6);
    }

    public String[] sort(){

        String newList = "";

        for(int i=0; i<record.size(); i++){

            Map tool = record.get(i);
            newList += tool.get("Lastname")+" ";

        }

        String[] order= newList.split(" ");
        Arrays.sort(order);

        return order;
    }

    public void print(){

        String output = "Name                | Position          | Separation Date\n--------------------|-------------------|----------------\n";

        String[] sortLNames = sort();

        for(int i=0; i< sortLNames.length; i++){
            for(int j=0; j<record.size(); j++){

                Map<String, String> map1 = record.get(j);
                
                String check = map1.get("Lastname");

                if(sortLNames[i].equals(check)){

                    Map<String, String> map2 = record.get(j);

                    String name = map2.get("Firstname") + " " + map2.get("Lastname");

                    String format = String.format("%-20s|",name) +String.format("%-19s|",map2.get("Position")) +String.format("%-20s",map2.get("Separation Date")) + "\n";

                    output += format ;
                    break;
                }
            }
        }
        System.out.print(output);

    }

}
