package oop.exercises.ex27;

public class checkAllValid {
    public static int validName(String name){
        if (name.equals("")) {
            return -1;
        }
        else if (name.length() < 2) {
            return 0;
        }
        else{
            return 1;
        }

    }
    public static int validZIP(String zip){
        if (zip.equals("")) {
            return 1;
        }
        else if(zip.length() == 5) {
            for (char c : zip.toCharArray()) {
                if (!Character.isDigit(c)) {
                    return 0;
                }
            }
        }
        else
            return 1;
        return 1;
    }

    public static int validID(String ID){
        if (ID.equals("")) {
            return 1;
        }
        else{
            if(ID.length() == 7 && ID.substring(0,2).matches("[a-zA-Z]*") && ID.charAt(2) == '-' && ID.substring(3).matches("[0-9]*")){
                return 0;
            }
        }
        return 1;
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

        if (validID(ID) == 1) {
            System.out.println("The employee ID must be in the format of AA-1234. ");
        }

        if (validZIP(ZIP) == 1) {
            System.out.println("The zipcode must be a 5 digit number.");
        }
        else{
            System.out.println("There were no errors found.");
        }
    }
}