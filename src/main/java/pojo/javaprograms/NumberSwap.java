package pojo.javaprograms;

public class NumberSwap {
    public static void main(String[] args) {

        int a=6;
        int b=8;
        swapwithTemp(a,b);
        swapwithoutTemp(a,b);
    }

    public static void swapwithTemp(int a, int b){
        int temp =a;
        a=b;
        b=temp;
        System.out.println("a="+a);
        System.out.println("b="+b);

    }
    public static void swapwithoutTemp(int a, int b){
        a=a+b;//14
        b=a-b;//14-8=6
        a=a-b;//14-6=8
        System.out.println("a="+a);
        System.out.println("b="+b);

    }

}
