package pojo.javaprograms;

import java.util.HashMap;
import java.util.Map;

public class NumberofOcuurence {
    public static void main(String[] args) {

        String str = "Alice is girl and Bob is boy and I am boy";
        countOccurence(str);
    }

    public static void countOccurence(String str){
       String[] words = str.toLowerCase().split(" ");

        Map<String,Integer> map =new HashMap<>();

        for(String word :words){

            if(map.containsKey(word)){
                map.put(word,map.get(word)+1);
            }
            else
                map.put(word,1);
        }

      for(Map.Entry<String,Integer> entry : map.entrySet()){
          System.out.println(entry.getKey() + " : " + entry.getValue());
      }


    }
}
