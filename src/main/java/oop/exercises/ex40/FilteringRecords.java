package oop.exercises.ex40;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FilteringRecords {

    private ArrayList<Map> record = new ArrayList<Map>();

    public void recordbase(){
            Map<String, String> emp1 = new HashMap<>();
            emp1.put("Firstname","John");
            emp1.put("Lastname","Johnson");
            emp1.put("Position","Manager");
            emp1.put("Separation Date","2016-12-31");

            Map<String, String> emp2 = new HashMap<>();
            emp2.put("Firstname","Tou");
            emp2.put("Lastname","Xiong");
            emp2.put("Position","Software Engineer");
            emp2.put("Separation Date","2016-10-05");

            Map<String, String> emp3 = new HashMap<>();
            emp3.put("Firstname","Michaela");
            emp3.put("Lastname","Michaelson");
            emp3.put("Position","District Manager");
            emp3.put("Separation Date","2015-12-19");

            Map<String, String> emp4 = new HashMap<>();
            emp4.put("Firstname","Jake");
            emp4.put("Lastname","Jacobson");
            emp4.put("Position","Programmer");
            emp4.put("Separation Date","");

            Map<String, String> emp5 = new HashMap<>();
            emp5.put("Firstname","Jacquelyn");
            emp5.put("Lastname","Jackson");
            emp5.put("Position","DBA");
            emp5.put("Separation Date","");

            Map<String, String> emp6 = new HashMap<>();
            emp6.put("Firstname","Sally");
            emp6.put("Lastname","Webber");
            emp6.put("Position","Web Developer");
            emp6.put("Separation Date","2015-12-18");

            record.add(emp1);
            record.add(emp2);
            record.add(emp3);
            record.add(emp4);
            record.add(emp5);
            record.add(emp6);
        }



    public void containsSearch(String search){
        Map<String , String> map;


        for(int i=0; i<record.size(); i++){

            map = record.get(i);

            String fname = map.get("Firstname");
            String lname = map.get("Lastname");

            if (!(fname.contains(search) || lname.contains(search))){
                record.remove(i);
                i--;
            }
        }
    }

    public void print(){

        String output = "Name                | Position          | Separation Date\n--------------------|-------------------|----------------\n";


        for(int i=0; i<record.size(); i++){

            Map<String , String> map = record.get(i);

            String name = map.get("Firstname") + " " + map.get("Lastname");
            String format = String.format("%-20s|",name) +String.format("%-19s|",map.get("Position")) +String.format("%-20s",map.get("Separation Date")) + "\n";

            output += format ;
        }

        System.out.print(output);
    }
}
