//  Programmer: Joseph Benson
//  Date: 6 Nov 2019
//  Name: Sort ArrayList in Ascending Order
//  Purpose:  M07 Programming Assignment, 11.11
//            Create a sort method.  Sort a user entered list of
//            five integers and display them in increasing order.


package com.company;

import java.util.ArrayList;                                                     // imports ArrayList
import java.util.Scanner;                                                       // imports Scanner

public class Main {

    public static void main(String[] args) {

        // Declarations
        Scanner input = new Scanner(System.in);                                 // Creates new Scanner object
        ArrayList<Integer> list = new ArrayList<>();                            // Creates array for user entered numbers

        System.out.println("You will now be prompted to enter an integer five times.");

        // Obtain 5 integers from the user
        //    In reality this needs some kind of catch block to make sure no doubles are entered, but lets place nice and enter just integers
        for (int i = 1; i < 6; i++) {                               // Begin entry for-loop for KNOWN size of 5 elements
            System.out.println("Enter integer #" + i + ": ");       // Prompt user for integer
            list.add(input.nextInt());                              // Accept input and add it to the arraylist
        }

        System.out.println("You entered: " + list.toString());  //  Repeats entered numbers to user

        // Sends arraylist to sorting method
        sort(list);

    }     //  End of Main method


    // Method to sort arrayList of integers in ascending order
    public static void sort(ArrayList<Integer> list) {

        ArrayList<Integer> sortedList = new ArrayList<>();                                                  // Creates array for the sorted numbers

        //  Outer loop to cycle through KNOWN size array list of 5 elements
        for (int sortedListCount = 0; sortedListCount < 5; sortedListCount++) {                             // Would need to pass size into method for unknown sized list

            int currentSmallestNumber = list.get(0);                                                        // sets the smallest # to index 0 of the current array list

            //  Inner loop to determine the smallest number in the current array list
            for (int smallestNumberCount = 0; smallestNumberCount < list.size(); smallestNumberCount++) {   // starts loop for size of current array list
                if (list.get(smallestNumberCount) < currentSmallestNumber)                                  // compares current smallest # to # at list[count]
                    currentSmallestNumber = list.get(smallestNumberCount);                                  // sets list[count] to current smallest # if it is smaller

            }     // End of inner loop


            // get the index of that smallest number from "list"
            int nextToAssign = list.indexOf(currentSmallestNumber);                                         // Gets the index # of the current smallest #

            // remove the number at that index in "list"
            int smallestNumberRemoved = list.remove(nextToAssign);                                          // This reduces the size of the array list

            // assign that number to sortedList[sortedListCount] which will put it in ascending order
            sortedList.add(smallestNumberRemoved);                                                          // This works because this array is empty at the start

        }     // End of outer loop

        //  Prints out the sorted list
        System.out.println("The sorted list is: " + sortedList.toString());

    }     // THE END



}
