public class Test {
    public static void main(String[] args) {

        int number =Integer.parseInt(args[0]);
        System.out.println("Entered Number :" + number);

        for(int i=1;i<=number;i++){
            System.out.println("Square of "+i+" is: "+i*i);

        }
    }
}
