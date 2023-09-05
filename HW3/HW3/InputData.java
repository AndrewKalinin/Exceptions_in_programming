package HW3;

import java.util.Scanner;

public class InputData {
    public String[] enterData() {
        Scanner iScanner = new Scanner(System.in);
        while (true){
            System.out.println("Enter a string separated by a SPACE (the string must contain your full name, date of birth - dd.mm.yyyy, phone number - numbers, gender - f/m) : ");
            String data = iScanner.nextLine();
            String[] arrayData = data.split(" ");
            if (arrayData.length == 6) {
                return arrayData;
            } else if (arrayData.length < 6){
                System.out.println("you have not entered all the data, please try again");
            } else System.out.println("you entered more data, please try again");
        }

    }
}