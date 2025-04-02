package pojo.javaprograms;

public class ReverseNum {
    public static void main(String[] args) {

        int num =543;
        System.out.println(reverseNum(num));
    }

    public static int reverseNum(int num){
     int reverseNum =0;

        while(num!=0){
            int digit =num%10;
            reverseNum =digit+reverseNum*10;
            num =num/10;
        }
        return reverseNum;
    }
}
