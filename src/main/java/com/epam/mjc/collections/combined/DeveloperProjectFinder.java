package com.epam.mjc.collections.combined;

import java.util.*;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        List<String>result=new ArrayList<>();
        for(String key:projects.keySet()){
            if(projects.get(key).contains(developer)){
                result.add(key);
            }
        }
        Collections.sort(result);
        
        return result;
    }
}
