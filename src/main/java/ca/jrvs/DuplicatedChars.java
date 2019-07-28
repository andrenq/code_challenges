package ca.jrvs;
import java.util.HashMap;
import java.util.Map;

public class DuplicatedChars {
    public static HashMap isDuplicated(char[] chars){
        HashMap<Character, Integer > cMap = new HashMap();
        HashMap<Character, Integer > rMap = new HashMap();
        for (char c: chars){
            if(cMap.containsKey(c)){
                cMap.put(c,cMap.get(c)+1);
            }else {
                cMap.put(c,1);
            }
        }
        for (Map.Entry<Character,Integer> entry: cMap.entrySet()){
            if((entry.getValue()>=2)){
                rMap.put(entry.getKey(),entry.getValue());
            }

        }
        return rMap;
    }

}
