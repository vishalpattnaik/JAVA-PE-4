/*program to count the total number of occurrences of a given character in a string without using any loop?*/

package com.stackroute.p4;

public class CountOccurence {

    public int checkOccurence(String sentence, char searchCharacter) {

        if(sentence == "") {
            return -1;
        }

        String search = searchCharacter + "";   //convert caracter to string
        int sentenceLength = sentence.length(); //calculate length of sentence
        String newString = sentence.replaceAll(search, ""); //replace 'a' in new string with blank space
        int newStringLength = newString.length();   //calculate length of new string
        return sentenceLength - newStringLength;    //return difference of both the string lengths

    }


}
