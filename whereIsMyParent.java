package com.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;

public class whereIsMyParent {
    static String findChildren(final String text) {
        String[] splitedText = text.toLowerCase().split("") ;
        ArrayList<String> array = new ArrayList<>() ;
        Arrays.sort(splitedText) ;

        for (int i = 0; i < splitedText.length -1; i++) {
            splitedText[0] = splitedText[0] ;
            array.add(splitedText[i]) ;
            if(!splitedText[i].toLowerCase().equals(splitedText[i+1]))
                array.set(i, splitedText[i+1].toUpperCase());
        }
        String string  = array.stream().map(Objects::toString).collect(Collectors.joining(""));
        String newString =  splitedText[0].toUpperCase() + string ;
        return newString;
    }
}
