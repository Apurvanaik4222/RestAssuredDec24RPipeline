package pojo.javaprograms;

public class AdjArraDiff {
    public static void main(String[] args) {
        int [] array={1,4,8,15,17};
        int diff =AdjArraDiff.arryDiff(array);
        System.out.println(diff);


    }

    public static int arryDiff(int [] array){
int diff =array[0];
        for(int i=0;i<array.length-1;i++){
                if(array[i+1]-array[i]>diff){
                    diff =array[i+1]-array[i];
                }

        }
        return diff;



    }
}
