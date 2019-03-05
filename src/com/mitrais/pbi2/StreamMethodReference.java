package com.mitrais.pbi2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StreamMethodReference {
    public void startStream(){
        List<String> traineeLists= Arrays.asList("Restu","Lukas",
                "Hanif","Denny","Dimas","Winda","Reni","Robert","Rezki","Rafif");

        traineeLists
                .stream()
                .map(String::toLowerCase) //all string converted into lower case
                .filter(s->s.startsWith("d") || s.startsWith("w")) // search start with
                .map(String::toUpperCase) //convert it again to all uppercase
                .sorted(Collections.reverseOrder()) //sort / order it descending
                .forEach(System.out::println);
    }
}
