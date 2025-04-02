package pojo.javaprograms;

import java.util.Arrays;
import java.util.List;

public class ArraySort {
    public static void main(String[] args) {
        Integer[] array = {2,6,1,4,9};
        ArraySort.arraySort(array);


    }

    public static void arraySort(Integer[] array){
        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
             if(array[i]>array[j]){
                 int temp =array[i];
                 array[i] =array[j];
                 array[j]=temp;
                }
            }
        }

       List<Integer> list = Arrays.asList(array);
               list.stream().forEach(s->System.out.println(s));


    }
}
