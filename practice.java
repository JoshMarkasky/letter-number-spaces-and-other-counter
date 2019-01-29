import java.util.Scanner;
import java.util.*;

public class practice {

    public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in);
        int numbers, letters, spaces, totalCount, others;
        boolean keepGoing = true;
        String input, answer;

        do{
            numbers = 0;
            letters = 0;
            spaces = 0;
            others = 0;

            System.out.println("Please enter words you wish to count");
            input = keyboard.nextLine();
            char [] ch = input.toCharArray();
            for(totalCount = 0; totalCount < input.length(); totalCount++){
                if(Character.isLetter(ch[totalCount])){
                    letters++;
                } else if(Character.isDigit(ch[totalCount])){
                    numbers++;
                } else if(Character.isSpaceChar(ch[totalCount])){
                    spaces++;
                } else {
                    others++;
                }
            } // end of for loop

            System.out.println("Total count is: " + totalCount);
            System.out.println("total letters used: " + letters);
            System.out.println("total number used: " + numbers);
            System.out.println("total number of spaces: " + spaces);
            System.out.println("Total others signs used: " + others);

            System.out.println("do you wish to use different words?? (y/n)");
            answer = keyboard.nextLine();
            char charanswer = answer.charAt(0);
            if(charanswer == 'y' || charanswer == 'Y'){
                keepGoing = true;
            } else if(charanswer == 'n' || charanswer == 'N'){
                System.out.println("Program has ended");
                keepGoing = false;
                System.exit(0);
            } else {
                System.out.println("invalid choice, program ended");
                keepGoing = true;
            }

        } while (keepGoing = true);

    } // end of main

} // end of class Practice
