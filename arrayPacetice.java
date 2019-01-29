import java.util.Scanner;
import java.util.ArrayList;

public class arrayPacetice {

    public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in);
        boolean keepGoing = true;
        String choice;
        ArrayList<String> ar = new ArrayList<String>();

        do {

            System.out.println("enter stuff for program");
            ar.add(keyboard.nextLine());

            System.out.println("do you want to enter more?");
            choice = keyboard.nextLine();
            char ch = choice.charAt(0);

            if(ch == 'y' || ch == 'Y'){
                keepGoing = true;
            } else if(ch == 'N' || ch == 'N') {
                keepGoing = false;
            } else {

            }
        } while(keepGoing = true);

    }

} // end of public class array
