package pojo.javaprograms;

public class minMaxArrayNum {
    public static void main(String[] args) {
        int[][] array ={{2,4,5},{3,4,7},{1,2,0}};
        int minNum =minMaxArray(array);
        System.out.print(minNum);

    }

    public static int minMaxArray(int [][] array){
        int minNum =array[0][0];
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array.length;j++){
                if(array[i][j]>minNum){
                    minNum=array[i][j];
                }
            }
        }
        return minNum;

    }
}
