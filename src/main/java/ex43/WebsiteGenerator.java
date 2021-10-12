package ex43;

/*
*  UCF COP3330 Fall 2021 Assignment 3 Solution
*  Copyright 2021 Michael Kisida
*
* --------------------------------------------------------
* Pseudocode
*
* Main
* scanner input
* print inputs
* createdDir function (js, css, name)
* createHtml function( author, name)
*
* CreateDir
*   string(/filelocation)
*   create directories for each folder
*
* CreateHtml
* String(/filelocation)
* String(htmlIndex Data)
* create(index.html(
* pass string to html file
* close html file
*/

import java.util.Scanner;
import java.io.*;
public class WebsiteGenerator

{
    public static void main( String[] args ) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        System.out.print("Site name: ");
        String name  = input.nextLine();
        System.out.print("Author: ");
        String author  = input.nextLine();
        System.out.print("Do you want a folder for JavaScript? ");
        String jsFolder  = input.nextLine();
        System.out.print("Do you want a folder for CSS? ");
        String cssFolder  = input.nextLine();
        createDir(jsFolder, cssFolder,  name);
        createHtml(author, name);
        System.out.println(jsFolder);

    }
    public static void createDir(String dir1,  String dir2,  String dir3){
       String websiteFolder =  ("src/main/java/ex43/" + dir3);
       String cssFolder =  ("src/main/java/ex43/" + dir3 + "/css");
       String jsFolder =  ("src/main/java/ex43/" + dir3 + "/js");
        new File(websiteFolder).mkdirs();
        System.out.println("Created ." + websiteFolder);

        if (dir1.equals("Y")) {
            new File(jsFolder).mkdirs();
            System.out.println("Created ." + jsFolder);
        }
        if (dir2.equals("Y")){
            new File(cssFolder).mkdirs();
            System.out.println("Created ." +cssFolder);
        }
    }
    public static void createHtml(String a, String n) throws FileNotFoundException {
        String htmlPath = ("src/main/java/ex43/" + n +"/index.html");
        File html = new File(htmlPath);
        String htmlData = String.format("<title>%s</title>\n<meta name=\"author\" content=\"%s\">", n,a);
        PrintWriter writer = new PrintWriter(html);
        writer.write(htmlData);
        writer.close();
        System.out.println("Created ." + htmlPath);
    }
}
