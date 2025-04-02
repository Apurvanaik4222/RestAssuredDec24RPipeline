package pojo.javaprograms;

public class Multiply {
    public static void main(String[] args) {
        Multiply.multipl(5);


    }

    public static void multipl(int num){

        int k=1;
        int sum =num;
        while(k<=10){
            System.out.println(num+"*"+k+"=" +sum);
            sum =sum+num;
            k++;


        }
    }
}
