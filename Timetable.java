import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;

public class Timetable {

    public static void main(String[] args) {
        int numOfModules;
        Scanner input = new Scanner (System.in);
        String moduleCode;

        ArrayList<String> listOfModules = new ArrayList<>();

        //Ask how many modules user has
        System.out.println("How many modules do you have?: ");
        numOfModules = input.nextInt();

        //Loop through number of times entered
        do {
            System.out.println("Enter module code: ");
            moduleCode = input.next();
            listOfModules.add(moduleCode);
            numOfModules--;
        }
        while(numOfModules > 0);

        System.out.println(listOfModules);
    }
}
