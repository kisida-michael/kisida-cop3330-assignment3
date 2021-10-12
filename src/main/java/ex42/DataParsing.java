package ex42;


import java.util.*;
import java.io.*;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Michael Kisida
 *
 * --------------------------------------------------------
 * Pseudocode
 *
 * Main
      printf(last, first, salary)
      call file function(input.txt)
  * filePrint
      *  open file name
      * create new scanner object
      * while input has line
      * String s = value of that line
      * Strin[] temp splits value into array for every comma
      * for (i <=2)
      * print with even spaces [tempi]
      * print newline
 */

public class DataParsing {
    public static void main(String[] args) throws IOException {
        System.out.printf("%-10s%-10s%-10s\n--------------------------\n", "Last", "First", "Salary");
        filePrint("src/exercise42_input.txt");

    }
    public static void filePrint(String filename) throws IOException {
        File data = new File(filename);
        Scanner input = new Scanner(data);

        while (input.hasNext()) {
            String s = input.nextLine();
            String[] temp = s.split(",");
            for(int i =0; i <=2; i++){
                System.out.printf("%-10s",temp[i]);
            }
            System.out.print("\n");

        }

    }








    }



