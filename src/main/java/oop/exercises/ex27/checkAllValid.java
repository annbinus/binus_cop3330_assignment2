package oop.exercises.ex27;

public class checkAllValid {
    public static int validName(String name){
        int flag = 0;
        if (name.equals("")) {
            flag = -1;
        }
        else if (name.length() < 2) {
            flag = 0;
        }
        else{
            flag = 1;
        }

        return flag;
    }
    public static int validZIP(String zip){
        int flag = 1;

        if (zip.equals("")) {
            flag = 0;
        }
        if(zip.length() == 5) {
            for (char c : zip.toCharArray()) {
                if (!Character.isDigit(c)) {
                    flag = 0;
                    break;
                }
            }
        }
        return flag;
    }

    public static int validID(String ID){

       int flag = 1;
        if (ID.equals("")) {
            flag = 0;
        }
        else{
            if(ID.length() == 7 && ID.substring(0,2).matches("[a-zA-Z]*") && ID.charAt(2) == '-' && ID.substring(3).matches("[0-9]*")){
                flag = 1;
            }
            else
                flag = 0;
        }
        return flag;
    }

    public static void validateInput(String fname, String lname, String ZIP, String ID){

        if (validName(fname) == 0) {
            System.out.println("The first name must be at least 2 characters long.");
        }
        else if (validName(fname) == -1) {
            System.out.println("The first name must be at least 2 characters long.\nThe first name must be filled in.");
        }


        if (validName(lname) == 0) {
            System.out.println("The last name must be at least 2 characters long.");
        }
        else if (validName(lname) == -1) {
            System.out.println("The last name must be at least 2 characters long.\nThe last name must be filled in.");
        }

        if (validID(ID) == 0) {
            System.out.println("The employee ID must be in the format of AA-1234. ");
        }

        if (validZIP(ZIP) == 0) {
            System.out.println("The zipcode must be a 5 digit number.");
        }
        else{
            System.out.println("There were no errors found.");
        }
    }
}