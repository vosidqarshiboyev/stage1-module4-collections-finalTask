package com.epam.mjc.collections.combined;

import java.util.*;

public class LessonsGetter {
    public Set<String> getLessons(Map<String, List<String>> timetable) {
        HashSet<String>result=new HashSet<>();
        for(Map.Entry<String,List<String>>a:timetable.entrySet()){
            List<String>b=a.getValue();
            result.addAll(b);
        }
        return result;
    }


}
