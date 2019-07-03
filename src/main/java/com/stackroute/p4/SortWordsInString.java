/*Extract the words from the text and sort them into alphabetical order. Display the sorted list of words.*/

package com.stackroute.p4;

import java.util.Arrays;

public class SortWordsInString {

    public String sortWords(String paragraph) {

            if(paragraph == "")
                return null;

            String[] strArr = paragraph.split(" ");   //split string into string array

            String output="";
            Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER);    //sort the array
            for(String a:strArr)    //create a for each loop to loop through the string array
            {
                output=output.concat(a).concat(" ");
            }

            return output.trim();   //return the string

    }

}
