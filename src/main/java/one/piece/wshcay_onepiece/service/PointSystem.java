package one.piece.wshcay_onepiece.service;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class PointSystem {

    Map<String, Integer> strawHatPointSystem = new HashMap<>();
    Integer default_value = 0;

    public void addCharacters(){
        strawHatPointSystem.put("Luffy",default_value);
        strawHatPointSystem.put("Nami",default_value);
        strawHatPointSystem.put("Zoro",default_value);
        strawHatPointSystem.put("Franky",default_value);
        strawHatPointSystem.put("Brooke",default_value);
        strawHatPointSystem.put("Chopper",default_value);
        strawHatPointSystem.put("Jinbe",default_value);
        strawHatPointSystem.put("Sanji",default_value);
        strawHatPointSystem.put("Robin",default_value);
        strawHatPointSystem.put("Usopp",default_value);

    }

    public void addPoint(String strawHatMember, Integer points){
        int currentPoints = strawHatPointSystem.get(strawHatMember);
        strawHatPointSystem.put(strawHatMember,currentPoints + points );
    }

    public void viewList(){
        System.out.println(strawHatPointSystem);
    }

    public String getMax(){

    Map.Entry<String,Integer> maxEntry = Collections.max(strawHatPointSystem.entrySet(), Map.Entry.comparingByValue());
    System.out.println(maxEntry.getKey());

    return maxEntry.getKey();

    }

}