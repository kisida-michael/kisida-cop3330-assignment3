package ex46;
/*
*  UCF COP3330 Fall 2021 Assignment 3 Solution
*  Copyright 2021 Michael Kisida
*
* --------------------------------------------------------
* Pseudocode
*
* Main
*string file input
* split string at every space
* create a new hashMap
* string values to hash meap
* call sortMap function to sort from greatest to least
* display Hashmap
*
*/
import java.io.IOException;
import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;


public class App {
    public static void main(String[] args) throws IOException {
        String fileInput = "src/exercise46_input.txt";
        String str;
        str = file(fileInput);
        String [] arr = str.split(" ");
        Map<String, Integer> map = new HashMap<>();

        for (int i=0 ; i < arr.length ; i++){
            if (!map.containsKey(arr[i])){
                map.put(arr[i],1);
            } else{
                map.put(arr[i],map.get(arr[i])+1);
            }
        }
        Map sortMap = valueSort(map);
        Set set = sortMap.entrySet();
        Iterator i = set.iterator();
        while (i.hasNext()) {
            Map.Entry mp = (Map.Entry) i.next();
            System.out.print(mp.getKey() + ": ");
            int counter = (int) mp.getValue();
            for (int j = 0; j < counter; j++ ){
                System.out.print("*");
            }
            System.out.println();
            }

    }
    public static <S, I extends Comparable<I> > Map<S, I>
    valueSort(final Map<S, I> map)
    {
        Comparator<S> valueComparator = new Comparator<S>() {
            public int compare(S s2, S s1)
            {
                int comp = map.get(s1).compareTo(
                        map.get(s2));
                if (comp == 0)
                    return 1;
                else
                    return comp;
            }

        };
        Map<S, I> sorted = new TreeMap<S, I>(valueComparator);
        sorted.putAll(map);
        return sorted;
    }

    public static String file(String filename) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader(filename));
        StringBuilder stringBuilder = new StringBuilder();
        String str;
        while ((str = br.readLine()) != null){
            stringBuilder.append(str);

        }
        String newStr = stringBuilder.toString();
        newStr = newStr.replaceAll("\n", "");
        // System.out.println(newStr);
        return stringBuilder.toString();
    }

}