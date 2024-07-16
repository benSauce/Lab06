/*
 *  CS 2013
 *  Lab 6 - Pt 2 Maximum Increasingly Ordered Subsequence
 *  Benjamin Saucedo
 *  Find the Maximum Increasingly Ordered Subsequence
 */
import java.util.*;

public class Part_02 {
    public static void main(String[] args) throws Exception {
        //Prompt for string input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a String: ");
        //Store string
        String strInput = input.nextLine();
        //strInput = strInput.toLowerCase();
        //Create variables for counting
        String maxSubSequence = "";
        String strLastAddedValue = "";

        //check string length to begin counting
        if (!strInput.isEmpty()) {
            //Parse word by letter
            for (int i = 0; i < (strInput.length() - 1); i++) {
                String subStr = String.valueOf(strInput.charAt(i));
                strLastAddedValue = String.valueOf(strInput.charAt(i));
                //nested for loop
                for (int j = i; j < strInput.length() - 1; j++) {
                    //append char to str if greater than current char
                    if (strLastAddedValue.charAt(0) < strInput.charAt(j + 1)) {
                        strLastAddedValue = String.valueOf(strInput.charAt(j + 1));
                        subStr += String.valueOf(strInput.charAt(j + 1));
                    } // end if
                } //end for
                //record maxSubSequence
                if (subStr.length() > maxSubSequence.length()) {
                    maxSubSequence = subStr;
                }
            } // end for
            //Print result
            System.out.println("The maximum consecutive increasingly ordered subsequence:");
            System.out.println(maxSubSequence);
        } else {
            System.out.println("You must enter a String of at least length 1.");
        }

    }
}