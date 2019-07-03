/*to find out the multiple occurrences of the given word in a string using Matcher methods.*/

package com.stackroute.p4;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class FindMultipleOccurrence {

    public String findOccurence(String text, String word) {

        if(text == "")      //check for null empty string
            return null;

        String res = "";
        Pattern pattern = Pattern.compile(word);
        Matcher matcher = pattern.matcher(text);

        while(matcher.find()) {

            res = res + "Found at: " + matcher.start() + " - " + matcher.end() + "\n"; //store the resultant string in res variable

        }

        return res;

    }
}
