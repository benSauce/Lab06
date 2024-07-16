import java.util.LinkedList;
import java.util.*;

public class Part_04 {
    public static void main(String[] args) throws Exception {
        //Prompt for string input
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a sequence of integers ending with 0: ");
        LinkedList<Integer> numList = new LinkedList<Integer>();

        //prompts the user to enter an integer
        int num = input.nextInt();

        //Add numbers to numList until 0 is entered
        while(num != 0) {
            numList.add(num);
            num = input.nextInt();
        }

        //set initial values of trackers
        int currentNum = numList.getFirst();
        int numOfOccurences = 0;
        int counter = 0;
        int maxIndex = 0;
        //track number of most consecutives
        int valOfMaxOccurence = currentNum;

        //this for loop will iterate through the elements in numList to find the longest
        //subsequence of the same numbers
        for(int i = 0; i < numList.size(); i++) {
            //if the numbers match increment counter by 1
            if(numList.get(i) == currentNum) {
                counter++;
                //if current counter is > than numOfOccurences update values
                if(counter > numOfOccurences) {
                    numOfOccurences = counter;
                    maxIndex = i - counter + 1;
                    valOfMaxOccurence = currentNum;
                }
            } else {
                //assign new current number and counter to 1
                currentNum = numList.get(i);
                counter = 1;
            }
        }

        //displays the longest subsequence with the same number
        System.out.println("The longest same number subsequence starts at index " + maxIndex + " with " + numOfOccurences + " values of " + valOfMaxOccurence);

    }
}
