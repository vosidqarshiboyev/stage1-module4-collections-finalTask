package com.epam.mjc.collections.combined;

import java.util.*;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Collection<Integer> number=new ArrayList<>();
        ArrayList<Integer>numbers=new ArrayList<>();
        for(Integer i :number){
            numbers.add(i);
        }
        HashMap<Integer,Set<String>>result=new HashMap<>();
        for(String a:sourceMap.keySet()){
            numbers.add(a.length());
        }
        for(int i = 0; i<numbers.size(); i++){
            Set<String>a=new HashSet<>();
            for(String word:sourceMap.keySet()){
                if(word.length()==numbers.get(i)){
                    a.add(word);
                }
            }
            result.put(numbers.get(i),a);
        }
        return result;
    }
}
