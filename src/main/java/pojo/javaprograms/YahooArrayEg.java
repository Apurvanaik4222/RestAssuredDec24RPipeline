package pojo.javaprograms;

public class YahooArrayEg {
    public static void main(String[] args) {

        int[][] array={{2,4,5},{3,7,5},{1,0,9}};
     int maxNum =   arrayEg(array);
     System.out.println(maxNum);


    }


    public static int arrayEg(int[][] array){
        int minNum =array[0][0];
        int minNumCol =0 ;
        for(int i=0;i<array.length;i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i][j] < minNum) {
                    minNum = array[i][j];
                    minNumCol = j;
                }
            }
        }

            int k=0;
            int maxNum=0;
            while(k<3){
                if(array[k][minNumCol]>maxNum){
                    maxNum =array[k][minNumCol];
                }

                k++;
            }

        return maxNum;


    }
}
