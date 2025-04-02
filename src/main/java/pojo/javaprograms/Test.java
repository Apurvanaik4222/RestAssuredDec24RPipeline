package pojo.javaprograms;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        String name ="ApurvaNaik";
        minMaxArray(name);


    }

    public static void minMaxArray(String name){
 name =name.toLowerCase();
        Map<Character,Integer> map =new HashMap<>();
 for(int i=0;i<name.length();i++){

     if(map.containsKey(name.charAt(i))){
         map.put(name.charAt(i),map.get(name.charAt(i))+1);

     }
     else {
         map.put(name.charAt(i), 1);
     }

 }
        for(Map.Entry<Character,Integer> entry :map.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }


    }
}
