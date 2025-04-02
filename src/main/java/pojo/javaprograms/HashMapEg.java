package pojo.javaprograms;

import java.util.HashMap;
import java.util.Map;

public class HashMapEg {
    public static void main(String[] args) {
        hashMapEg();


    }

    public static void hashMapEg(){
     Map<Integer,String> map =new HashMap<>();
     map.put(1,"Apurva");
        map.put(2,"Naik");
        map.put(3,"is");
        map.put(4,"a");


        for(Map.Entry<Integer,String> entry :map.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }



    }
}

