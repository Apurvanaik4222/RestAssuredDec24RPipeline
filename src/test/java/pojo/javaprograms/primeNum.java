package pojo.javaprograms;

public class primeNum {
    public static void main(String[] args) {
        primeNumEg(13);

    }

    public static void primeNumEg(int num){
        Boolean flag =false;
        for(int i=2;i<num/2;i++){
            if(num%i==0){
                flag =true;
                break;
            }

        }

        if(flag)
            System.out.println(num+" is not a prime number");
        else
            System.out.println(num+" is a prime number");


    }
}
