package ex41;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Michael Kisida
 *
 * --------------------------------------------------------
 * Pseudocode
 *
 * Main
 *  call read file function with filename
 *  Sort
 *  sort the array of names with the sort function in java
 *     Count
 *     for loop to create a counter to see how many names there are
 *  output the array to a text file using PrintStream
 *
 * Read File
 *    /read into string/
 *    create a new file reader and buffered reader
 *    make a new list of strings and initiate line to null
 *    while there are lines in txt file add each line to a new line
 *    close text tile
 *    convert list of names to an array and return the array
 *
 */


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NameSorter
{

    public static void main( String[] args )throws IOException
    {

        String[] nameList = file("src/exercise41_input.txt");
        Arrays.sort(nameList);

        PrintStream out = new PrintStream("src/exercise41_output.txt");
        PrintStream console = System.out;
        System.setOut(out);
        int x = 0;
        for (String i: nameList){
            x ++;
        }
        System.out.println("Total of "+ x + " names\n-----------------");
        for (String sort: nameList){
            System.out.println(sort);
        }
    }

    public static String[] file(String filename) throws IOException {

        FileReader fileReader = new FileReader(filename);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        List<String> lines = new ArrayList<>();
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            lines.add(line);
        }
        bufferedReader.close();
        return lines.toArray(new String[0]);
    }



}

