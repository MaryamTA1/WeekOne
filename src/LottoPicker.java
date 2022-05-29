/*
     LottoPicker will generate and print out 5 distinct random numbers between 0-30 to the user
         1 - Figure out how to generate a random number
         2 - Repeat step 1, 5 times
         3 - We need to store the results of step 2
         4 - We need to find a way to print the results that were stored along the way
*/

import java.util.Random;

//   This is a single line
public class LottoPicker {
    public static void main(String[] args) {
        // dataType variableName = theValueToBeStored
        String nameOfIt = "Application starting...";
        System.out.println(nameOfIt);

        Random rand = new Random();

        int NumberCount = 0;
        int total = 5;

        while (NumberCount < total) {
            int randomNumber = rand.nextInt(30);
            System.out.println(randomNumber);
            NumberCount = NumberCount + 1;
        }
    }
}

