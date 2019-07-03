/*program to transpose the given string.*/

package com.stackroute.p4;

public class StringTranspose {

    public String stringTranspose(String queryString) {

        if(queryString == "")
            return null;

        String[] strArr = queryString.split(" ");   //split the string with space
        String res = "";
        String reverse="";
        for(String str:strArr) {    //loop through the string

            for(int j=str.length()-1; j>=0; j--) {

                reverse = reverse + str.charAt(j);  //find out the reverse

            }

            res = res.concat(reverse).concat(" ");  //concat the reverse word with a a string
            reverse = "";

        }

        return res.trim();  //return the string by removing any trailing white spaces with trim()
    }


}
