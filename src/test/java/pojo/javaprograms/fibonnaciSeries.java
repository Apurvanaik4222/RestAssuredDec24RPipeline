package pojo.javaprograms;

public class fibonnaciSeries {
    public static void main(String[] args) {

        // 1 2 3 5 8 13 21 34 55
        fibonnaci(9);


    }

    public static void fibonnaci(int num){
        int num1 =0;
        int num2 =1;
        int k=1;
        while(k<=num){
            int finalNum =num1+num2;
            System.out.println(finalNum);
            num1=num2;
            num2=finalNum;



            k++;
        }

    }
}
