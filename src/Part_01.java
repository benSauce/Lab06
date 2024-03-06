import java.util.*;

public class Part_01 {
    public static void main(String[] args) throws Exception {
        //Prompt for string input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a String: ");
        //Store string
        String strInput = input.nextLine();
        //Create variables for counting
        int subStrCount = 0;
        int maxCount = 0;

        //check string length to begin counting
        if ((strInput.length()) > 0) {
            String subStr = String.valueOf(strInput.charAt(0));;
            subStrCount = 1;
            maxCount = 1;
            //Parse word by letter
            for (int i = 0; i < (strInput.length() - 1); i++) {
                //count
                if (strInput.charAt(i) < strInput.charAt(i + 1)) {
                    subStrCount++;
                    subStr += String.valueOf(strInput.charAt(i + 1));
                    if (subStrCount > maxCount) {
                        maxCount = subStrCount;
                    } //end if
                } //end if
                else {
                    //reset count
                    subStrCount = 1;
                    subStr = "";
                }
                //Print result
            } // end for
            System.out.println("The maximum consecutive increasingly ordered substring:");
            System.out.println(subStr + " | count: " + maxCount);
        } else {
            System.out.println("You must enter a String of at least length 1.");
        }

    }
}