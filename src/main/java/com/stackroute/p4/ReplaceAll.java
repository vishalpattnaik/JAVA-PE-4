/*Program to replace all d with f and l with t*/

package com.stackroute.p4;

public class ReplaceAll {

    public String replaceCharacterInString(String myString) {

        if(myString == "")
            return null;

        String res = myString.replaceAll("d", "f"); //replace all d with f
        res = res.replaceAll("l", "t"); //replace all l with t
        return res;

    }

}
