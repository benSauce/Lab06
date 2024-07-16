import java.util.*;

public class Part_03 {
    public static void main(String[] args) throws Exception {
        //Prompt for string input
        Scanner input = new Scanner(System.in);

        //assign s1 and s2 input values
        System.out.print("Enter a string s1: ");
        String s1 = input.nextLine();

        System.out.print("Enter a string s2: ");
        String s2 = input.nextLine();

        //set default values
        int index = -1;
        int count = 0;

        //this for loop will iterate through the elements of the first string to determine
        //where the index of the first matching character in the second string
        for(int i = 0; i < s1.length(); i++) {
            //find index of initial matching characters
            if(s1.charAt(i) == s2.charAt(0) && count == 0) {
                index = i;
                count++;
            //check for matching of following characters
            } else if (s1.charAt(i) == s2.charAt(count)) {
                count++;
            // else reset initial values
            } else {
                count = 0;
                index = -1;
            }
            // check if s2 has been fully checked, break if fully checked
            if(count == s2.length()) {
                break;
            }
        }

        //display the index of first instance of matching characters
        if(index >= 0) {
            System.out.println("Matched at index: " + index);
        } else {
            //if there is no match it will display no match
            System.out.println("No match");
        }
    }
}
