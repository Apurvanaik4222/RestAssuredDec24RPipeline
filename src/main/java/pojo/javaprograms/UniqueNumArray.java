package pojo.javaprograms;

import java.util.ArrayList;
import java.util.List;

public class UniqueNumArray {
    public static void main(String[] args) {
        int [] array={1,3,4,5,6,9,5,0,2,1,2,3,3,4,4,4,6,1};
        uniqueNumArray(array);
    }

    public static void uniqueNumArray(int [] array) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < array.length; i++) {
            int k = 0;
            if (!list.contains(array[i])) {
                list.add(array[i]);
                k++;
                for (int j = i + 1; j < array.length; j++) {
                    if (array[j] == array[i]) {
                        k++;
                    }

                }
                if (k == 1)
                    System.out.println(array[i] + "is a unique number");

            }
        }
    }

}
