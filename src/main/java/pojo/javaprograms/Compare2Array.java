package pojo.javaprograms;

import java.util.ArrayList;
import java.util.List;

public class Compare2Array {
    public static void main(String[] args) {

        int [] array1 = {1,4,5,7};
        int [] array2 = {0,4,3,7};
        List<Integer> list =arrayCompare(array1,array2);
        list.stream().forEach(s->System.out.println(s));

    }

    public  static List<Integer> arrayCompare(int[] array1, int[] array2){
        List<Integer> list =new ArrayList<Integer>();
        for(int i=0;i<array1.length;i++){
            if(array1[i]==(array2[i])){
                list.add(array1[i]);

            }
        }
        return list;
    }
}
