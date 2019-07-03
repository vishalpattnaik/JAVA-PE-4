/*find the presence of the name Harry in a string.*/

package com.stackroute.p4;

public class PresenceOfWord {

    public boolean checkWordPresence(String sentence) {

        if(sentence.contains("Harry")) {    //search for the word Harry and return true or false

            return true;
        }

        return false;
    }

}
