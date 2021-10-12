package ex45;


/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Michael Kisida
 *
 * --------------------------------------------------------
 * Pseudocode
 *
 * Main
 *    create string with input  file String = (txt file);
 *    request input for output file name
      call function to replace  words
      sentence  = replace(sentence);
      call print function(setence, ouput
 *
 * Read File
 *    /read into string/
 *    return the string
 *
 * Replace
 * replace = sentence(replace all,  utilize,  use) replaces all instances
 * replace = sentence(replace all,  utilizes,  uses);
 * return string
 *
 * Print
 * printstream = out (create output.txt)
 * console = System.out
 * set.out to file
 * print replaced string  to output text file;
 */

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;


public class App {
    public static void main(String[] args ) throws IOException {

        String sentence = file("src/exercise45_input.txt");
        Scanner input = new Scanner(System.in);
        System.out.print("Output File Name: ");
        String outputName = input.nextLine();
        sentence = replace(sentence);
        print(sentence, outputName);
    }

    public static String file(String filename) throws IOException {

        String str;
        str = new String(Files.readAllBytes(Paths.get(filename)));
        return str;
    }
    public static String replace(String sentence) {
        String replace;
        replace = sentence.replaceAll("\\butilize\\b", "use");
        replace = sentence.replaceAll("\\butilizes\\b", "uses");
        return replace;
    }
    public static void print(String strReplaced, String output) throws FileNotFoundException {


        PrintStream out = new PrintStream("src/" + output +".txt");
        PrintStream console = System.out;
        System.setOut(out);
        System.out.println(strReplaced);
    }
}

